package org.o7planning.spring;

import org.o7planning.spring.bean.GreetingService;
import org.o7planning.spring.bean.MyComponent;
import org.o7planning.spring.config.AppConfiguration;
import org.o7planning.spring.lang.Language;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram {
	public static void main (String [] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		System.out.println("-----------------");
		
		Language language = (Language) context.getBean("language");
		
		String[] beanName = context.getBeanDefinitionNames();
		
		for(int i = 0; i < beanName.length; i++) {
			System.out.println("Bean name ["+i+"]:" + beanName[i]);
		}
		
		System.out.println("There is/are bean(s): " + context.getBeanDefinitionCount());
		
		System.out.println("Bean language: " + language);
		System.out.println("Call language.saybye(): " + language.getBye());
		
		Language secondLangua = (Language) context.getBean("secondLanguage");
		System.out.println("Bean language: " + secondLangua);
		System.out.println("Call language.saybye(): " + secondLangua.getBye());
		
		System.out.println("-----------------");
		GreetingService service = (GreetingService) context.getBean("greetingService");
		service.sayGreeting();
		
		System.out.println("-----------------");
		MyComponent component = (MyComponent) context.getBean("myComponent");
		component.showAppInfo();
		
	}
}
