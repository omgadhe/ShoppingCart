<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!Doctype html>
<html>
<head>
<title>Dubai Marina Mall</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
</style>
</head>
<body>
<div class="row" >
<div class="col-md-2" >
<img src="/Images/logo.jpg" width="130px" height="130px" />
</div>
<div class="col-md-10" >
<table align="right" style="margin-top: 6%; margin-right: 5%;">
<tr>
<th style="font-size:24px;"><a href="#">Home |</a></th> 
<th style="font-size:24px;"><a href="#">Shops |</a></th> 
<th style="font-size:24px;"><a href="#">Brands |</a></th> 
<th style="font-size:24px;"><a href="#">Dining |</a></th> 
<th style="font-size:24px;"><a href="#">Offers |</a></th> 
<th style="font-size:24px;"><a href="#">About Us</a></th>
</tr>
</table>
</div>
</div>
<div class="row" style="background-color: grey;">
	<div class="col-md-1" ></div>
	<div class="col-md-10">
        <img class="mySlides" src="/Images/eight.jpg" />
        <img class="mySlides" src="/Images/five.jpg"/>
        <img class="mySlides" src="/Images/seven.jpg"/>
        <img class="mySlides" src="/Images/nine.jpg"/>
        <img class="mySlides" src="/Images/six.jpg"/>
        <img class="mySlides" src="/Images/ten.jpg"/>
    </div>
    <div class="col-md-1" style="background-color: #B8B8B8;"></div>
</div>
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 4000); // Change image every 2 seconds
}
 function validate(){
 	var name=document.getElementById("uname").value;
 	var pw=document.getElementById("pass").value;
 	if(name.length < 6){
 		document.write("Invalid Username");
 	}
 	else if(pw.length < 7){
 		document.write("Invalid Password")
 	}
 }
</script>
<hr>
  <div class="row">
     <div class="col-md-1"></div>
    <div class="col-md-7" style="background-color: #FFB6C1;">
	<h1>Welcome to Dubai Marina Mall	</h1>
      <p>The Shopping destination of Pune where the city meets to Shop, Eat and have a great time.  Situated only 20 minutes from Koregaon Park, its spread across an expanse of 1.2 million sq. ft.</p>
     <p>Its award winning architecture has two separate Blocks: West Blok &amp; East Blok, each unique in design & provides for an unforgettable experience.  The beautiful landscaped open space in between – Oasis has become the epicenter of entertainment. It's not just a mall, it's almost like a charming little town with 150 stores housing over 500 national &amp; international brands, 50 food &amp; beverage outlets, hypermarket, multiplex, gaming zone &amp; a wide choice of home &amp; electronics. </p>
     <p>With live performances &amp; events lined up across the year, its Pune's favorite go - to place for all. Visit us, with your family, friends, loved ones or alone, we promise there's something for everyone! </p>
     <br/>
    </div>
    <div class="col-md-3" style="margin-top: 1%; margin-left: 2%;">
    	<form onsubmit="validate()"  method="post" action="">
    		<p style="font-size: 18px;"><b>Username: </b><input type="text" name="uname" id="uname"/></p><br>
    		<p style="font-size: 18px;"><b>Password: </b><input type="Password" name="pass" id="pass"/></p> <br>
    		<input type="submit" value="Login"><br><br>
    	</form>
    	<a href="">Forgot Password?</a><br>
    	<a href="">Create new account</a>
    </div>
  </div>
</div>
<hr>
<div class="row" id="back">
  <div class="col-md-2"></div>
	<div class="col-md-4">
        <h1 style="font-">Upcoming Events</h1>
    </div>
    <div class="col-md-4">
            <h1>Connect With Us </h1>
            <ul>
              <li><a href="https://www.facebook.com/dubaimarinamall" target="_blank"><img src="fb.png" alt="Facebook" > Facebook</a></li><br>
              <li><a href="https://twitter.com/DXBMarinaMall" target="_blank"><img src="twit.png" alt="Twitter" > Twitter</a></li><br>
              <li><a href="https://www.youtube.com/channel/UC-m7tVWMOFiprwf3Hzb7TQA" target="_blank"><img src="you-tube.jpg" alt="you-tube" > You Tube</a></li><br>
              <li><a href="https://www.instagram.com/dubaimarinamall/" target="_blank"><img src="instagram.png" alt="Instagram"> Instagram</a></li><br>
            </ul>
      
      </div>
    </div>
  <div class="col-md-2"></div>
</div>  
<hr>
<footer style="border-color: darkgrey;">
	Dubai Marina Mall<br>
	<p style="text-align: center;">Copyright © 2017 - 18   Privacy Policy</p>
</footer>
</body>
</html>