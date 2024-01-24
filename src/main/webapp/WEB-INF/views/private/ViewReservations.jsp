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
 <h2>FLight Details</h2>
 flightNumber: ${flights.flightNumber }
 <br> operatingAirlines: ${flights.operatingAirlines }
 <br> departureCity: ${flights.departureCity }
<br> arrivalCity: ${flights.arrivalCity } <br>
dateofDeparture: ${flights.dateofDeparture } <br>
estimatedDepartureTime:
${flights.estimatedDepartureTime }
 <br>
 <h2>Passenger Details</h2>
 <form action="confirmRegistration" method="post">
 <pre>
 First Name<input type="text" name="firstName" />
last Name<input type="text" name="lastName" /> Middle
Name<input type="text" name="middleName" />
 Email<input type="text" name="email" />
Phone<input type="text" name="phone" />
<input type="hidden" name="id" value="${flights.id}" />
 <h2>Enter the card details</h2>
 Card Number<input type="text" /><br />
 CVV<input type="text" /><br />
 Expiry Date<input type="text" /><br />
 Amount<input type="text" /><br />
 <input type="Submit" value="proceed" />
 </pre>
 </form>
</body>
</html>