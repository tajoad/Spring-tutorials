package com.luv2code.springdemo;

import java.util.Random;

public class FortuneArray implements FortuneService {

	//create an array of fortunes
	private String[] fortunes = {
		"This is the first fortune",
		"This is the second fortune",
		"This is the third fortune"
	};
	
	// create no arg constructor 
	public FortuneArray() {
		System.out.println("Constructor used");
	}
	
	
	@Override
	public String getFortune() {
		// get random fortunes to submit when Fortune service is called
		 int rnd = new Random().nextInt(fortunes.length);
			System.out.println(fortunes[rnd]);
		    return fortunes[rnd];
		   
	}
	
	public void callInitMethod() {
		System.out.println("This is init menthod");
	}

	public void callDestroyMethod() {
		System.out.println("This is Destroy menthod");
	}


}
