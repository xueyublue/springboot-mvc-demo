package sg.com.crimsonlogic.darren.springmvc.service;

import java.util.List;

import sg.com.crimsonlogic.darren.springmvc.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
}
