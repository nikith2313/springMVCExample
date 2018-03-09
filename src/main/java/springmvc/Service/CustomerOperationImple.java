package springmvc.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.CustomerDao;
import springmvc.Entity.Customer;

@Service
public class CustomerOperationImple implements customerOperations {

	@Autowired
	private CustomerDao ed;


	@Override
	public void addCustomer(Customer e) {
		// TODO Auto-generated method stub
		 ed.addCustomer(e);
	
	}


	@Override
	public  boolean getCustomer(String username,String password) {
		// TODO Auto-generated method stub
boolean cust=ed.getCustomer(username,password);
return cust;
	}

/*
	@Override
	public Customer displayCustomers(int id) {
		// TODO Auto-generated method stub
		Customer b = ed.loadCustomer(id);
		return b;		
	}
		*/

	
	

/*	public void deleteCustomer(int id) throws  {

		boolean b = ed.deleteCustomer(id);
		System.out.println(b);
		if (b == false)
			throw new ("Given Customer id is Invalid. Please provide valid Customer id ");
	}

	public void updateExistingCustomer(Customer e) throws , InvalidSalaryException {
		
	}
*/
/*	public Customer displayCustomers(int id) {

		Customer b = ed.loadCustomer(id);
		return b;
	}*/
	/*
	public void displayAllCustomersInfo() {

		List<Customer> b = ed.DisplayAllCustomer();

	}

	public void highestSalary(int salary) {
		// TODO Auto-generated method stub
		ArrayList<Customer> emp = ed.calculateHighSalary(salary);
	}
*/




	}
