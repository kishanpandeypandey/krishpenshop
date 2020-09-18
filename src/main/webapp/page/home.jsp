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


	<div class="container">
		<div class="container-fluid">
			<div class="row">
				<div class="col-4 bg-success">

					<h2>Card Header and Footer</h2>
					<div class="card">
						<div class="card-header">Header</div>
						<div class="card-body">Content</div>
						<div class="card-footer">Footer</div>

					</div>
				</div>

				<div class="col-4 bg-warning">
					<h2>Card Header and Footer</h2>
					<div class="card">
						<div class="card-header">Header</div>
						<div class="card-body">Content</div>
						<div class="card-footer">Footer</div>

					</div>
				</div>


						<div class="col-4 bg-success">
							<h2>Card Header and Footer</h2>
							<div class="card">
								<div class="card-header">Header</div>
								<div class="card-body">Content</div>
								<div class="card-footer">Footer</div>

							</div>

						</div>
					</div>
				</div>



				<div class="checkbox">
					<a href="seeAiiUser" class="btn btn-info" role="button">See all
						User</a>
				</div>
				
				
			</div>
		</div>
</body>
</html>