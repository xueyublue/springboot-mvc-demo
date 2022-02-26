<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>CRM</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
</head>
<body class="d-flex flex-column h-100">
	<!-- Top Navigation Bar -->
	<%@include file="./component/navbar.jsp" %>
	
	<!-- Main Container -->
	<div class="container mt-2">
		<h4>Add Employee</h4>
		<hr />
		<form:form action="saveEmployee" modelAttribute="employee" method="POST">
			<form:hidden path="id" />
			<form:input path="firstName" class="form-control mb-4 col-12 col-md-6 col-lg-4" placeholder="First Name" />
			<form:input path="lastName" class="form-control mb-4 col-12 col-md-6 col-lg-4" placeholder="Last Name" />
			<form:input path="email" class="form-control mb-4 col-12 col-md-6 col-lg-4" placeholder="Email" />
			<button type="submit" class="btn btn-info mb-4 col-12 col-md-6 col-lg-4"><i class="bi bi-save"></i> Save</button>
		</form:form>
		<hr />
		<a href="${pageContext.request.contextPath}/">Back to Employee List</a>
	</div>
	
	<!-- Footer -->
	<%@include file="./component/footer.jsp" %>
	
	<!-- Scripts -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
		crossorigin="anonymous"></script>
</body>
</html>