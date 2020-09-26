<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<%@ include file="navbar.jsp"%>




	<div class="row">
		<div class="col-4 "></div>
		<div class="col-4 ">
			<div class=text-center>
				<h1>KrishpenShop.com</h1>
			</div>
			<div class="alert alert-danger" role="alert">

<form:errors path="user.*" />
</div>
			<div class="card">



				<div class="container">
					<div class="center">
						<h2>Add new user</h2>
						<%
							String msgs = (String) request.getAttribute("msg");
						%>

					</div>

					<%
						if (msgs != null) {
					%>
					<div class="card bg-success text-white">
						<div class="card-body"><%=msgs %></div>
					</div>
					<%
						}
					%>

					<form action="saveNewUser" method="post">

						<div class="form-group">
							<label for="text">Name:</label> <input type="text"
								class="form-control" id="name" placeholder="Enter name"
								name="userName">
						</div>

						<div class="form-group">
							<label for="text">Number:</label> <input type="text"
								class="form-control" id="Number" placeholder="Enter PhoneNumber"
								name="userNumber">
						</div>
						<div class="form-group">
							<label for="text">Email:</label> <input type="text"
								class="form-control" id="Email" placeholder="Enter Email"
								name="useremail">
						</div>
						<div class="form-group">
							<label for="password">Password:</label> <input type="password"
								class="form-control" id="password" placeholder="Enter password"
								name="userpassword">
						</div>

						<div class="checkbox">
							<label><input type="checkbox" name="remember">
								Remember me</label>
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>


					<div class="checkbox">
						<a href="singin" class="btn btn-info" role="button">Sing IN</a>
					</div>
				</div>



			</div>
		</div>
	</div>

</body>
</html>