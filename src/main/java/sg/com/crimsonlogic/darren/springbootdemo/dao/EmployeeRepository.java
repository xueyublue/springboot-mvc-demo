package sg.com.crimsonlogic.darren.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.com.crimsonlogic.darren.springbootdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
