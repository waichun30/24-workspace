/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository;

import com.center.tool.entity.model.OrderProductDO;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderProductRepository.java, v 0.1 2020-11-11 03:34 wb-phoonwaic553932 Exp $$
 */
public interface OrderProductRepository {

    List<OrderProductDO> getOrderProductByOrderCode(String orderCode);

}