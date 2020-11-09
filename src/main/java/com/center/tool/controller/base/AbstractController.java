/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller.base;

import com.alibaba.fastjson.JSON;
import com.center.tool.logging.Loggers;
import com.center.tool.logging.LoggingUtil;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.util.StringUtils;

/**
 * @author wb-phoonwaic553932
 * @version $Id: AbstractController.java, v 0.1 2020-11-07 03:27 wb-phoonwaic553932 Exp $$
 */
public abstract class AbstractController {


    protected String parseResponse(Object o) {
        LoggingUtil.info(Loggers.BIZ_HTTP, this.getClass().getSimpleName() + "Request - " + o);

        // TODO throw exception
        if (!StringUtils.isEmpty(requiredField())) {
            String json = JSON.toJSONString(o);
            try {
                checkMandatoryField(json);
            } catch (JSONException e) {
                e.printStackTrace();
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

    protected abstract String[] requiredField();

    protected abstract Object doService(Object o);
}
