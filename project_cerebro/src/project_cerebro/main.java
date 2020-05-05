package project_cerebro;

import java.io.*;
import com.mashape.unirest.http.*;
import org.json.JSONException;
import org.json.JSONObject;


public class main extends venstar {
	

	public main(String[] args) {
	
		
		String Q = venstar.venstarInfo(args);
		
		System.out.println(Q);
	
	}
}
