package sg.com.crimsonlogic.darren.springbootdemo.entity;

import org.springframework.context.annotation.Configuration;

@Configuration
public class NavbarBean {

	private String currentPage;
	
	public NavbarBean() {
	}

	public String getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	
	
}
