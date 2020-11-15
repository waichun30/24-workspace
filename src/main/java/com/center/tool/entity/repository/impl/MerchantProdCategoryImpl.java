/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository.impl;

import com.center.tool.entity.MerchantProdCategoryMapper;
import com.center.tool.entity.model.MerchantProdCategoryDO;
import com.center.tool.entity.repository.MerchantProdCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryImpl.java, v 0.1 2020-11-14 19:01 wb-phoonwaic553932 Exp $$
 */
@Service
public class MerchantProdCategoryImpl implements MerchantProdCategoryRepository {

    @Autowired
    private MerchantProdCategoryMapper merchantProdCategoryMapper;

    @Override
    public List<MerchantProdCategoryDO> getMerchantProdCategoryDOByMerchantCode(String merchantCode) {
        return merchantProdCategoryMapper.getMerchantProdCategoryDOByMerchantCode(merchantCode);
    }
}
