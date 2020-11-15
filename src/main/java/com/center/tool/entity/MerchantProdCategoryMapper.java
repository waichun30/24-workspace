/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity;

import com.center.tool.entity.model.MerchantProdCategoryDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryMapper.java, v 0.1 2020-11-14 19:02 wb-phoonwaic553932 Exp $$
 */
@Mapper
public interface MerchantProdCategoryMapper {

    List<MerchantProdCategoryDO> getMerchantProdCategoryDOByMerchantCode(String merchantCode);


}
