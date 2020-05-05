//Venstar API Call

package project_cerebro;

//import java.io.*;
import com.mashape.unirest.http.*;
//import java.io.*;
//import org.json.JSONException;
//import org.json.JSONObject;

public class venstar {
	
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
			System.out.println(response.getBody());
			return getInfo;
			

	}
		
	
	public static String venstarControl()
	{
		
		
		
		return null;
		
	}
	
	
	
	public static void main(String[] args) throws Exception { 
		
		String Q = venstarInfo(args);
		
		System.out.println(Q);
		
		
	}
}