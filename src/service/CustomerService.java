package service;

import java.util.HashMap;
import java.util.Map;
import model.Customer;

public class CustomerService {

	private Map<String, Customer> customerMap;
	
	public CustomerService() {
		
		customerMap = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001", "alice", "001"));
		addCustomer(new Customer("id002", "bob", "002"));
		addCustomer(new Customer("id003", "charlie", "003"));
		addCustomer(new Customer("id004", "david", "004"));
	}
	
	private void addCustomer(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {
		if(id != null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}
	
	public boolean CheckPassWord(String id, String password){	
		if(!customerMap.containsKey(id))
			return false;
		else if(customerMap.get(id).getPassword().equals(password))
			return true;
		else
			return false;
	}
	
}
