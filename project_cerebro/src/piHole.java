
import com.mashape.unirest.http.*;
//import java.io.*;

public class apiCall { //piHole API Call
	
	public static void main(String[] args)
{
		//System.out.println(piHole.topClients());

}

	public static void piHole(String []args) throws Exception 
  {
  
		String getData = "getAllQueries";
	
		Unirest.setTimeouts(0, 0);
    
		HttpResponse<String> response = Unirest.get("http://192.168.0.200/admin/api.php?" + getData)
				.header("Content-Type", "application/json")
				.header("Authorization", "0edfc97772123fb9a4a52e9e4b863caa0da3ac40722883e1c5b63a2a3c3e1493")
				.header("Cookie", "PHPSESSID=8lo04jfo3ti479ev3ts16fqmh5")
				.asString();
    
	//	System.out.println(response.getBody());
		return response.getBody();
  }

}

// Creating XML calling from apiCall class
	//open connection to apiCall class 





	
	
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