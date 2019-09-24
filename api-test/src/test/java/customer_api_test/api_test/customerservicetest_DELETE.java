package customer_api_test.api_test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class customerservicetest_DELETE extends BaseTest{

	
	 HttpResponse response;
		
		
		@Test
		public void testwithIDdoesnotexist() throws ClientProtocolException, IOException {
			
			
			Clientapi client=new Clientapi();
			response=client.sendandreceiveDELETErequest(prop.getProperty("urlget"));
			//httpResponse=Clientapi.sendandreceiveGetrequest("url");
			int statuscode=response.getStatusLine().getStatusCode();
			Assert.assertEquals(statuscode, 200);
			//System.out.println(statuscode);
			String reasonphrase=response.getStatusLine().getReasonPhrase();
			Assert.assertEquals(reasonphrase, "OK");
			//System.out.println(reasonphrase);
		}
}
