                      <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<form action="/account" method="POST" modelAttribute="account">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Reservations</a>
    </div>
    
    <ul class="nav navbar-nav navbar-right">
    	 <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
      <li><a href="${pageContext.request.contextPath}/register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
   <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<div class="wrapper">
    
     <a href="/Hospital-portal/HospRegister.jsp;[]" button type="button" class="btn btn-success">Start Exploring</a></button>
 
</div>
<style>


.wrapper{
text-align:center;
}
body {

 background-color:seagreen;
    color:black;
    background-image: url("http://cdn.wonderfulengineering.com/wp-content/uploads/2014/05/airplane-wallpaper-24.jpg");
    background-repeat:no-repeat;
    background-size: cover;
}

</style>
</body>
</html>