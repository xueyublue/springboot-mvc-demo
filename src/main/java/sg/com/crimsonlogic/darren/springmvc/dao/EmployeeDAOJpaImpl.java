package sg.com.crimsonlogic.darren.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sg.com.crimsonlogic.darren.springmvc.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> findAll() {
		
		Query query = entityManager.createQuery("from Employee");
		
		List<Employee> employees = query.getResultList();
		
		return employees;
	}

	@Override
	public Employee findById(int id) {
		
		Employee employee = entityManager.find(Employee.class, id);
		
		return employee;
	}

	@Override
	public void save(Employee employee) {
		
		Employee updatedEmployee = entityManager.merge(employee);
		
		employee.setId(updatedEmployee.getId());
	}

	@Override
	public int deleteById(int id) {
		
		Query query = entityManager.createQuery("delete from Employee where id=:employeeId");
		query.setParameter("employeeId", id);
		
		return query.executeUpdate();
	}

}
