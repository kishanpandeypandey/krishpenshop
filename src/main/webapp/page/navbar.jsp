<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark">




		<div class="w3-sidebar w3-bar-block" style="display: none"
			id="mySidebar">
			<button onclick="w3_close()" class="w3-bar-item w3-button w3-large">Close
				&times;</button>
			<a href="#" class="w3-bar-item w3-button">Link 1</a> <a href="#"
				class="w3-bar-item w3-button">Link 2</a> <a href="#"
				class="w3-bar-item w3-button">Link 3</a>
		</div>

		<!-- Page Content -->
		<div class="w3-teal">
			<button class="w3-button w3-teal w3-xlarge" onclick="w3_open()"></button>
			<div class="w3-container"></div>
		</div>




		<script>
			function w3_open() {
				document.getElementById("mySidebar").style.width = "100%";
				document.getElementById("mySidebar").style.display = "block";
			}

			function w3_close() {
				document.getElementById("mySidebar").style.display = "none";
			}
		</script>


		<form action="/">
			<button type="submit" class="btn btn-default text-white ml-4 mr-4"><h1>Krishpen</h1></button>
		</form>

		<div class="dropdown">
			<button type="button" class="btn btn-primary dropdown-toggle bg-info"
				data-toggle="dropdown">All</button>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Link 1</a> <a
					class="dropdown-item" href="#">Link 2</a> <a class="dropdown-item"
					href="#">Link 3</a>
			</div>
		</div>





		<input type="text" class="form-control home-search col-6"
			placeholder="Search">


		<form action="Login">
			<button type="submit" class="btn btn-default text-white ml-4 mr-4"><h1>Login/SingUp</h1></button>
		</form>

<form action="/">
			<button type="submit" class="btn btn-default text-white ml-4 mr-4"><h3>Order</h3></button>
		</form>
<form action="/">
			<button type="submit" class="btn btn-default text-white ml-4 mr-4"><h3>Cart</h3></button>
		</form>


	</nav>
	<br>



</body>
</html>
