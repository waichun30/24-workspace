/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.service.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Place to keep all signature class
 * @author wb-phoonwaic553932
 * @version $Id: SignatureUtil.java, v 0.1 2020-11-11 06:34 wb-phoonwaic553932 Exp $$
 */
public class SignatureUtil {

    public static String sha256hashing(String original){
      return DigestUtils.sha256Hex(original);
    }

}
