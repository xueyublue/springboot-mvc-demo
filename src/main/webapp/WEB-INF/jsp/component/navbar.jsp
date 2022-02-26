<!-- Top Navigation Bar -->
<nav class="navbar sticky-top navbar-expand-md navbar-dark bg-dark">
	<div class="container">
		<a class="navbar-brand" href="#">CRM</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar" aria-expanded="false">
	    	<span class="navbar-toggler-icon"></span>
	  	</button>
	  	<div class="collapse navbar-collapse" id="navbar">
	  		<ul class="navbar-nav mr-auto">
	  			<li class="nav-item ${navbar.currentPage=='employees' ? 'active' : ''}">
		        	<a class="nav-link" href="${pageContext.request.contextPath}/employees/list">Employees</a>
		      	</li>
	  			<li class="nav-item ${navbar.currentPage=='about' ? 'active' : ''}">
		        	<a class="nav-link" href="${pageContext.request.contextPath}/about">About</a>
		      	</li>
	  		</ul>
	  		<form class="form-inline my-0 ml-auto">
	  			<button class="btn btn-outline-info" type="submit">Sign In</button>
	  		</form>
	  	</div>
	</div>
</nav>
