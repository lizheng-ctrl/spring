package com.bjpowernode;

import com.bjpowernode.bean.MyBean;
import com.bjpowernode.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: LZ
 * @create: 2022-09-07 14:39
 **/
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		MyBean mybean = context.getBean(MyBean.class);
		String hello = mybean.sayHello("张三");
		System.out.println(hello);
	}
}
