/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.model;

import lombok.Data;

import java.util.Date;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderProductDO.java, v 0.1 2020-11-11 03:30 wb-phoonwaic553932 Exp $$
 */
@Data
public class OrderProductDO {

    private String orderProductCode;

    private String orderCode;

    private String productCode;

    private String quantity;

    private String memo;

    private Date createdTime;

    private Date modifiedTime;

    private String extendInfo;

}
