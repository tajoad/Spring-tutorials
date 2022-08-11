package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "I am a football coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
