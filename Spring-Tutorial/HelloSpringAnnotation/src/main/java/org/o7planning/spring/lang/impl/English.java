package org.o7planning.spring.lang.impl;

import org.o7planning.spring.lang.Language;

public class English implements Language{

	public String getGreeting() {
		return "Hello!";
	}

	public String getBye() {
		return "Good bye!";
	}

	public String askQuestion() {
		return "How are you doing?";
	}
	
}
