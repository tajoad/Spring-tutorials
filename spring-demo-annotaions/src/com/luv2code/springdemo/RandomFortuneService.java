package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	
	private String[] data = {
			"Hello there",
			"How are you doing",
			"The journey is the reward"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getDailyFortune() {
		// pick a random string from the array
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
