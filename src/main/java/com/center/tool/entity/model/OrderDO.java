/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.model;

import lombok.Data;

import java.util.Date;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderDO.java, v 0.1 2020-11-11 03:24 wb-phoonwaic553932 Exp $$
 */
@Data
public class OrderDO {

    private String orderCode;

    private String merchantCode;

    private String qrCode;

    private String orderStatus;

    private Date createdTime;

    private Date modifiedTime;

    private String extendInfo;

}
