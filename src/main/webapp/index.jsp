<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript">
	let cityName = ["London", "New Delhi","Toronto"];
	let london = "<h1>London</h1><p>London is the capital city of England. It is the most populous city in the  United Kingdom,"+
	"with a metropolitan area of over 13 million inhabitants.</p>" + 
	"<p>Standing on the River Thames London has been a major settlement for two millennia,"+
	"its history going back to its founding by the Romans, who named it Londinium. </p>";
	let newDelhi = "<h1>New Delhi</h1><p>New Delhi is the capital city of India. It is the most polluted city in the World,"+
	"and a metropolitan area of over 32 million inhabitants.</p><p>" +
	"Delhi sits astride the Yamuna River, Delhi is of great historical significance as an important commercial,"+
	"transport, and cultural hub, as well as the political centre of India.</p>";
	let toronto = "<h1>Toronto</h1><p> Toronto is the largest city of Canada. It is the most populated city in Canada,"
	"and a metropolitan area of over 6 million inhabitants.</p><p>" +
	"Toronto is Ontario\'s capital city, Canada\'s largest municipality and the fourth largest city in North America </p>";
	let descCity = [london, newDelhi, toronto];
	
	
	
	function initCity()	{
		document.getElementById("city").innerHTML = descCity[0];
	}
	
	function newCity(cityId)	{
		document.getElementById("city").innerHTML = descCity[cityId];
	}
</script>
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #666;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 300px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section::after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>

<title>Madhukar Library</title>
</head>
<body onload="initCity()">
<h2>CSS Layout Float</h2>
<p>In this example, we have created a header, two columns/boxes and a footer. On smaller screens, the columns will stack on top of each other.</p>
<p>Resize the browser window to see the responsive effect (you will learn more about this in our next chapter - HTML Responsive.)</p>

<header>
  <h2>Cities</h2>
</header>

<section>
  <nav>
    <ul>
      <li><a href="#" onclick="newCity(0)">London</a></li>
      <li><a href="#" onclick="newCity(1)">New Delhi</a></li>
      <li><a href="#" onclick="newCity(2)">Toronto</a></li>
    </ul>
  </nav>
  
  <article id="city">
    <h1>London</h1>
    <p>London is the capital city of England. It is the most populous city in the  United Kingdom, with a metropolitan area of over 13 million inhabitants.</p>
    <p>Standing on the River Thames, London has been a major settlement for two millennia, its history going back to its founding by the Romans, who named it Londinium.</p>
  </article>
</section>

<footer>
  <p>Footer</p>
</footer>
</body>
</html>