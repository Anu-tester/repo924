package customer_api_test.api_test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Clientapi extends BaseTest {

	public static HttpResponse sendandreceiveGetrequest(String url) throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		return response;
	}

	public static HttpResponse sendandreceivePOSTrequest(String url, String stringMessage)
			throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost requestmessage = new HttpPost(url);
		StringEntity stringEntity = new StringEntity(stringMessage);
		requestmessage.setEntity(stringEntity);
		HttpResponse response = client.execute(requestmessage);
		return response;
	}

	public static HttpResponse sendandreceivePUTrequest(String url, String stringMessage)
			throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpPut requestmessage = new HttpPut(url);
		StringEntity stringEntity = new StringEntity(stringMessage);
		requestmessage.setEntity(stringEntity);
		HttpResponse response = client.execute(requestmessage);
		return response;
	}

	public static HttpResponse sendandreceiveDELETErequest(String url) throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpDelete requestmessage = new HttpDelete(url);
		HttpResponse response = client.execute(requestmessage);
		return response;
	}

	public String sendandreceiveGetrequest(HttpResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
}
