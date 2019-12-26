package org.o7planning.spring.lang.impl;

import org.o7planning.spring.lang.Language;

public class Vietnamese implements Language{

	public String getGreeting() {
		return "Xin Chao!";
	}

	public String getBye() {
		return "Tam Biet!";
	}

	public String askQuestion() {
		return "Khoe khong?";
	}
	
	
}
