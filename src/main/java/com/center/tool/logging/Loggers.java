/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wb-phoonwaic553932
 * @version $Id: Loggers.java, v 0.1 2020-11-07 03:49 wb-phoonwaic553932 Exp $$
 */
public abstract class Loggers {


    public static final Logger BOOT_LOGGER = LoggerFactory.getLogger("SERVER_BOOT");

    public static final Logger BIZ_SERVICE = LoggerFactory.getLogger("BIZ_SERVICE");

    public static final Logger BIZ_HTTP = LoggerFactory.getLogger("BIZ_HTTP");

}
