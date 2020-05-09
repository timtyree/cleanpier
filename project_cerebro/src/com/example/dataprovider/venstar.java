//Venstar API Call

package com.example.dataprovider;


import java.util.List;

import com.mashape.unirest.http.*;


public class venstar {
	
	public static final String DATADIR = "../project_cerebro/data/";  //linked to main.java
	public static Object venstarState;
	
	
	public static String venstarInfo(String[] args) throws Exception 
	{	
	
			String getInfo = "/query/info";
		
			Unirest.setTimeouts(0, 0);

			HttpResponse<String> response = Unirest.get("http://192.168.0.7" + getInfo)
					.header("Content-Type", "application/json")
					.header("Authorization", "")
					.header("Cookie", "PHPSESSID=8lo04jfo3ti479ev3ts16sad2")
					.asString();
			
			System.out.println("Venstar Explorer Mini 2050 Response: " );
			//System.out.println(response.getBody());
			//return getInfo;
			return response.getBody();

	}
		

	public static String venstarControl()
	{

		return null;
		
	}
	
	
	public static void main(String[] args) throws Exception { 
		
		String Q = venstarInfo(args);
		
		System.out.println("venstar" + Q);
		
		
	}


	public class venstarState {
		
		//private int name;
	/*	
		private int mode;
		private int state;
		private int activestage;
		private int fan;
		private int fanstate;
		private int tempunits;
		private int schedule;
		private int schedulepart;
		private int holiday;
		private int overide;
		private int overridetime;
		private int forceunocc;
		private int spacetemp;
		private int heattemp;
		private int cooltemp;
		private int cooltempmin;
		private int cooltempmax;
		private int heattempmin;
		private int heattempmax;
		private int setpointdelta;
		private int availablemodes;
	*/
		
		public static final String
			NAME="name",
			MODE="mode",
			STATE="state",
			ACTIVESTAGE="activestage",
			FAN="fan",
			FANSTATE="fanstate",
			TEMPUNITS="tempunits",
			SCHEDULE="schedule",
			SCHEDULEPART="schedulepart",
			HOLIDAY="holiday",
			OVERTIME="ovetime",
			OVERRIDETIME="overridetime",
			FORCEUNOCC="forceunocc",
			SPACETEMP="spacetemp",
			HEATTEMP="heattemp",
			COOLTEMP="cooltemp",
			COOLTEMPMAX="cooltempmin",
			COOLTEMPMIN="cooltempmax",
			HEATTEMPMIN="heattempmin",
			HEATTEMPMAX="heattempmax",
			SETPOINTDELTA="setpointdelta",
			AVAILABLEMODES="availablemodes";
			
			public venstarState() {
				
			}
	

		
	}


	public static String getName() {
		// TODO Auto-generated method stub
		return getName();
	}


	public static List<venstar> venstarState() {
		// TODO Auto-generated method stub
		return null;
	}
	
}