/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.utils;

import java.text.DecimalFormat;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MoneyUtil.java, v 0.1 2020-11-15 01:33 wb-phoonwaic553932 Exp $$
 */
public class MoneyUtil {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public String convertMoney(String amount){
        return  df.format(Float.parseFloat(amount) / 100.0F);
    }


}
