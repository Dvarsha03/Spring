package org.primepro;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext3.xml");
		College college=context.getBean("college", College.class);
		List<String> courses=college.getCourses();
		System.out.println(college.getCid()+"\t"+college.getCollegeName());
		
		System.out.println("The courses available are");
		for(String course:courses)
		  System.out.println(course);

		}

	}