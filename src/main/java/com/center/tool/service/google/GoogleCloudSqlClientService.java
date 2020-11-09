/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.google;

import com.center.tool.model.common.ProductBO;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb-phoonwaic553932
 * @version $Id: GoogleCloudSqlClientService.java, v 0.1 2020-11-07 23:22 wb-phoonwaic553932 Exp $$
 */
@Service
@Deprecated
public class GoogleCloudSqlClientService {

    public List<ProductBO> getProduct(String type) {
        List<ProductBO> productList = new ArrayList<>();


        try {
            Class.forName("com.mysql.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://34.87.127.235/24_workspace?cloudSqlInstance=project24db&useSSL=false";

            Connection connection = DriverManager.getConnection(jdbcUrl, "root", "root");
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM 24_workspace.item_test;";

            if(!StringUtils.isEmpty(type)){
                sql = "SELECT * FROM 24_workspace.item_test where type = '"+type+"';";
            }

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + resultSet.getString(2) + resultSet.getString(3) + resultSet.getString(4));

                ProductBO product = new ProductBO();
                product.setItemCode(resultSet.getString(1));
                product.setItemName(resultSet.getString(2));
                product.setItemImgPath(resultSet.getString(3));
                product.setItemPrice(resultSet.getString(4));

                productList.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return productList;
    }

}
