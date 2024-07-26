package org.primepro;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		//Emp e =(Emp) context.getBean("e");
		
		//Emp e=context.getBean("e", Emp.class);
		Emp e=context.getBean(Emp.class);
		
		
		System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());
		
	}

}
