/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.dto;

import lombok.Data;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductDTO.java, v 0.1 2020-11-14 17:23 wb-phoonwaic553932 Exp $$
 */
@Data
public class ProductDTO {

    private String productCode;

    private String merchantCode;

    private String productName;

    private String merchantName;

    private Double productPrice;

    private Double productOriPrice;

    private String productDescription;

    private String productImgPath;

    private String productStatus;

    private String categoryCode;
}
