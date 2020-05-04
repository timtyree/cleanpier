import java.io.*;
import com.mashape.unirest.http.*;
import java.io.*;
import org.json.JSONException;
import org.json.JSONObject;

public class apiCall { 
	

	

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

    
  
//venstar Call
	
public void venstarInfo(String[] args) throws Exception 
{
		
		String getInfo = "/query/info";
		try {
		Unirest.setTimeouts(0, 0);
 
		HttpResponse<String> response = Unirest.get("http://192.168.0.7" + getInfo)
				.header("Content-Type", "application/json")
				.header("Authorization", "")
				.header("Cookie", "PHPSESSID=8lo04jfo3ti479ev3ts16sad2")
				.asString();
		
		System.out.println("Venstar Explorer Mini 2050 Response: " );
		System.out.println(response.getBody());
				
		}
		
		catch (Exception e) {
		      e.printStackTrace();
		}
	}
	
//Main
public static void main(String[] args){
	//Venstar	

	String Q = venstarInfo(args);
	Q = apiCall.venstarInfo(args);
	
	
	
	//String a = venstarInfo;
	 
	//new apiCall().venstarInfo(args);
	
	//venstarInfo(args);		
			
	
	System.out.println(Q);
				

			
			/*
			piHoleGetAllQueries Queries = new piHoleGetAllQueries.response(getAllQueries);
			
			Queries = piHoleGetAllQueries.response;

			System.out.println(piHoleGetAllQueries.response.getBody());
		*/	
			
}

/* PUT 
 * https://www.toolsqa.com/rest-assured/post-request-using-rest-assured/
 * 
 * HttpResponse response = Unirest.put("https://inventory-fac4.restdb.io/rest/motorbikes/560bd66201e7ab1b2648f4e7")
.header("content-type", "application/json")
.header("x-apikey", "560bd47058e7ab1b2648f4e7")
.header("cache-control", "no-cache")
.body("{\"field2\":\"new value\"}")
.asString();

 */


	
    
    
	public static void demandResponderClick() {
		
	
	}

	
}


//convert to GSON



// Creating XML calling from apiCall class
	//open connection to apiCall class 

//exceptions catch



	
	
	/*	
  public String xmlExport;

  public main(String apiCall) {
    apiCall(name);
    xmlExport = "surprise!";
  }

  public String toString() {
    return super.toString() + "\t" + xmlExport;
  }

  public static void main(String[] args) {
    name you = new name("foo");
    main me = new main("boo");

    System.out.println("Your name is " + you);
    System.out.println("My name is " + me);
  }
  
  System.out.println("APi Call test");
}




//need to get DTD file?
// export to XML
try {
    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

    //root elements
    Document doc = docBuilder.newDocument();

    Element rootElement = doc.createElement("company");
    doc.appendChild(rootElement);

    //staff elements
    Element staff = doc.createElement("Staff");
    rootElement.appendChild(staff);

    //set attribute to staff element
    Attr attr = doc.createAttribute("id");
    attr.setValue("1");
    staff.setAttributeNode(attr);

    //shorten way
    //staff.setAttribute("id", "1");

    //firstname elements
    Element firstname = doc.createElement("firstname");
    firstname.appendChild(doc.createTextNode("yong"));
    staff.appendChild(firstname);

    //lastname elements
    Element lastname = doc.createElement("lastname");
    lastname.appendChild(doc.createTextNode("mook kim"));
    staff.appendChild(lastname);

    //nickname elements
    Element nickname = doc.createElement("nickname");
    nickname.appendChild(doc.createTextNode("mkyong"));
    staff.appendChild(nickname);

    //salary elements
    Element salary = doc.createElement("salary");
    salary.appendChild(doc.createTextNode("100000"));
    staff.appendChild(salary);

    //write the content into xml file
    TransformerFactory transformerFactory =  TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    DOMSource source = new DOMSource(doc);

    StreamResult result =  new StreamResult(new File("C:\\testing.xml"));
    transformer.transform(source, result);

    System.out.println("Done");

}catch(ParserConfigurationException pce){
    pce.printStackTrace();
}catch(TransformerException tfe){
    tfe.printStackTrace();
}
*/


// where is the file stored?
//confirmation?