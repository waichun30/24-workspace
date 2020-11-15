/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.model;

import lombok.Data;

import java.util.Date;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryDO.java, v 0.1 2020-11-14 18:58 wb-phoonwaic553932 Exp $$
 */
@Data
public class MerchantProdCategoryDO {

    private String merchantCode;

    private String categoryCode;

    private String categoryName;

    private int sort;

    private Date createdTime;

    private Date modifiedTime;

    private String extendInfo;
}
