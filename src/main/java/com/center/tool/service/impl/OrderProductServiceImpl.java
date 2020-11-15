/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.impl;

import com.center.tool.entity.model.OrderDO;
import com.center.tool.entity.model.OrderProductDO;
import com.center.tool.entity.model.ProductDO;
import com.center.tool.entity.repository.OrderProductRepository;
import com.center.tool.entity.repository.OrderRepository;
import com.center.tool.entity.repository.ProductRepository;
import com.center.tool.model.common.OrderProductBO;
import com.center.tool.model.common.ProductBO;
import com.center.tool.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderProductServiceImpl.java, v 0.1 2020-11-11 03:38 wb-phoonwaic553932 Exp $$
 */
@Service
public class OrderProductServiceImpl implements OrderProductService {

    @Autowired
    private OrderProductRepository orderProductRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderProductBO> getOrderProductByOrderCode(String orderCode) {

        List<OrderProductBO> orderProductBOList = new ArrayList<>();

        List<OrderProductDO> orderProductDOList = orderProductRepository.getOrderProductByOrderCode(orderCode);

        for (OrderProductDO orderProductDO : orderProductDOList) {
            OrderProductBO orderProductBO = new OrderProductBO();

            ProductDO productDO = productRepository.getProductByProductCode(orderProductDO.getProductCode());

            ProductBO productBO = new ProductBO();
//            productBO.setItemPrice(productDO.getProductAmount());
//            productBO.setItemImgPath(productDO.getProductImgPath());
//            productBO.setItemName(productDO.getProductName());

            orderProductBO.setProductBO(productBO);
            orderProductBO.setQuantity(orderProductDO.getQuantity());
            orderProductBO.setMemo(orderProductDO.getMemo());

            orderProductBOList.add(orderProductBO);
        }

        return orderProductBOList;
    }

    @Override
    public void updateOrderProduct(String orderCode, String productCode, String quantity, String memo) {

        ProductDO productDO = productRepository.getProductByProductCode(productCode);

        OrderDO orderDO = orderRepository.getOrderByOrderCode(orderCode);

        int amount = (Integer.parseInt(productDO.getProductAmount()) * 3) + orderDO.getAmount();

        orderRepository.updateOrderAmountByCode(orderCode, amount);

        orderProductRepository.updateOrderProduct(orderCode, productCode, quantity, memo);
    }
}
