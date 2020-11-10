/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.impl;

import com.center.tool.entity.model.QrCodeDO;
import com.center.tool.entity.repository.QrCodeRepository;
import com.center.tool.model.common.QrCodeBO;
import com.center.tool.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wb-phoonwaic553932
 * @version $Id: QrCodeServiceImpl.java, v 0.1 2020-11-11 02:47 wb-phoonwaic553932 Exp $$
 */
@Service
public class QrCodeServiceImpl implements QrCodeService {

    @Autowired
    private QrCodeRepository qrCodeRepository;

    @Override
    public QrCodeBO getQrCodeByQrCOde(String qrCode) {

        QrCodeDO qrCodeDO = qrCodeRepository.getQrCodeByQrCode(qrCode);

        QrCodeBO qrCodeBO = new QrCodeBO();
        qrCodeBO.setQrCode(qrCodeDO.getQrCode());
        qrCodeBO.setQrName(qrCodeDO.getQrName());

        return qrCodeBO;
    }
}
