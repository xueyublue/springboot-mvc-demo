<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<div class="container mt-2 table-responsive-sm">
		<button class="btn btn-info" onclick="window.location.href='showFormForAdd'; return false;"><i class="bi bi-plus-square"></i> Add Employee</button>
		<table class="table table-striped table-sm mt-2">
			<thead class="thead-dark">
				<tr>
					<th style="width: 30px;"></th>
					<th style="width: 30px;"></th>
					<th class="text-nowrap">First Name</th>
					<th class="text-nowrap">Last Name</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employees}" var="employee">
					<c:url var="updateLink" value="/employees/showFormForUpdate">
						<c:param name="employeeId" value="${employee.id}" />
					</c:url>
					<c:url var="deleteLink" value="/employees/delete">
						<c:param name="employeeId" value="${employee.id}" />
					</c:url>
					<tr>
						<td>
							<a href="${updateLink}" class="btn btn-info btn btn-block"><i class="bi bi-pencil-square"></i></a>
						</td>
						<td>
							<a href="${deleteLink}" class="btn btn-danger btn btn-block"
								onclick="if(!(confirm('Are you sure want to delete this employee?'))) return false"><i class="bi bi-pencil-square"></i></a>
						</td>
						<td>${employee.firstName}</td>
						<td>${employee.lastName}</td>
						<td>${employee.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
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