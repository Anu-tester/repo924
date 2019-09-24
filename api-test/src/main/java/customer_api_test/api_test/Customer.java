package customer_api_test.api_test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="customers")
public class Customer {
	
	
	private String firstName;
	private String lastName;
	private String customer_url;
	
	public Customer() {
		super();
	}
	@XmlElement(name="firstname")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@XmlElement(name="lastname")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@XmlElement(name="customer_url")
	public String getCustomer_url() {
		return customer_url;
	}

	public void setCustomer_url(String customer_url) {
		this.customer_url = customer_url;
	}
	
}
