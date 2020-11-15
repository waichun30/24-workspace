/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.mappers;

import com.center.tool.entity.model.MerchantProdCategoryDO;
import com.center.tool.model.common.MerchantProdCategoryBO;
import com.center.tool.model.dto.MerchantProdCategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryMapper.java, v 0.1 2020-11-14 19:19 wb-phoonwaic553932 Exp $$
 */
@Mapper
public interface MerchantProdCategoryMapper {

    MerchantProdCategoryMapper INSTANCE = Mappers.getMapper(MerchantProdCategoryMapper.class);


    MerchantProdCategoryBO toBO (MerchantProdCategoryDO merchantProdCategoryDO);

    MerchantProdCategoryDTO toDTO (MerchantProdCategoryBO merchantProdCategoryBO);

    List<MerchantProdCategoryBO> toBOList (List<MerchantProdCategoryDO> merchantProdCategoryDOList);

    List<MerchantProdCategoryDTO> toDTOList (List<MerchantProdCategoryBO> merchantProdCategoryBOList);



}
