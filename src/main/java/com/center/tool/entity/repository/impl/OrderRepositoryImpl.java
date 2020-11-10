/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository.impl;

import com.center.tool.entity.OrderMapper;
import com.center.tool.entity.model.OrderDO;
import com.center.tool.entity.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderRepositoryImpl.java, v 0.1 2020-11-11 03:35 wb-phoonwaic553932 Exp $$
 */
@Service
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderDO getOrderByQrCode(String qrCode) {
        return orderMapper.getOrderByQrCode(qrCode);
    }
}
