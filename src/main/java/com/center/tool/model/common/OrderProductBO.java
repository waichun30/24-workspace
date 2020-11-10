/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.common;

import lombok.Data;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderProductBO.java, v 0.1 2020-11-11 03:36 wb-phoonwaic553932 Exp $$
 */
@Data
public class OrderProductBO {

    private String orderProductCode;

    private String orderCode;

    private ProductBO productBO;

    private String quantity;

    private String memo;
}
