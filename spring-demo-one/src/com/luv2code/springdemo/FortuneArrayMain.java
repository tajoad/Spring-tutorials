package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FortuneArrayMain {

	public static void main(String[] args) {

		// configure your spring bean
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationFortuneArray.xml");
		
		// retrieve the bean container
		FortuneArray theCoach = context.getBean("fortuneArray", FortuneArray.class);
		
		FortuneArray newCoach = context.getBean("fortuneArray", FortuneArray.class);
		
		
		// check
		Boolean result = (theCoach == newCoach);
		// call your method.
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMempory Location for theCoach: " + theCoach);
		
		System.out.println("\nMempory Location for newCoach: " + newCoach);
		
		System.out.println(theCoach.getFortune());
		
		//close context
		context.close();
	}

}
