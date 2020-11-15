/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller;

import com.center.tool.controller.base.AbstractController;
import com.center.tool.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb-phoonwaic553932
 * @version $Id: AddShopCartController.java, v 0.1 2020-11-14 22:04 wb-phoonwaic553932 Exp $$
 */
@RestController
@CrossOrigin
public class AddShopCartController extends AbstractController {

    @Autowired
    OrderProductService orderProductService;

    private static final String[] REQUIRED = {"cartId", "productCode", "quantity", "memo"};

    @PostMapping(value = "/1.0/prod/add/cart", produces = "application/json")
    public void handle(@RequestBody String jsonRequest, HttpServletResponse response, HttpServletRequest request) throws Exception {
        sendResponse(parseResponse(jsonRequest, request), response);
    }


    @Override
    protected String[] requiredField() {
        return REQUIRED;
    }

    @Override
    protected Map<String, Object> doService(Object o) {

        Map<String, Object> respMap = new HashMap<>();

        String cartId = (String) getObject(o,"cartId");
        String productCode = (String) getObject(o,"productCode");
        String quantity = (String) getObject(o,"quantity");
        String memo = (String) getObject(o,"memo");

        orderProductService.updateOrderProduct(cartId, productCode, quantity, memo);

        respMap.put("OK","OK");

        return respMap;

    }
}
