package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Employee empObj = (Employee) context.getBean("emp");
		
		
		
		System.out.println(empObj);
	}
}
// ApplicationContext is IOC in spring 
//BeanFactory is also IOC container
// IOC -> inversion of control 
//Employee emp = new Employee();
