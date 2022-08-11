package com.luv2code.mypractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prepare your application context
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("practiceApplicationContext.xml");
		//retrieve your bean using your application context
		Cars myCars = myContext.getBean("CarSound", Cars.class);
		
		//call your methods
		System.out.println(myCars.getStart());
		System.out.println(myCars.getStop());
		System.out.println(myCars.getCarDetails());
		//Close context
		myContext.close();

	}

}
