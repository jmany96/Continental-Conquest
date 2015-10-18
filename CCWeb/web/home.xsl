<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">



<xsl:template match="/">

<html>
	<head><link rel="stylesheet" type="text/css" href="home.css"/>
		<title>Home Page</title>
	</head>
		<body>
			<content>
			<br/><br/>
			Enter Username:
			<input type="text" name="firstname" value=""/>
			<br/><br/>
			Enter Password:
			<input type="text" name="lastname" value=""/>
			<br/><br/>
			<input type="submit" value="Login"/>
			<p><a href="http://www.google.com"><font color="white"> Sign Up Here</font></a></p>
			</content>
			<footer>
			</footer>
		</body>
</html>

</xsl:template>
</xsl:transform>
