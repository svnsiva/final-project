<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	
<style>


body{

background:white;

}
.thumbnail
{
    margin-bottom: 40px;
    padding: 0px;
    -webkit-border-radius: 0px;
    -moz-border-radius: 0px;
    border-radius: 0px;
}

.item.list-group-item
{
    float: none;
    width: 100%;
    background-color: #fff;
    margin-bottom: 10px;
}
.item.list-group-item:nth-of-type(odd):hover,.item.list-group-item:hover
{
    background: #428bca;
}

.item.list-group-item .list-group-image
{
    margin-right: 10px;
}



.item img{
	
	display:inline-block; 	
  

}

.item
{
text-align:center;
display: inline-block;     /* arranging the div elements-->*/
  margin: 0px 2% 5rem 2%;
  width: 45%;
  position:relative;
  overflow:hidden;  /* setting responsive design */
  }
</style>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Reservations</a>
    </div>
    
    <ul class="nav navbar-nav navbar-right">
       <li><a href="${pageContext.request.contextPath}/contact"><span class="glyphicon glyphicon-earphone"></span> Contact</a></li>
   <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-out"></span> Log-out</a></li>
    </ul>
  </div>
</nav>

<div class="container">
    <br><br>
    <div id="products" class="row list-group">
        <div class="item">
            <div class="thumbnail">
                <img src="http://www.arppartners.com/eng/images/ethiad.jpg" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Explore USA</h4>
                    <p class="group inner list-group-item-text">
                        We help you find the most economical airline tickets</p>
                    <div class="row">
                        <form class="form" action="${pageContext.request.contextPath}/search" method="get">
  
    <label for="name"></label>
    
 <div class="wrap">
                             <button type="submit" class="btn btn-success btn-lg">Search Flights</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="thumbnail">
                <img src="http://www.hdcarwallpapers.com/walls/bmw_4_series_gran_coupe_m3-HD.jpg"/>
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Search Cars</h4>
                    <p class="group inner list-group-item-text">
                     Find cars with the cheapest prices around </p>
                    <div class="row">
 <form class="form" action="${pageContext.request.contextPath}/cars" method="get">
  
    <label for="name"></label>
    <br>
    <div class="wrap">
  <button type="submit" class="btn btn-success btn-lg"> Search Cars</button>
  </div>
  </form>
                        
                        
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="thumbnail">
                <img src="https://fthmb.tqn.com/oq7X6EFyCgjY-47vgZSIBUTZYlw=/768x0/filters:no_upscale()/about/bills-57d1a3d83df78c71b633a31d.png"/>
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Car Bills</h4>
                        <p class="group inner list-group-item-text">
                        View the Previous Billings of Your Cars
                      </p>
                      <br>
                         <form class="form-horizontal" action="${pageContext.request.contextPath}/carbills" method="get">
    
  <button type="submit" class="btn btn-success btn-lg">Car Bills</button>
  
  </form>
                    
                    
                </div>
            </div>
        </div>

        <div class="item">
            <div class="thumbnail">
                <img src="https://fthmb.tqn.com/oq7X6EFyCgjY-47vgZSIBUTZYlw=/768x0/filters:no_upscale()/about/bills-57d1a3d83df78c71b633a31d.png"/>
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        Flight Bills</h4>


                    <p class="group inner list-group-item-text">
                    View Previous Billings of Flight Tickets
                     </p>
                     <br>

                        <form class="form-horizontal" action="${pageContext.request.contextPath}/flightbills" method="get">
    
  <button type="submit" class="btn btn-success btn-lg">Flight Bills</button>
  
  </form>
                    
                </div>
            </div>
        </div>
        

</body>
</html>