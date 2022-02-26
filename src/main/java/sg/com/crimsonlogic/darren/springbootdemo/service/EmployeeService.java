package sg.com.crimsonlogic.darren.springbootdemo.service;

import java.util.List;

import sg.com.crimsonlogic.darren.springbootdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
}
