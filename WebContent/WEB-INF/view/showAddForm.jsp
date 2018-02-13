<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<title>Add New Customer</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
	
			<h1 class="text-primary pt-3 pb-3 bg-secondary text-warning pr-4">Add New Customers</h1>
		
		<div class="row"> <a href="list" class="btn btn-danger btn-sm ml-4 mt-4">Back</a>
		</div>
			<form:form action="saveCustomer" class="form-horizontal pt-4" modelAttribute="customer"
				method="POST">
				<form:hidden path="id" />
				<div class="form-group">
					<label class="control-label col-sm-2" for="fname">First
						Name:</label>
					<div class="col-sm-10">
						<form:input type="firstName" class="form-control" id="fname"
							path="firstName" placeholder="Enter First Name" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="lname">Last
						Name:</label>
					<div class="col-sm-10">
						<form:input type="lastName" class="form-control" id="lname"
							path="lastName" placeholder="Enter Last Name" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Email:</label>
					<div class="col-sm-10">
						<form:input type="email" class="form-control" id="email"
							path="email" placeholder="Enter email" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-success"></input>
					</div>
				</div>
			</form:form>


	</div>
</body>
</html>
