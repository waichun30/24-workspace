/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.dto;

import lombok.Data;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryDTO.java, v 0.1 2020-11-14 19:18 wb-phoonwaic553932 Exp $$
 */
@Data
public class MerchantProdCategoryDTO {

    private String merchantCode;

    private String categoryCode;

    private String categoryName;

    private String amount;

    private Long sort;

}
