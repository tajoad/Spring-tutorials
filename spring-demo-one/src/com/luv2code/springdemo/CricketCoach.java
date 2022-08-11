package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new private fields for email address and team
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor
	
	public CricketCoach() {
		System.out.println(":CricketCoach: inside no-arg constructor");
	}
	
	
	//Create setter methods
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Email Address: inside setter method -setemailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("team: inside setter method -team");
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(":CricketCoach: inside setter method -setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
