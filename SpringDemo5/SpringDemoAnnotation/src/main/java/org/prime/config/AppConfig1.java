package org.prime.config;


	import org.primepro.beans.Emp;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	@Configuration 
	public class AppConfig1
	{
	  @Bean(name= "emp")
	     public Emp employee()
	   {
	     Emp e=new Emp();
	     e.setEno(5);
	     e.setName("Varsha");
	     e.setAddress("Hyderabad"); 
	     return e;
	   }
	}

