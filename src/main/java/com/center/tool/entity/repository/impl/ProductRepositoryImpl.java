/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository.impl;

import com.center.tool.entity.model.ProductDO;
import com.center.tool.entity.ProductMapper;
import com.center.tool.entity.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductService.java, v 0.1 2020-11-09 01:07 wb-phoonwaic553932 Exp $$
 */
@Service
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductDO getProductByProductCode(String code) {
        return productMapper.getProductDoByProductCode(code);
    }

    @Override
    public List<ProductDO> getProductByMerchantCode(String code) {
        return productMapper.getProductDoByMerchantCode(code);
    }

    @Override
    public List<ProductDO> getProductByMerchantCodeAndCategory(String code, String type) {
        return productMapper.getProductDoByMerchantCodeAndCategory(code, type);
    }

}
