/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.response;

import com.center.tool.model.base.ExtendModel;
import com.center.tool.model.common.ProductBO;
import lombok.Data;

import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ItemListResponse.java, v 0.1 2020-11-07 02:58 wb-phoonwaic553932 Exp $$
 */
@Data
public class ProductListResponse extends ExtendModel {

    private List<ProductBO> productsList;

}
