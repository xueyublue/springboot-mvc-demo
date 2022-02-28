package sg.com.crimsonlogic.darren.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sg.com.crimsonlogic.darren.springmvc.entity.NavbarBean;

@Controller
public class AboutController {
	
	@Autowired
	private NavbarBean navbarBean;
	
	@GetMapping("/about")
	public String getEmployeeList(Model model) {
		
		navbarBean.setCurrentPage("about");
		model.addAttribute("navbar", navbarBean);
		
		return "about";
	}
	
}
