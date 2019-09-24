package com.Apex.RestAPI;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class Xml_util {

	public static  Customer getobjectfromxml(String xmlmessage) throws JAXBException  {
		
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 Customer customer = (Customer) jaxbUnmarshaller.unmarshal(( new StringReader(xmlmessage)));
		return customer;
	}
	public static  String getxmlfromobject(Customer customer) throws JAXBException  {
		
		JAXBContext jaxbconext = JAXBContext.newInstance(CustomerMKY.class);
		Marshaller marshaller = jaxbconext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter writer=new StringWriter();
		marshaller.marshal(customer,writer);
		return writer.toString();
	}
}

