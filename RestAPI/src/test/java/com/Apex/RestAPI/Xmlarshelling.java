package com.Apex.RestAPI;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Response;

class Xmlarshelling {

	public static void main(String[] args) throws JAXBException {

		CustomerMKY customer = new CustomerMKY();
		customer.setId(10);
		customer.setName("Testing");
		customer.setAge(29);
//marshalling object to xml
		JAXBContext jaxbconext = JAXBContext.newInstance(CustomerMKY.class);
		Marshaller marshaller = jaxbconext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
		System.out.println("++++++++++++++++++++++++unmarshalling");
	//Xml_util.getobjectfromxml(CustomerMKY.class);
		
		String xml="<customerMKY>"+
	    "<age>29</age>"+
	    "<id>10</id>"+
	   " <name>Testing</name>"+
	"</customerMKY>";
		
		JAXBContext jaxbContext = JAXBContext.newInstance(CustomerMKY.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 CustomerMKY customermky = (CustomerMKY) jaxbUnmarshaller.unmarshal(( new StringReader(xml)));
		 System.out.println(customermky.getAge());
	}
}

