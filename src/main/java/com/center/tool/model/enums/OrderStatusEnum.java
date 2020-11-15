/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.center.tool.model.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wb-phoonwaic553932
 * @version $Id: OrderStatusEnum.java, v 0.1 2020-11-11 20:16 wb-phoonwaic553932 Exp $$
 */
public enum OrderStatusEnum {

    SUCCESS("SUCCESS", "success order status"),
    INIT("INIT", "init order status"),
    CLOSED("CLOSED", "closed order status"),
    PAID("PAID", "paid order status"),
    FAILED("FAILED", "failed order status");


    private final String code;
    private final String desc;

    OrderStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private static final Map<String, OrderStatusEnum> findMap = new HashMap(24);

    static {
        for (OrderStatusEnum item : values()) {
            findMap.put(item.getCode(), item);
        }
    }

    public static OrderStatusEnum getOrderStatusEnumFromMap(String code) {

        OrderStatusEnum orderStatusEnum = findMap.get(code);
        if (null == orderStatusEnum) {
            return null;
        }
        return orderStatusEnum;

    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
