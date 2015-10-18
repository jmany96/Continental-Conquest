<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">



<xsl:template match="/">

<html>
	<head><link rel="stylesheet" type="text/css" href="home.css"/>
		<title>Home Page</title>
	</head>
		<body bgcolor="#b0e0e6">
	
			<div id ="content1">
					<div id="menu" align="center">	
		<ul>
			<p><a href="AboutServlet"><li class="tabs">Home </li></a> </p>
			
			<p><a href="PreviewServlet"><li class="tabs">Preview</li></a></p>

			<p><a href="HomeServlet"><li class="tabs">Register</li></a></p>
			
			<p><a href="GameServlet"><li class="tabs">Demo</li></a></p>

		</ul> 
	</div>
			<br/><br/>
			<img src="logo.png" height="200" width="200"/>
			<br/><br/>
			<p><font > Continental Conquest is an interactive learning game that is targeted to kids between the ages of 8 and 13. The founders of Continental Conquest, Sean Trant, John Noone, Declan Casey, Aron Ryan and Jason Manyara, have dedicated their lives to making Continental Conquest a fun and enjoyable learning experience. It has been designed to offer a challenging but fun experience for our players. Completed with tutorials it has everything you need to gain a better understanding of other countries history, geography as well as culture among other things.  </font></p>
			<a href="PreviewServlet"><li class="tabs">Get the game</li></a>
			
			</div>
			<footer1>
			</footer1>
			
		</body>
</html>

</xsl:template>
</xsl:transform>
