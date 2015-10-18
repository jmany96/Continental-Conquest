<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">



<xsl:template match="/">

<html>
	<head><link rel="stylesheet" type="text/css" href="home.css"/>
		<title>Play Game</title>
	</head>
		<body bgcolor="#b0e0e6">
		
			<div id="content1">
				<div id="menu" align="center">	
		<ul>
		<p><a href="AboutServlet"><li class="tabs">Home </li></a> </p>
			
			<p><a href="PreviewServlet"><li class="tabs">Preview</li></a></p>

			<p><a href="HomeServlet"><li class="tabs">Register</li></a></p>
			
			<p><a href="GameServlet"><li class="tabs">Demo</li></a></p>
		</ul> 
	</div>

			<div class="demo" align="center"><p>Test your knowledge!</p><embed src="demo.swf"  width="700px" height="400px" /></div>
			<p>note: this is a demo for advertising purposes and is not representative of the final product.</p>
			</div>
			
			<footer>
			</footer>
		</body>
</html>

</xsl:template>
</xsl:transform>
