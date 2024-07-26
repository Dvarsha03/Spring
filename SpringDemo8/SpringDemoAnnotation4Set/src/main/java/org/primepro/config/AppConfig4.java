package org.primepro.config;
import java.util.HashSet;
import java.util.Set;

import org.primepro.beans.Student;
import org.primepro.beans.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig4 {
	@Bean
	  public Subject subject1()
	  {
	    Subject subject=new Subject();
	    subject.setSubjectName("Java");
	    subject.setDuration(20);
	    return subject;
	  }

	@Bean
	  public Subject subject2()
	  {
	    Subject subject=new Subject();
	    subject.setSubjectName(".Net");
	    subject.setDuration(25);
	    return subject;
	  }
	
	@Bean
	public Set<Subject> subject()
	{
	Set<Subject>subject=new HashSet<>();
	subject.add(subject1());
	subject.add(subject2());
	return subject;

	}

	@Bean
	public Student student()
	{
	  Student student=new Student();
	  student.setName("Amol");
	  student.setAddress("Nagpur");
	  student.setSubjects(subject());
	  student.setSid(1);
	  return student;
	}


}