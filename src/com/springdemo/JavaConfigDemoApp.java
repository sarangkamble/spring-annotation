package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java file
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach= context.getBean("tennisCoach" , Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();

	}

}