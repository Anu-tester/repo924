package customer_api_test.api_test;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.bind.JAXBException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;

import org.apache.http.util.EntityUtils;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class customerservicetest_GET extends BaseTest {

	// create the http client
	// create the request message
	// send the message and get the response
	// validate 200,404

	HttpResponse response;

	@Test(priority = 1, enabled = true)
	public void testwithIDdoesnotexist() throws ClientProtocolException, IOException, JAXBException {

		// Clientapi.sendandreceiveGetrequest(prop.getProperty("url"));
		// HttpClient client = HttpClientBuilder.create().build();
		// HttpGet request = new HttpGet(prop.getProperty("url"));
		// HttpResponse response = client.execute(request);
		Clientapi client = new Clientapi();

		response = client.sendandreceiveGetrequest(prop.getProperty("urlget"));
		// httpResponse=Clientapi.sendandreceiveGetrequest("url");
		int statuscode = response.getStatusLine().getStatusCode();
		Assert.assertEquals(statuscode, 200);
		System.out.println(statuscode);
		String reasonphrase = response.getStatusLine().getReasonPhrase();
		Assert.assertEquals(reasonphrase, "OK");
		String responsemessgae = client.sendandreceiveGetrequest(response);
		String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
		// Customer customer=XML_UTIL.getobjectfromxml(responseString);
		// getobjectfromxml(responsemessgae);
		// Assert.assertEquals(customer.getFirstName(), "Joe");
		System.out.println(responseString);
		// System.out.println(customer);
	}

	@Test(priority = 0)
	public void JSONIDdoesnotexist() throws ClientProtocolException, IOException, JAXBException {
		Clientapi client = new Clientapi();

		response = client.sendandreceiveGetrequest(prop.getProperty("urlget"));
		String responseString = EntityUtils.toString(response.getEntity(), "UTF-8");
		System.out.println(responseString);
		Gson gson = new Gson();
		String json = gson.toJson(responseString);
		System.out.println(json);
		// Status code//
		int statuscode = response.getStatusLine().getStatusCode();
		System.out.println(statuscode);

		// headers//
		Header[] header = response.getAllHeaders();
		HashMap<String, String> hashmap = new HashMap<String, String>();
		for (Header headers : header) {
			hashmap.put(headers.getName(), headers.getValue());
		}
		System.out.println(hashmap);
	}
}
