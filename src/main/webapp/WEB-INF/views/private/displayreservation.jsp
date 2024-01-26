<%@ page language="java" contentType="text/html;
charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Passenger Detail details</h3>
firstName:${r.getPassenger().firstName }
<br> lastName:${r.getPassenger().lastName }
<br> middleName:${r.getPassenger().middleName }
<br> email:${r.getPassenger().email }
<br> phone:${r.getPassenger().phone }
<br>
<h3>Flight Details</h3>
flightNumber:${r.getFlight().flightNumber }
<br>
operatingAirlines:${r.getFlight().operatingAirlines }
<br> departureCity:${r.getFlight().departureCity }
<br> arrivalCity:${r.getFlight().arrivalCity }
<br> dateOfDeparture:${r.getFlight().dateOfDeparture }
<br>
estimatedDepartureTime:${r.getFlight().estimatedDepartureT
ime }
<br>
<h2>Update No of Bags&Status</h2>
<form action="proced" method="post">
<pre>
ReservationId<input type="text" name="id"
value="${r.id }">
NumberOf Bags<input type="text"
name="numberOfBags">
<input type="submit" value="proced">
</pre>
</form>
</body>
</html>