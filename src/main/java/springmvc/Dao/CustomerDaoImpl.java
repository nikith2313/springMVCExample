package springmvc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.Entity.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {

	
	
@Autowired
HibernateTemplate hibernateTemplate;

@Override
@Transactional(readOnly = false)
	public  void addCustomer(Customer cust) {
		hibernateTemplate.save(cust);
	}
/*@Override
	public  Customer loadCustomer(int custid) {
		Customer c=hibernateTemplate.get(Customer.class, custid);
		return c;
	}*/
	/*
	public static void updateCustomer(Customer cust) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		try {

			session.update(cust);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			if (session != null)
				session.close();
		}
	}

	public static void deletCustomer(int custid) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();

		try {
			Customer c = (Customer) session.get(Customer.class, custid);
			session.delete(c);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

*/



@Override
public boolean getCustomer(String name, String password) {
	// TODO Auto-generated method stub
	String hql = "FROM Customer c where c.firstName=? ";
	@SuppressWarnings("unchecked")
	List<Customer> cust= (List<Customer>) hibernateTemplate.find( hql , name); 
	 return cust.size()> 0 ? true : false;
} 

}
