/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository;

import com.center.tool.entity.model.QrCodeDO;

/**
 * @author wb-phoonwaic553932
 * @version $Id: QrCodeRepository.java, v 0.1 2020-11-11 02:39 wb-phoonwaic553932 Exp $$
 */
public interface QrCodeRepository {
    QrCodeDO getQrCodeByQrCode(String qrCode);
}
