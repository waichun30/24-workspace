/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository;

import com.center.tool.entity.model.MerchantProdCategoryDO;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryRepository.java, v 0.1 2020-11-14 19:00 wb-phoonwaic553932 Exp $$
 */
public interface MerchantProdCategoryRepository {

    List<MerchantProdCategoryDO> getMerchantProdCategoryDOByMerchantCode(String merchantCode);

}