<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>
 <h2>Flight Search Results</h2>
<table border="1">
<tr>
 <tr>
 <th>Airlines</th>
 <th>Departure City</th>
 <th>Arrival City</th>
 <th>Departure Time</th>
 <th>Select Flight</th>
</tr>
<c:forEach items="${flights}" var="findFlights">

 <tr>
 <td>${findFlights.operatingAirlines}</td>
 <td>${findFlights.departureCity}</td>
 <td>${findFlights.arrivalCity}</td>

 <td>${findFlights.estimatedDepartureTime}</td>
 <td><a
href="showCompleteReservation?flightId=${findFlights.getId
()}">Select</a>
 </tr>
</c:forEach>
</body>
</html>