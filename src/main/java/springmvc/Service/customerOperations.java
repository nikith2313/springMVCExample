package springmvc.Service;

import springmvc.Entity.Customer;
import springmvc.Entity.Login;
public interface customerOperations {
	
	void addCustomer(Customer e);
	public boolean getCustomer(String username,String password);

	/*public void deleteEmployee(int id) throws EmployeeNotFoundException;

	public void updateExistingEmployee(Employee e) throws EmployeeNotFoundException;
*/
	/*public Customer displayCustomers(int id);
*/
	/*public void displayAllEmployeesInfo();*/

}
