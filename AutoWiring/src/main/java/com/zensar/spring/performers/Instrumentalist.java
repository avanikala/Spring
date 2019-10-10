package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;
@Component("sayanti")
public class Instrumentalist implements Performer {
	//used for complex type components
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	//for simple components
	@Value("Levels")
	private String song;

	@Override
	public void perform()
	{
		System.out.println("instrumentalist is playing song " +song);
		instrument.play();
	}

}
