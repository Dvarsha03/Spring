package org.primepro.config;
import org.primepro.beans.Address;
import org.primepro.beans.Emp2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	  @Bean(name="address")
	  public Address address()
	{
	  Address address=new Address();
	  address.setDno(101);
	  address.setStreetName("JNTU");
	  address.setLoc("Hyderabad");
	  return address;
	}
	 

	  @Bean(name="emp")
	     public Emp2 employee()
	   {
	     Emp2 e=new Emp2();
	     e.setEno(1);
	     e.setName("Vaishali");
	     e.setAddress(address()); 
	     //setAddress method injecting address object into employee
	    //address() is a factory method and returning address object.
	     return e;
	    }

}
