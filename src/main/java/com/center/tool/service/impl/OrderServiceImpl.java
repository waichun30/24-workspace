/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.impl;

import com.center.tool.entity.model.OrderDO;
import com.center.tool.entity.repository.OrderRepository;
import com.center.tool.model.common.OrderBO;
import com.center.tool.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderServiceImpl.java, v 0.1 2020-11-11 03:38 wb-phoonwaic553932 Exp $$
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderBO getOrderByQrCode(String qrCode) {

        OrderDO orderDO = orderRepository.getOrderByQrCode(qrCode);

        OrderBO orderBO = new OrderBO();
        orderBO.setOrderCode(orderDO.getOrderCode());

        return orderBO;
    }
}
