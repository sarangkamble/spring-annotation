package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneSerivce;

	//define default constructor
	public TennisCoach() {
		System.out.println("Inside Default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStaff() {
		System.out.println("Inside of doMyStartupStaff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStaff() {
		System.out.println("Inside of doMyCleanupStaff()");
	}
	
	
	//define setter method
/*	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside setFortuneService() method");
		fortuneSerivce=theFortuneService;
	}*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneSerivce=theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {	
		return "Practice Your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSerivce.getFortune();
	}

}
