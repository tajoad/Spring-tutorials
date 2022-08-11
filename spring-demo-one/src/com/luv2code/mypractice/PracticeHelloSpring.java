package com.luv2code.mypractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpring {

	public static void main(String[] args) {
		
		//connect to your spring configuration
		
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("practiceApplicationContext.xml");
		
		//connect your spring bean using your interface
		
		Cars car = myContext.getBean("myCar", Cars.class);
		
		// call the method on bean
		System.out.println(car.getCarDetails());
		System.out.println(car.getStart());
		System.out.println(car.getStop());
	}

}
