<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.catalina.User"%>
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

<%@ include file="navbar.jsp" %>



<div class="container">
<h1>All User Detail </h1>
  <h2>Basic Table</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>            
  <table class="table">
    <thead>
      <tr>
        <th>Name</th>
        <th>Number</th>
        <th>Email</th>
      </tr>
    </thead>
          <%  List<Users> list = (List)request.getAttribute("userList"); 
          
         
          
          %>
          
    
    <tbody>
    <%  for(Users user : list){ %>
      <tr>
      
        <td><%=user.getUserName() %></td>
        <td><%=user.getUserNumber() %></td>
        <td><%=user.getUseremail() %></td>
        
      </tr>
      <%} %>
    </tbody>
  </table>
  <div class="checkbox">
   <a href="addNewUser" class="btn btn-info" role="button">Add new User</a>
  </div>
  
</div>

</body>
</html>