package sg.com.crimsonlogic.darren.springmvc.dao;

import java.util.List;

import sg.com.crimsonlogic.darren.springmvc.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public int deleteById(int id);
}
