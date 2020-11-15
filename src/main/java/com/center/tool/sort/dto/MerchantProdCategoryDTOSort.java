/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.sort.dto;

import com.center.tool.model.dto.MerchantProdCategoryDTO;

import java.util.Comparator;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantProdCategoryDTOSort.java, v 0.1 2020-11-14 20:21 wb-phoonwaic553932 Exp $$
 */
public class MerchantProdCategoryDTOSort implements Comparator<MerchantProdCategoryDTO> {

    @Override
    public int compare(MerchantProdCategoryDTO o1, MerchantProdCategoryDTO o2) {
        return o1.getSort().compareTo(o2.getSort());
    }
}
