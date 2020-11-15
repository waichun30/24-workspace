/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity;

import com.center.tool.entity.model.OrderProductDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderProductMapper.java, v 0.1 2020-11-11 03:33 wb-phoonwaic553932 Exp $$
 */
@Mapper
public interface OrderProductMapper {

    List<OrderProductDO> getOrderProductByOrderCode(String orderCode);

    void updateOrderProduct(String orderCode, String productCode, String quantity, String memo);
}