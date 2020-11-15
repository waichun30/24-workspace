/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.impl;

import com.center.tool.entity.model.MerchantProdCategoryDO;
import com.center.tool.entity.model.ProductDO;
import com.center.tool.entity.model.QrCodeDO;
import com.center.tool.entity.repository.MerchantProdCategoryRepository;
import com.center.tool.entity.repository.ProductRepository;
import com.center.tool.entity.repository.QrCodeRepository;
import com.center.tool.mappers.MerchantProdCategoryMapper;
import com.center.tool.mappers.ProductMapper;
import com.center.tool.model.common.ProductBO;
import com.center.tool.model.common.QrCodeBO;
import com.center.tool.model.dto.MerchantProdCategoryDTO;
import com.center.tool.model.dto.ProductDTO;
import com.center.tool.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductServiceImpl.java, v 0.1 2020-11-09 20:26 wb-phoonwaic553932 Exp $$
 */
@Service
@CacheConfig(cacheNames = "cache_biz_product")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private QrCodeRepository qrCodeRepository;

    @Autowired
    private MerchantProdCategoryRepository merchantProdCategoryRepository;

    @Override
    public List<ProductBO> getProductByMerchantCodeAndType(String merchantCode, String type) {

        return ProductMapper.INSTANCE.toBOList( productRepository.getProductByMerchantCodeAndCategory(merchantCode, type));


    }

    @Override
    public List<ProductDTO> getProductByQrCode(String qrCode) {

        QrCodeDO qrCodeDO = qrCodeRepository.getQrCodeByQrCode(qrCode);

        List<ProductDO> productDOList = productRepository.getProductByMerchantCode(qrCodeDO.getMerchantCode());




        return ProductMapper.INSTANCE.toDTOList(ProductMapper.INSTANCE.toBOList(productDOList));
    }

    @Override
    @Cacheable(key = "#qrCode")
    public List<MerchantProdCategoryDTO> getMerchantProdCategoryByQrCode(String qrCode) {
        QrCodeDO qrCodeDO = qrCodeRepository.getQrCodeByQrCode(qrCode);
        List<MerchantProdCategoryDO> merchantProdCategoryDOList = merchantProdCategoryRepository.getMerchantProdCategoryDOByMerchantCode(qrCodeDO.getMerchantCode());

        return MerchantProdCategoryMapper.INSTANCE.toDTOList(MerchantProdCategoryMapper.INSTANCE.toBOList(merchantProdCategoryDOList));

    }
}
