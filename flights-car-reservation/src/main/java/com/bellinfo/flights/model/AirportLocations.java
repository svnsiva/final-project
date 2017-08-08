package com.bellinfo.flights.model;

public class AirportLocations {
	public String search(String code){
		
		
		if(code.equals("JFK"))
			return "New York(JFK)";
		else if(code.equals("IAD"))
			return "Washington, Dulles(IAD)";
		else if(code.equals("ORD"))
			return "Chicago(ORD)";
		else if(code.equals("MIA"))
			return "Miami(MIA)";
		else if(code.equals("MCI"))
			return "Kansas(MCI)";
		else if(code.equals("LAS"))
			return "Las Vegas(LAS)";
		else if(code.equals("ATL"))
			return "Atlanta(ATL)";
		else if(code.equals("DFW"))
			return "Dallas(DFW)";
		else if(code.equals("SFO"))
			return "San Fransisco(SFO)";
		else 
			return "Seatle(SEA)";
		
		
	}
}
