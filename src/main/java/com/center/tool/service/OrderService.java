/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service;

import com.center.tool.model.common.OrderBO;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderService.java, v 0.1 2020-11-11 03:37 wb-phoonwaic553932 Exp $$
 */
public interface OrderService {

    OrderBO getOrderByQrCode(String qrCode);
}