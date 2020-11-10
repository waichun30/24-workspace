/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller;

import com.center.tool.controller.base.AbstractController;
import com.center.tool.model.common.ProductBO;
import com.center.tool.model.response.ProductListResponse;
import com.center.tool.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wb-phoonwaic553932
 * @version $Id: TestController.java, v 0.1 2020-11-04 15:17 wb-phoonwaic553932 Exp $$
 */
@RestController
@CrossOrigin
public class TestController extends AbstractController {

    @Autowired
    private ProductService productService;

    private static final String[] REQUIRED = {"type"};

    @PostMapping(value = "/1.0/test/status", produces = "application/json")
    public void handle(@RequestBody String jsonRequest, HttpServletResponse response, HttpServletRequest request) throws Exception {
        sendResponse(parseResponse(jsonRequest, request), response);
    }

    @Override
    protected Map<String, Object> doService(Object o) {

        Map<String, Object> respMap = new HashMap<>();

        String type = (String) getObject(o, "type");

        List<ProductBO> productList = productService.getProductByMerchantCodeAndType("1", type);

        ProductListResponse productListResponse = new ProductListResponse();
        productListResponse.setProductsList(productList);

        respMap.put("productList", productListResponse);

        return respMap;
    }

    @Override
    protected String[] requiredField() {
        return REQUIRED;
    }
}
