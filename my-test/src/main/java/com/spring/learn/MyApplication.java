package com.spring.learn;

import com.spring.learn.entity.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {

//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setUser("Tom");
//		helloWorld.hello();

		//1. 创建 Spring 的 IOC 容器
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		//2. 从 IOC 容器中获取 bean 的实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//是通过bean.xml里面定义的id来定位获取哪个bean实例的。@lcb
		System.out.println("bean实例的样子是"+ ctx);
		ctx.getBean("helloWorld");//获取的bean实例是什么样子的？
		//org.springframework.context.support.ClassPathXmlApplicationContext@b81eda8: startup date [Sun Feb 17 17:40:32 CST 2019]; root of context hierarchy
		//可以看到bean实例，是一个runtime instance. 有一个生命周期。

		//根据类型来获取 bean 的实例: 要求在  IOC 容器中只有一个与之类型匹配的 bean, 若有多个则会抛出异常.
		//一般情况下, 该方法可用, 因为一般情况下, 在一个 IOC 容器中一个类型对应的 bean 也只有一个.
//		HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);

		//3. 使用 bean
		//有了实例，就可以通过实例来调用实例的方法，那么实例有哪些方法，文档中是要写清楚的。方法可以直接用。
		helloWorld.setUser("chao");
		helloWorld.hello();//hello这个方法，要做什么事情，也是要在方法里面写清楚的。比如这里我输入了setUser的"chao"参数，那么返回的是hello chaobin
	}
}
