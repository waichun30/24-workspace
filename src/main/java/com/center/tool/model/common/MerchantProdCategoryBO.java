/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.common;

import lombok.Data;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryBO.java, v 0.1 2020-11-14 18:59 wb-phoonwaic553932 Exp $$
 */
@Data
public class MerchantProdCategoryBO {

    private String merchantCode;

    private String categoryCode;

    private String categoryName;

    private int sort;

}
