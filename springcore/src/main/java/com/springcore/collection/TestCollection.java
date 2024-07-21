package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {
		
		System.out.println("Hello Test Collection...");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
		
		Emp emp1 = (Emp) context.getBean("emp1");
//		System.out.println(emp1);
		Emp emp2 = (Emp) context.getBean("emp2");
//		System.out.println(emp2.getCourses().values());
//		System.out.println(emp2.getPerops());
//		System.out.println(emp2.getPerops().keySet());

	}

}
