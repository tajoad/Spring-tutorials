package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLifeCycleBeanDemo {

	public static void main(String[] args) {
		// Load bean configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve your spring bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// print your code	
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close context
		context.close();

	}

}
