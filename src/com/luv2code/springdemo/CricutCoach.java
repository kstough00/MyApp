package com.luv2code.springdemo;

public class CricutCoach implements Coach {

	private FortuneService fortuneService;

	public CricutCoach() {
		System.out.println("CricutCoach inside");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setFortuneService cricut coach inside");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pactice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
