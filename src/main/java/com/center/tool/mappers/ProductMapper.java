/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.mappers;

import com.center.tool.entity.model.ProductDO;
import com.center.tool.model.common.ProductBO;
import com.center.tool.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProductMapper.java, v 0.1 2020-11-11 07:05 wb-phoonwaic553932 Exp $$
 */
@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDO toDO(ProductBO productBO);

    @Mapping(target ="productPrice", source = "productAmount")
    ProductBO toBO(ProductDO productDO);

    List<ProductBO> toBOList(List<ProductDO> productDOList);

    ProductDTO toDTO(ProductBO productBO);

    List<ProductDTO> toDTOList(List<ProductBO> productBOList);

}