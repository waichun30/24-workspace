/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity;

import com.center.tool.entity.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderMapper.java, v 0.1 2020-11-11 03:33 wb-phoonwaic553932 Exp $$
 */
@Mapper
public interface OrderMapper {

    OrderDO getOrderByQrCode(String qrCode);
}