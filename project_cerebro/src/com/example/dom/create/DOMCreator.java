package com.example.dom.create;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;

//import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.example.dataprovider.venstar;
//import com.example.dataprovider.venstar.venstarState;
//import com.example.model.Customer;

public class DOMCreator {
	
	@SuppressWarnings("unused")
	private static final String XMLDATEFORMAT = "yyyy-MM-dd'T'HH:mm:ss";

	Document doc = null;
	
	public DOMCreator() {
	}

	public Document createXMLDoc(List<venstar> data) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		doc = builder.newDocument();
		
		Element root = doc.createElement("venstar");
		doc.appendChild(root);
		
	for (@SuppressWarnings("unused") venstar venstarInfo : data) {
		
	
			Element venstarElement = doc.createElement("venstar");
			root.appendChild(venstarElement);
			String venstarName = toString();
			venstarElement.setAttribute(venstar.getName(), venstarName);
			
			
	}
	return doc;
}
			
			
	/*
			addElement(parent, elementName, textValue)
			
			addElement(custElement, venstar.name, Integer.toString(venstar.name()));
			addElement(custElement, venstar.NAME, Integer.toString(venstar.getName()));
			addElement(custElement, venstar.MODE, Integer.toString(venstar.getMode()));
			addElement(custElement, venstar.STATE, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.ACTIVESTAGE, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.FAN, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.FANSTATE, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.TEMPUNITS, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.SCHEDULE, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.SCHEDULEPART, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.HOLIDAY, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.OVERRIDE, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.OVERRIDETIME, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.FORCEUNOCC, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.SPACETEMP, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.HEATTEMP, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.COOLTEMP, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.COOLTEMPIN, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.COOLTEMPMAX, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.HEATTEMPMIN, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.HEATTEMPMAX, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.SETPOINTDELTA, Integer.toString(venstar.getAge()));
			addElement(custElement, venstar.AVAILABLEMODES, Integer.toString(venstar.getAge()));


	}	
			
			Element about = addElement(custElement, Venstar.ABOUT, "");
			CDATASection cdata = doc.createCDATASection(venstar.getAbout());
			about.appendChild(cdata);
			
			DateFormat df = new SimpleDateFormat(XMLDATEFORMAT);
			addElement(custElement, Customer.JOINED, df.format(venstar.getJoined()));
			
		}
		
			
		
	}
	*/

	@SuppressWarnings("unused")
	private Element addElement(Element parent, String elementName, String textValue) {
		Element childElement = doc.createElement(elementName);
		childElement.setTextContent(textValue);
		parent.appendChild(childElement);
		return childElement;
	}

}
