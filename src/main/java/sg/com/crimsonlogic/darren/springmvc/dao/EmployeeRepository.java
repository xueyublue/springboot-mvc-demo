package sg.com.crimsonlogic.darren.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.com.crimsonlogic.darren.springmvc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
