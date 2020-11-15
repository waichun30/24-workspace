/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository;

import com.center.tool.entity.model.ProductDO;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductRepository.java, v 0.1 2020-11-09 20:22 wb-phoonwaic553932 Exp $$
 */
public interface ProductRepository {

    ProductDO getProductByProductCode(String code);

    List<ProductDO> getProductByMerchantCode(String code);

    List<ProductDO> getProductByMerchantCodeAndCategory(String code, String categoryCode);

}
