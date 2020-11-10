/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.common;

import lombok.Data;

import java.util.Date;

/**
 * @author wb-phoonwaic553932
 * @version $Id: QrCodeBO.java, v 0.1 2020-11-11 02:45 wb-phoonwaic553932 Exp $$
 */
@Data
public class QrCodeBO {

    private String qrCode;

    private String merchantCode;

    private String qrName;

    private Date createdTime;

    private Date modifiedTime;

    private String extendInfo;

}
