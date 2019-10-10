package com.zensar.spring.performers;

import java.util.Map;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Map<Instrument, String> instrumentSongMap;
	
	

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}



	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}



	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
		for(Map.Entry<Instrument, String> mList : instrumentSongMap.entrySet()) {
		 
			System.out.print("The song " + mList.getValue() + " by ");
			  mList.getKey().play();
		}
	}

	
	
	

}
