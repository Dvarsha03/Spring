package org.primepro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext2.xml");
		Emp2 e=context.getBean("e", Emp2.class);
		Address address=e.getAddress();
		System.out.println(e.getEno()+"\t"+e.getName());
		System.out.println(address.getDno()+"\t"+address.getStreetName()+"\t" + address.getLoc());

	}

}
