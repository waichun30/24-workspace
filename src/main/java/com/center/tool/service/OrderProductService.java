/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service;

import com.center.tool.model.common.OrderProductBO;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderProductService.java, v 0.1 2020-11-11 03:37 wb-phoonwaic553932 Exp $$
 */
public interface OrderProductService {

    List<OrderProductBO> getOrderProductByOrderCode(String orderCode);

}
