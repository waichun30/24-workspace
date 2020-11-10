/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller;

import com.center.tool.controller.base.AbstractController;
import com.center.tool.service.OrderProductService;
import com.center.tool.service.OrderService;
import com.center.tool.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb-phoonwaic553932
 * @version $Id: TestOrderController.java, v 0.1 2020-11-09 23:57 wb-phoonwaic553932 Exp $$
 */
@RestController
@CrossOrigin
public class TestOrderController extends AbstractController {

    @Autowired
    private QrCodeService qrCodeService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderProductService orderProductService;

    @GetMapping(value = "/1.0/test/order/{orderId}", produces = "application/json")
    public void testOrder(@PathVariable("orderId") String orderId, HttpServletResponse response, HttpServletRequest request) throws Exception {
        sendResponse(parseResponse(orderId, request), response);
    }

    @Override
    protected String[] requiredField() {
        return null;
    }

    @Override
    protected Map<String, Object> doService(Object o) {

        Map<String, Object> respMap = new HashMap<>();

        //TODO combine service

        String orderCode = orderService.getOrderByQrCode(o.toString()).getOrderCode();

        respMap.put("orderProductList", orderProductService.getOrderProductByOrderCode(orderCode));

        return respMap;
    }
}
