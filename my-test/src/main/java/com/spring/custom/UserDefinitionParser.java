package com.spring.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 3. 定义 Parser 类
 * 该类继承 AbstractSingleBeanDefinitionParser ，
 * 并实现 #getBeanClass(Element element)
 * 和 #doParse(Element element, BeanDefinitionBuilder builder) 两个方法。
 * 主要是用于解析 XSD 文件中的定义和组件定义。
 */
public class UserDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");

        if(StringUtils.hasText(id)){
            builder.addPropertyValue("id", id);
        }

        if(StringUtils.hasText(userName)){
            builder.addPropertyValue("userName", userName);
        }

        if(StringUtils.hasText(email)){
            builder.addPropertyValue("email", email);
        }
    }
}
