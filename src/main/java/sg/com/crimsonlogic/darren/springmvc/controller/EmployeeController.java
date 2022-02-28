package sg.com.crimsonlogic.darren.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sg.com.crimsonlogic.darren.springmvc.entity.Employee;
import sg.com.crimsonlogic.darren.springmvc.entity.NavbarBean;
import sg.com.crimsonlogic.darren.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private NavbarBean navbarBean;
	
	@GetMapping("/list")
	public String getEmployeeList(Model model) {
		
		model.addAttribute("employees", employeeService.findAll());
		
		navbarBean.setCurrentPage("employees");
		model.addAttribute("navbar", navbarBean);
		
		return "employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		model.addAttribute("employee", new Employee());
		
		navbarBean.setCurrentPage("employees");
		model.addAttribute("navbar", navbarBean);
		
		return "employee-form";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		employeeService.save(employee);
		
		return "redirect:/employees/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int employeeId, Model model) {
		
		Employee employee = employeeService.findById(employeeId);
		
		model.addAttribute("employee", employee);
		
		navbarBean.setCurrentPage("employees");
		model.addAttribute("navbar", navbarBean);
		
		return "employee-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int employeeId) {
		
		employeeService.deleteById(employeeId);
		
		return "redirect:/employees/list";
	}
	
}
