/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller;

import com.center.tool.controller.base.AbstractController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderDetailController.java, v 0.1 2020-11-14 17:15 wb-phoonwaic553932 Exp $$
 */
@RestController
@CrossOrigin
public class OrderDetailController extends AbstractController {

    @GetMapping(value = "/1.0/test/order/detail/{orderId}", produces = "application/json")
    public void testOrder(@PathVariable("orderId") String orderId, HttpServletResponse response, HttpServletRequest request) throws Exception {
        sendResponse(parseResponse(orderId, request), response);
    }

    @Override
    protected String[] requiredField() {
        return null;
    }

    @Override
    protected Map<String, Object> doService(Object o) {
        return null;
    }
}
