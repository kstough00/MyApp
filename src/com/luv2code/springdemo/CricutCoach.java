package com.luv2code.springdemo;

public class CricutCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	public CricutCoach() {
		System.out.println("CricutCoach inside");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("setEmailAddress inside");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("setTeam inside");

		this.team = team;
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
