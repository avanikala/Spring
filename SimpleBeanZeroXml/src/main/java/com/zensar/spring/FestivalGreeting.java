package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")
public class FestivalGreeting implements Greeting {

	@Override
	public String greet()
	{
		// TODO Auto-generated method stub
		return "Happy Dushhera Avani!!";
	}
	
	public FestivalGreeting() 
	{
	System.out.println("Festival Greeting is created!");
	}
}
