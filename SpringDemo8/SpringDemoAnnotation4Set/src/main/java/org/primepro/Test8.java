package org.primepro;

import java.util.Set;

import org.primepro.beans.Student;
import org.primepro.beans.Subject;
import org.primepro.config.AppConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test8 {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig4.class);
		Student student=context.getBean("student",Student.class);
		Set<Subject> subjects=student.getSubjects();
		System.out.println(student.getName()+"\t"+student.getAddress());
		System.out.println("The registered subjects are:");
		for(Subject subject:subjects)
		{
		  System.out.println(subject.getSubjectName()+"\t"+subject.getDuration());
		}

	}

}