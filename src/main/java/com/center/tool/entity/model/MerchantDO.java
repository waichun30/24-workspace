/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.model;

import lombok.Data;

import java.util.Date;

/**
 * @author wb-phoonwaic553932
 * @version $Id: MerchantDO.java, v 0.1 2020-11-09 20:37 wb-phoonwaic553932 Exp $$
 */
@Data
public class MerchantDO {


    private String merchantCode;

    private String merchantName;

    private String merchantType;

    private String merchantAddress;

    private String merchantContactNumber;

    private String merchantStatus;

    private Date createdTime;

    private Date modifiedTime;

    private String extendInfo;


}
