package com.bjpowernode.bean;

/**
 * @program: spring
 * @description:
 * @author: LZ
 * @create: 2022-09-07 14:55
 **/
public class MyBean {
	private String name;
	private int age;

	public MyBean(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public MyBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String sayHello(String name){
		return name + "你好";
	}

	@Override
	public String toString() {
		return "MyBean{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
