//piHole test API

package project_cerebro;

package project_cerebro;
import java.io.*;
import com.mashape.unirest.http.*;
import java.io.*;
import org.json.JSONException;
import org.json.JSONObject;

public class piHole {
	public void piHoleGetAllQueries(String args[]) throws Exception {
		
		String getData = "getAllQueries";
		
		Unirest.setTimeouts(0, 0);
    try {
		HttpResponse<String> response = Unirest.get("http://192.168.0.200/admin/api.php?" + getData)
				.header("Content-Type", "application/json")
				.header("Authorization", "0edfc97772123fb9a4a52e9e4b863caa0da3ac40722883e1c5b63a2a3c3e1493")
				.header("Cookie", "PHPSESSID=8lo04jfo3ti479ev3ts16fqmh5")
				.asString();
		System.out.println("PiHole Response " );
		System.out.println(response.getBody());
		
  } catch (Exception e) {
      e.printStackTrace();
  
      /*
      //shows the output of args in piHoleGetAllQueries(args)
      for(int i = 0; i < args.length; i++) {
          System.out.println(args[i]);
      }
      */
     
  }
 }

}
