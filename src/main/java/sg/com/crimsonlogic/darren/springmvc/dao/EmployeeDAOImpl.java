package sg.com.crimsonlogic.darren.springbootdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sg.com.crimsonlogic.darren.springbootdemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> findAll() {
		
		Session session = entityManager.unwrap(Session.class);
		
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		
		List<Employee> employees = query.list();
		
		return employees;
	}

	@Override
	public Employee findById(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		
		Employee employee = session.get(Employee.class, id);
		
		return employee;
	}

	@Override
	public void save(Employee employee) {
		
		Session session = entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(employee);
	}

	@Override
	public int deleteById(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		
		Query<?> query = session.createQuery("delete from Employee where id=:employeeId");
		query.setParameter("employeeId", id);
		
		return query.executeUpdate();
	}

}
