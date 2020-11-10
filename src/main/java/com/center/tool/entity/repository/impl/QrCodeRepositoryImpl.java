/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity.repository.impl;

import com.center.tool.entity.QrCodeMapper;
import com.center.tool.entity.model.QrCodeDO;
import com.center.tool.entity.repository.QrCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wb-phoonwaic553932
 * @version $Id: QrCodeRepositoryImpl.java, v 0.1 2020-11-11 02:39 wb-phoonwaic553932 Exp $$
 */
@Service
public class QrCodeRepositoryImpl implements QrCodeRepository {

    @Autowired
    private QrCodeMapper qrCodeMapper;

    @Override
    public QrCodeDO getQrCodeByQrCode(String qrCode) {
        return qrCodeMapper.getQrCodeByQrCode(qrCode);
    }
}
