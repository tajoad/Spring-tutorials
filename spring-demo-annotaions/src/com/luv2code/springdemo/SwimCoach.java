package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	// Inject the properties values
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	// Create no -arg constructor
	public SwimCoach() {
		 System.out.println(">> Constructor passed");
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "This is my SwimCoach workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
