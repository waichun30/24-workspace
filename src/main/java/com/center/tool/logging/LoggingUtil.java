/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.logging;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wb-phoonwaic553932
 * @version $Id: LoggingUtil.java, v 0.1 2020-11-07 03:45 wb-phoonwaic553932 Exp $$
 */
@Slf4j
public class LoggingUtil {

    private static Logger unWrapperLogger(Logger logger) {
        Logger result = logger;
        return result;
    }

    public static void info(Logger logger, String message) {
        Logger unwrapperLogger = unWrapperLogger(logger);
        if (unwrapperLogger.isInfoEnabled()) {
            unwrapperLogger.info(message);
        }
    }

    public static void info(Logger logger, String template, Object... messages) {
        Logger unwrapperLogger = unWrapperLogger(logger);
        if (unwrapperLogger.isInfoEnabled()) {
            unwrapperLogger.info(template, messages);
        }
    }
}
