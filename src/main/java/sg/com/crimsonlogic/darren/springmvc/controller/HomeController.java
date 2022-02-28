package sg.com.crimsonlogic.darren.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String getEmployeeList() {
		return "redirect:/employees/list";
	}
}
