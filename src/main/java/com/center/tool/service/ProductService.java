/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service;

import com.center.tool.model.common.ProductBO;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductService.java, v 0.1 2020-11-09 20:25 wb-phoonwaic553932 Exp $$
 */
public interface ProductService {

    List<ProductBO> getProductByMerchantCodeAndType(String merchantCode, String type);

}