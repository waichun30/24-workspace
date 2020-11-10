/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.entity;

import com.center.tool.entity.model.QrCodeDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wb-phoonwaic553932
 * @version $Id: QrCodeMapper.java, v 0.1 2020-11-11 02:40 wb-phoonwaic553932 Exp $$
 */
@Mapper
public interface QrCodeMapper {

    QrCodeDO getQrCodeByQrCode(String qrCode);
}