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
	<div class="panel-heading"><h2 class="text-center">Flights Reservation Summary - Round trip</h2></div>
	<div class="panel-body">
	<form action="${pageContext.request.contextPath}/finalPayment" method="GET">
		Travelling Date  - ${departDate}<br>
		Origin - ${one.getOrigin()} Destination - ${one.getDestination()}<br>
		
		Time(Local times) - Departure: ${one.getDepartTime()} Arrival:${one.getArrivalTime() }
    <br>Terminal - Departure:${one.getDepartTerm()} Arrival:${one.getArrivalTerm()}<br>
    Duration - ${one.getDuration()}min Distance - ${one.getDistance()} <br>
    Airline - ${one.getAirline()} Flight Number - ${one.getFlightNum() }<br>
    No of childs - ${one.getChilds() } No of Adults - ${one.getAdults() }<br><br>
    Cost of single ticket  - ${one.getCost() }
    <br>
    <br>
    <p>Return Journey details</p>
    Travelling Date  - ${returnDate}<br>
    Origin - ${two.getOrigin()} Destination - ${two.getDestination()}<br>
		
		Time(Local times) - Departure: ${two.getDepartTime()} Arrival:${two.getArrivalTime() }
    <br>Terminal - Departure:${two.getDepartTerm()} Arrival:${two.getArrivalTerm()}<br>
    Duration - ${two.getDuration()}min Distance - ${two.getDistance()} <br>
    Airline - ${two.getAirline()} Flight Number - ${two.getFlightNum() }<br>
    No of childs - ${two.getChilds() } No of Adults - ${two.getAdults() }<br><br>
    Cost of single ticket  - ${two.getCost() }
    <br><br>
    Final Price -  ${finalPrice}
    <br>
    <div class="text-center">
    
	<button type="submit" name="got" value = ${finalPrice}  class="btn btn-primary">Book</button>
	</div>
	</form>
</div></div>

</div>
</body>
</html>
