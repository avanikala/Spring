package com.zensar.spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Ting tingg ting");
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Guitarist");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is clean");
	}

}
