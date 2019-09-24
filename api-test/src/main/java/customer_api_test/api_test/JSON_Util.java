package customer_api_test.api_test;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

public class JSON_Util {
	public static Customer getobjectfromJSON(String xmlmessage) throws JAXBException {
		Gson gson = new Gson();
		Customer customer = (Customer) gson.fromJson(new StringReader(xmlmessage), Customer.class);
		return customer;
	}

	public static String getJSONfromobject(Customer customer) throws JAXBException {
		Gson gson = new Gson();
		String json = gson.toJson(customer);
		return json;

	}
}
