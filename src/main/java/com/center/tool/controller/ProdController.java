/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.controller;

import com.center.tool.controller.base.AbstractController;
import com.center.tool.model.common.ProductBO;
import com.center.tool.model.dto.CategoryDTO;
import com.center.tool.model.dto.MerchantProdCategoryDTO;
import com.center.tool.model.dto.ProductDTO;
import com.center.tool.service.ProductService;
import com.center.tool.sort.dto.MerchantProdCategoryDTOSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author wb-phoonwaic553932
 * @version $Id: ProdController.java, v 0.1 2020-11-14 17:20 wb-phoonwaic553932 Exp $$
 */
@Controller
@CrossOrigin
public class ProdController extends AbstractController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/1.0/prod/{qrcode}", produces = "application/json")
    public void getProductList(@PathVariable("qrcode") String qrcode, HttpServletResponse response, HttpServletRequest request) throws Exception {
        sendResponse(parseResponse(qrcode, request), response);
    }

    @Override
    protected String[] requiredField() {
        return null;
    }

    @Override
    protected Map<String, Object> doService(Object o) {
        Map<String, Object> respMap = new HashMap<>();

        List<ProductDTO> productDTOList = productService.getProductByQrCode((String) o);

        List<MerchantProdCategoryDTO> merchantProdCategoryDTOList = productService.getMerchantProdCategoryByQrCode((String) o);

        merchantProdCategoryDTOList.sort(new MerchantProdCategoryDTOSort());

        TreeMap<String, Object> custMap = new TreeMap<>();

        List<CategoryDTO> categoryDTOList = new ArrayList<>();

        for (MerchantProdCategoryDTO merchantProdCategoryDTO : merchantProdCategoryDTOList) {

            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setCategoryCode(merchantProdCategoryDTO.getCategoryCode());
            categoryDTO.setCategoryName(merchantProdCategoryDTO.getCategoryName());


            List<ProductDTO> split = new ArrayList<>();
            for (ProductDTO productDTO : productDTOList) {
                if (merchantProdCategoryDTO.getCategoryCode().equals(productDTO.getCategoryCode())) {
                    split.add(productDTO);
                }
                categoryDTO.setProductDTOList(split);
            }
            categoryDTOList.add(categoryDTO);
        }


        respMap.put("category", categoryDTOList);

        return respMap;
    }
}
