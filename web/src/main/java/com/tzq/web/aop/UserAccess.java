package com.tzq.web.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/7
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAccess {
    String desc() default "无信息";
}
