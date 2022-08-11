package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesMain {

	public static void main(String[] args) {
		// reach the bean configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		SwimCoach newCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		// call the swimcoach bean
		System.out.println(newCoach.getEmail());
		System.out.println(newCoach.getTeam());
		
		// close context
		context.close();

	}

}
