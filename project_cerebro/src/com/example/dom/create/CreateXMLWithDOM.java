package com.example.dom.create;

import java.io.File;
import java.io.StringWriter;
import java.util.List;

//import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.example.dataprovider.venstar;
//import com.example.dataprovider.venstar.venstarState;

//import project_cerebro.DataProvider;

public class CreateXMLWithDOM {

	public static void main(String[] args) throws Exception {

		List<venstar> data = venstar.venstarState();
		
		DOMCreator creator = new DOMCreator();
		Document doc = creator.createXMLDoc(data);
		System.out.println(doc.toString());
		
		Node root = doc.getFirstChild();
		System.out.println(root.getNodeName());
		
		NodeList nodes = root.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node child = nodes.item(i);
			System.out.println(child.getNodeName());
			
			
		}
		
		
		outputToString(doc);
		outputAsFile(doc, "./data/mainOutput.xml");

	}

	private static void outputToString(Document doc)
			throws TransformerFactoryConfigurationError,
			TransformerConfigurationException, TransformerException {
		DOMSource source = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		
		Transformer transformer = getTransformer();
		transformer.transform(source, result);
		String xmlString = writer.toString();
		
		System.out.println(xmlString);
	}
	
	private static void outputAsFile(Document doc, String filename) 
			throws TransformerConfigurationException, 
			TransformerException, 
			TransformerFactoryConfigurationError {
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(filename));
		getTransformer().transform(source, result);
	}

	private static Transformer getTransformer()
			throws TransformerFactoryConfigurationError,
			TransformerConfigurationException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		return transformer;
	}

}
