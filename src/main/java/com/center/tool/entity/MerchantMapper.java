/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity;

import com.center.tool.entity.model.MerchantDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantMapper.java, v 0.1 2020-11-09 20:05 wb-phoonwaic553932 Exp $$
 */
@Mapper
public interface MerchantMapper {

    /**
     * get merchantDO by merchantCode
     * @param code
     * @return
     */
    MerchantDO getMerchantDoByMerchantCode(String code);

}