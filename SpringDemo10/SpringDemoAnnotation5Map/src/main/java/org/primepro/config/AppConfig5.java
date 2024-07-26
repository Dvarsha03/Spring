package org.primepro.config;

import java.util.HashMap;
import java.util.Map;

import org.primepro.beans.Quiz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig5{
	@Bean
	  public Map<String,String>answers()
	{
	   Map<String,String>m=new HashMap<String, String>();
	   m.put("Java is a OOP Language","Ram");
	   m.put("Java is a Technplogy","Sita");
	   return m;
	}
	@Bean
	public Quiz quiz()
	{
	  Quiz quiz=new Quiz();
	  quiz.setQuestion("What is Java");
	  quiz.setAnswers(answers());
	 return quiz;
	}


}
