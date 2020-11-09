/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wb-phoonwaic553932
 * @version $Id: TestOrderController.java, v 0.1 2020-11-09 23:57 wb-phoonwaic553932 Exp $$
 */
@RestController
@CrossOrigin
public class TestOrderController  {


    @GetMapping(value = "/1.0/test/order/{orderId}", produces = "application/json")
    public String a(@PathVariable("orderId") String orderId){
        return orderId;
    }

}
