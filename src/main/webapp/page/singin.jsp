<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.example.demo.entitys.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
<div class="center">
</div>

<div class="row">
		<div class="col-4 "></div>
		<div class="col-4 ">
			<div class=text-center>
				<h1>KrishpenShop.com</h1>
			</div>
			<div class="card col-4">



				<div class="container">
					<div class="center">
						<h2>Login</h2>
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

<%
    Users user3 =  (Users)session.getAttribute("list");

if(user3 == null)
{

%>
  <form action="singInDetails" method ="post">
    <div class="form-group">
      <label for="email">Email/Mobile Number</label>
      <input type="text" class="form-control"  placeholder="Enter email or number" name="emailNumber">
    </div>
    
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
  
  <%
}
else {

  %>
  
   <form action="singInPassword" method="post">
    <div class="form-group">
      <label for="email">Password</label>
      <input type="password" class="form-control"  placeholder="Enter password" name="password">
    </div>
    
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
  
  <%} %>
  
  
  <div class="checkbox">
   <a href="addNewUser" class="btn btn-info" role="button">SingUp</a>
  </div>
</div>
</div>
</div>
</div>
</div>



</body>
</html>