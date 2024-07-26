package org.primepro;

import java.util.Map;
import java.util.Set;

import org.primepro.beans.Quiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9 {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext5.xml");
		 Quiz quiz=context.getBean("quiz", Quiz.class);
		 System.out.println("The question is");
		 System.out.println(quiz.getQuestion());
		 Map<String,String>answers=quiz.getAnswers();
		 
		 Set<Map.Entry<String,String>>entries=answers.entrySet();

		 System.out.println("The answers are:");
		 for(Map.Entry<String,String>answer:entries)
		 {
		   System.out.println(answer.getKey()+"\t"+answer.getValue());
		 }

	}

}