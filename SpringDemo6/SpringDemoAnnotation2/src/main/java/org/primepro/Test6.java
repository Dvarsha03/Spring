package org.primepro;


import org.primepro.beans.Address;
import org.primepro.beans.Emp2;
import org.primepro.config.AppConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

	public static void main(String[] args) {
		 ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig2.class);
		 Emp2 e=context.getBean("emp", Emp2.class);
		 Address address=e.getAddress();
		 System.out.println(e.getEno()+"\t"+e.getName());
		 System.out.println(address.getDno()+"\t"+address.getStreetName()+"\t"+address.getLoc());


	}

}
