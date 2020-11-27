package com.spring.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 4 定义 NamespaceHandler 类
 * 继承 NamespaceHandlerSupport ,主要目的是将组件注册到 Spring 容器中
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserDefinitionParser());
    }
}
