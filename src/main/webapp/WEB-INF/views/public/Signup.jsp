<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html  >
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/kisspng-airplane-aircraft-maintenance-flight-transport-aeroplane-5ac7b14f05e3e0.1254718215230364950241-96x55.jpg" type="image/x-icon">
  <meta name="description" content="">
  <title>Signup</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/web/assets/mobirise-icons2/mobirise2.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/animatecss/animate.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/dropdown/css/style.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/theme/css/style.css">
  <link rel="preload" href="https://fonts.googleapis.com/css?family=Inter+Tight:100,200,300,400,500,600,700,800,900,100i,200i,300i,400i,500i,600i,700i,800i,900i&display=swap" as="style" onload="this.onload=null;this.rel='stylesheet'">
  <noscript><link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inter+Tight:100,200,300,400,500,600,700,800,900,100i,200i,300i,400i,500i,600i,700i,800i,900i&display=swap"></noscript>
  <link rel="preload" as="style" href="${pageContext.request.contextPath}/assets/mobirise/css/mbr-additional.css?v=1V97IJ"><link rel="stylesheet" href="${pageContext.request.contextPath}/assets/mobirise/css/mbr-additional.css?v=1V97IJ" type="text/css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets2/css/signup.css">
</head>
<body>
  
  <section data-bs-version="5.1" class="menu menu2 cid-tJS6tZXiPa" once="menu" id="menu02-1j">
	

	<nav class="navbar navbar-dropdown navbar-fixed-top navbar-expand-lg">
		<div class="container">
			<div class="navbar-brand">
				<span class="navbar-logo">
						<img src="${pageContext.request.contextPath}/assets/images/kisspng-airplane-aircraft-maintenance-flight-transport-aeroplane-5ac7b14f05e3e0.1254718215230364950241-96x55.jpg" style="height: 3rem;">
				</span>
				<span class="navbar-caption-wrap"><a class="navbar-caption text-black text-primary display-7" href="index.html#header05-1">Flight Reservation</a></span>
			</div>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-bs-toggle="collapse" data-target="#navbarSupportedContent" data-bs-target="#navbarSupportedContent" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
				<div class="hamburger">
					<span></span>
					<span></span>
					<span></span>
					<span></span>
				</div>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<div class="navbar-buttons mbr-section-btn"><a class="btn btn-primary display-4" href="/">&nbsp; &nbsp;HOME&nbsp; &nbsp;&nbsp;<br></a></div>
			</div>
		</div>
	</nav>
</section>
<main>
	<div class="container">
		<div class="main">
			<div> 
				<h3>Signup</h3>
			</div>
			<div class="form">
                <form action="verifySignup" method="post">
				<div class="inputbox">
					<label for="">First Name</label>
					<input type="text" name="firstName" id="">
				</div>
                <div class="inputbox">
					<label for="">Last Name</label>
					<input type="text" name="lastName" id="">
				</div>
                <div class="inputbox">
					<label for="">Create UserName</label>
					<input type="text" name="username" id="">
				</div>
                <div class="inputbox">
					<label for="">Email</label>
					<input type="email" name="email" id="">
				</div>
				<div class="inputbox">
					<label for="">Password</label>
					<input type="text" name="password" id="">
				</div>

				<div class="submit-btn">
					<input type="submit" value="Signup" name="" id="">
				</div>
			</form>
            </div>
			<div class="msg">
				${msg}
			</div>
			<div class="links">
				<p>Already have Account? <a href="/login">Login</a></p>
			</div>
		</div>
	</div>
</main>



<script src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.bundle.min.js"></script>  <script src="${pageContext.request.contextPath}/assets/smoothscroll/smooth-scroll.js"></script>  <script src="${pageContext.request.contextPath}/assets/ytplayer/index.js"></script>  <script src="${pageContext.request.contextPath}/assets/dropdown/js/navbar-dropdown.js"></script>  <script src="${pageContext.request.contextPath}/assets/theme/js/script.js"></script>  
  
</body>
</html>