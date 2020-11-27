package com.spring.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 运行测试
 *
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("user/user-spring.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.getUserName() + "----" + user.getEmail());
    }
}
