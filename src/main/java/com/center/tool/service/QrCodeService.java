/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service;

import com.center.tool.model.common.QrCodeBO;

/**
 * @author wb-phoonwaic553932
 * @version $Id: QrCodeService.java, v 0.1 2020-11-11 02:47 wb-phoonwaic553932 Exp $$
 */
public interface QrCodeService {
    QrCodeBO getQrCodeByQrCOde(String qrCode);
}