package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;


public class SpringMain {

	public static void main(String[] args) {
		// creating object of spring IoC container
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(GreetingConfig.class);
		Greeting g = ctx.getBean("festival", Greeting.class);
		//System.out.println(g.greet());
		
		Greeting g1 = ctx.getBean("anniversary", Greeting.class);
		//System.out.println(g1.greet());
	}

}
