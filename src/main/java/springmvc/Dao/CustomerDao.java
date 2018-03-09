package springmvc.Dao;

import springmvc.Entity.Customer;
public interface CustomerDao {

	public  void addCustomer(Customer cust);
	public  boolean getCustomer(String name,String password);
	/*public  Customer loadCustomer(int cust);*/
}
