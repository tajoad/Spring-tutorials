package com.luv2code.springdemo;

public class SwimCoachJava implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoachJava(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
