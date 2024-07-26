package org.primepro;


import org.prime.config.AppConfig1;
import org.primepro.beans.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {

	public static void main(String[] args) {
		 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig1.class);
		 Emp e=context.getBean("emp", Emp.class);
		 System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());
		 }

	}