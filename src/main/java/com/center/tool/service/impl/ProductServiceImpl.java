/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.impl;

import com.center.tool.entity.model.ProductDO;
import com.center.tool.entity.repository.ProductRepository;
import com.center.tool.model.common.ProductBO;
import com.center.tool.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductServiceImpl.java, v 0.1 2020-11-09 20:26 wb-phoonwaic553932 Exp $$
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductBO> getProductByMerchantCodeAndType(String merchantCode, String type) {

        List<ProductDO> productDOList = productRepository.getProductByMerchantCodeAndType(merchantCode, type);

        List<ProductBO> productList = new ArrayList<>();

        // TODO map struct Mapper, ald import dependency
        for(ProductDO productDO: productDOList){
            ProductBO product = new ProductBO();
            product.setItemName(productDO.getProductName());
            product.setItemImgPath(productDO.getProductImgPath());
            product.setItemPrice(productDO.getProductAmount());
            productList.add(product);
        }

        return productList;


    }
}
