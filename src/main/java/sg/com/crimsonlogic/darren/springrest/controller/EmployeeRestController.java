package sg.com.crimsonlogic.darren.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.com.crimsonlogic.darren.springmvc.entity.Employee;
import sg.com.crimsonlogic.darren.springmvc.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	// http://localhost:8080/api/employees
	@GetMapping("/employees")
	public List<Employee> findAll() {
		
		return employeeService.findAll();
	}
	
	// http://localhost:8080/api/employees/{employeeId}
	@GetMapping("/employees/{employeeId}")
	public Employee findById(@PathVariable(name = "employeeId") int id) {
		
		Employee employee = employeeService.findById(id);
		
		if(employee == null) {
			throw new RuntimeException("Employee id not found.");
		}
		
		return employee;
	}
	
	// http://localhost:8080/api/employees
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		employee.setId(0);
		
		employeeService.save(employee);
		
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		employeeService.save(employee);
		
		return employee;
	}
	
	// http://localhost:8080/api/employees/{employeeId}
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable(name = "employeeId") int id) {
		
		Employee employee = employeeService.findById(id);
		
		if(employee == null) {
			throw new RuntimeException("Employee id not found.");
		}
		
		employeeService.deleteById(id);
		
		return "Deleted employee id - " + id;
	}
}
