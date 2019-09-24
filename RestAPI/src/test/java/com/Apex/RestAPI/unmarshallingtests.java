package com.Apex.RestAPI;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class unmarshallingtests {
	public static void main(String[] args) throws JAXBException {
		
	
	
	String xmlstring="<Customer>"+
    "<id>29</id>"+
    "<firstName>10</firstName>"+
    "<lastName>Testing</lastName>"+
    "<street> street</street>"+
    "<city> street</city>"+
"</Customer>";
	
	JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			 Customer customer = (Customer) jaxbUnmarshaller.unmarshal(( new StringReader(xmlstring)));
			 System.out.println(customer);
	}
}
