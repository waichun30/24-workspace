package com.center.tool.entity;

import com.center.tool.entity.model.ProductDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    /**
     *
     * get ProductDO by productCode
     * @param productCode
     * @return
     */
    ProductDO getProductDoByProductCode(String productCode);

    /**
     * get list of ProductDO by merchantCode
     * @param merchantCode
     * @return
     */
    List<ProductDO> getProductDoByMerchantCode(String merchantCode);

    /**
     * get list of ProductDO by merchantCode and type
     * @param merchantCode
     * @param productType
     * @return
     */
    List<ProductDO> getProductDoByMerchantCodeAndType(String merchantCode, String productType);
}

