package org.o7planning.spring.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	public String getAppname() {
		return "Hello String app";
	}
	
	public Date getSystemDateTime() {
		return new Date();
	}
}
