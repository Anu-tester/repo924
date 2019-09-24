package customer_api_test.api_test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class customerservicetest_PUT extends BaseTest {

	
	HttpResponse response;
	

	@Test
	public void testwithPUTIDdoesnotexist() throws ClientProtocolException, IOException {
		
		Clientapi client=new Clientapi();
		String myRequestMessage="";
		myRequestMessage="<CUSTOMER>"+""+"<ID>8888</ID>"+"<FIRSTNAME>SUE</FIRSTNAME"+
		"<LASTNAME>QUI</LASTNAME>"+"<STREET>jose</STREET"+"<CITY>Sanjose</CITY>"+"</CUSTOMER>";
		response=client.sendandreceivePUTrequest(prop.getProperty("urlpost"),myRequestMessage);
		//httpResponse=Clientapi.sendandreceiveGetrequest("url");
		int statuscode=response.getStatusLine().getStatusCode();
		Assert.assertEquals(statuscode, 201);
		//System.out.println(statuscode);
		String reasonphrase=response.getStatusLine().getReasonPhrase();
		Assert.assertEquals(reasonphrase, "Created");
		//System.out.println(reasonphrase);
	}
		
}
