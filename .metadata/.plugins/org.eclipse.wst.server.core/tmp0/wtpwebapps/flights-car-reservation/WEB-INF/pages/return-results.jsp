<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Reservations</a>
    </div>
    
    <ul class="nav navbar-nav navbar-right">
    	 <li><a href="${pageContext.request.contextPath}/contact"><span class="glyphicon glyphicon-earphone"></span> Contact</a></li>
      <li><a href="${pageContext.request.contextPath}/account"><span class="glyphicon glyphicon-home"></span> Home</a></li>
   <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-out"></span> Log-out</a></li>
    </ul>
  </div>
</nav>

<div class="container">
<div class="panel panel-primary">
	<div class="panel-heading"><h2 class="text-center">Flight results - Return way</h2></div>
	<div class="panel-body">
<c:forEach items = "${list}" var="item">
<form action="${pageContext.request.contextPath}/returnBooking" method="post">
<div class="panel panel-default">

    <div class="panel-heading"><p class="text-left">${dest} - ${origin}</p><p class="text-right"> ${item.getCost()}</p></div>
    <div class="panel-body ">
    <p class="text-center">Date: ${depart}<br>
    Time(Local times) - Departure: ${item.getDepartTime()} Arrival:${item.getArrivalTime() }
    <br>Terminal - Departure:${item.getDepartTerm()} Arrival:${item.getArrivalTerm()}<br>
    Duration - ${item.getDuration()}min Distance - ${item.getDistance()} <br>
    Airline - ${item.getAirline()} Flight Number - ${item.getFlightNum() } <br></p>

<div class="text-center">
    
	<button type="submit" name="got" value = ${item.getId()}  class="btn btn-primary">Book</button>
	</div>
	
</div></div>
</form>
</c:forEach>
</div></div>

</div>
</body>
</html>
