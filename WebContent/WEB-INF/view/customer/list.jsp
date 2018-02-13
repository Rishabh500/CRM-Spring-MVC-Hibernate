<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<title>List Customer</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2 class="p-4 bg-secondary text-warning">CRM:- Customer Relationship Managers</h2>
		<br>
		<br>
		<a class="btn btn-primary mb-4" href="showAddForm">Add New Customer</a>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>First name</th>
					<th href="sortLastName">Last name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${customers}">
				<c:url var="updateLink" value="/customer/updateForm">
					<c:param name="customerId" value="${customer.id }"></c:param>
				</c:url>
				<c:url var="deleteLink" value="/customer/deleteCustomer">
					<c:param name="customerId" value="${customer.id }"></c:param>
				</c:url>
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td><a class="btn btn-success xs-4" href="${updateLink}">Update</a>
						<a class="btn btn-danger xs-4" href="${deleteLink}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>