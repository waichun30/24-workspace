/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository.impl;

import com.center.tool.entity.OrderProductMapper;
import com.center.tool.entity.model.OrderProductDO;
import com.center.tool.entity.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderProductRepositoryImpl.java, v 0.1 2020-11-11 03:35 wb-phoonwaic553932 Exp $$
 */
@Service
public class OrderProductRepositoryImpl implements OrderProductRepository {

    @Autowired
    private OrderProductMapper orderProductMapper;

    @Override
    public List<OrderProductDO> getOrderProductByOrderCode(String orderCode) {
        return orderProductMapper.getOrderProductByOrderCode(orderCode);
    }

    @Override
    public void updateOrderProduct(String orderCode, String productCode, String quantity, String memo) {
        orderProductMapper.updateOrderProduct(orderCode, productCode, quantity, memo);
    }


}
