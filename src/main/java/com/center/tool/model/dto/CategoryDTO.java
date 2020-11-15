/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.dto;

import lombok.Data;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: CategoryDTO.java, v 0.1 2020-11-14 23:02 wb-phoonwaic553932 Exp $$
 */
@Data
public class CategoryDTO {

    private String categoryName;

    private String categoryCode;

    private List<ProductDTO> productDTOList;
}
