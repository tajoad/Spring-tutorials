package com.luv2code.springdemo;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("todayFortune")
	private FortuneService fortuneService; 
	
	// Example: configure the constructor dependency injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}
	
	// Example: configure the setter dependency injection
	// Step 1: Define your no-arg constructor
	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	// Step2: Create a setter method for injection
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}
		
		
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
//	@PostConstruct
//	public void doMyStartupStuff() {
//		System.out.println("\nInt Method initialized");
//	}
	
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println("\nDestroy Method initialized");
	}

}
