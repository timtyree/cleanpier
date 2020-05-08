package com.example.dataprovider;

import java.io.File;
import java.io.FileReader;

public class main {

	public static void main(String[] args) throws Exception {
		
		String filename = venstar.DATADIR + "mainOutput.xml";
		StringBuilder builder = new StringBuilder();
		FileReader reader = new FileReader(new File(filename));
		
		int content;
		while ((content = reader.read()) != -1) {
				builder.append((char)content); 
	}
		reader.close();
		
		System.out.println(builder.toString());
	
			
			
	}

}
