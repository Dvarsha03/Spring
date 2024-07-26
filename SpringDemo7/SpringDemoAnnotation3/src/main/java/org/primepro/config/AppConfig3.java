package org.primepro.config;

import java.util.ArrayList;
import java.util.List;

import org.primepro.College;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig3 {
	
	 @Bean(name="courses")
	  public List<String>courses()
	{
	  List<String>courses=new ArrayList<String>();
	    courses.add("java");
	   courses.add(".Net");
	   courses.add("Python");
	   return courses;
	}

	@Bean(name="college")
	public College college()
	{
	  College college=new College();
	  college.setCid(1);
	  college.setCollegeName("Primepreolearning");
	  college.setCourses(courses());
	  return college;
	}

}
