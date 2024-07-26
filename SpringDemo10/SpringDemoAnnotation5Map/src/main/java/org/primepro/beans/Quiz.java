package org.primepro.beans;


import java.util.Map;

public class Quiz {
	 private String Question;
	 private Map<String,String>answers;
	 public Quiz() {
		// TODO Auto-generated constructor stub
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
}
