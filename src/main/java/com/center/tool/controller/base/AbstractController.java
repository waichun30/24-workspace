/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller.base;

import com.alibaba.fastjson.JSON;
import com.center.tool.logging.Loggers;
import com.center.tool.logging.LoggingUtil;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.util.Map;

/**
 * @author wb-phoonwaic553932
 * @version $Id: AbstractController.java, v 0.1 2020-11-07 03:27 wb-phoonwaic553932 Exp $$
 */
public abstract class AbstractController {


    protected String parseResponse(Object o, HttpServletRequest request) {

        LoggingUtil.info(Loggers.BIZ_HTTP, this.getClass().getSimpleName() + "Request - " + o);


        // TODO throw exception
        if (!StringUtils.isEmpty(requiredField())) {
            try {
                checkMandatoryField(o.toString());
            } catch (JSONException e) {
                return e.getMessage();
            }
        }

        String response = JSON.toJSONString(doService(o));
        LoggingUtil.info(Loggers.BIZ_HTTP, this.getClass().getSimpleName() + "Response - " + response);
        return response;
    }

    private void checkMandatoryField(String jsonString) throws JSONException {
        JSONObject json = new JSONObject(jsonString);
        for (String requiredField : requiredField()) {
            if (!json.has(requiredField)) {
                throw new JSONException("Missing Required Value : " + requiredField);
            }
        }
    }

    protected Object getObject(Object o, String field) {

        Object val = null;

        try {
            JSONObject json = new JSONObject(o.toString());
            val = json.has(field) ? json.get(field) : null;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return val;
    }

    /**
     * Send the response
     *
     * @param respData
     * @param response
     * @throws Exception
     */
    protected void sendResponse(String respData, HttpServletResponse response) throws Exception {
        Writer writer = response.getWriter();
        writer.write(respData);
        writer.flush();
        writer.close();
    }

    /**
     * get the list of required field
     *
     * @return
     */
    protected abstract String[] requiredField();

    /**
     * Apply all business logic over here
     *
     * @param o
     * @return
     */
    protected abstract Map<String, Object> doService(Object o);
}
