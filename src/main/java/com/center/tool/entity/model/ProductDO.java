/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.model;

import lombok.Data;

import java.util.Date;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductDO.java, v 0.1 2020-11-09 20:37 wb-phoonwaic553932 Exp $$
 */
@Data
public class ProductDO {

    private String productCode;

    private String merchantCode;

    private String productName;

    private String productImgPath;

    private String productDescription;

    private String productCurrency;

    private String productAmount;

    private String productStatus;

    private String categoryCode;

    private Date createdTime;

    private Date modifiedTime;

    private String extendInfo;

}
