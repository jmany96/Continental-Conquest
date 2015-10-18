<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  
  <head>
  <title>Preview Page</title>
  <link rel="stylesheet" type="text/css" href="home.css"/>
  <script type="text/javascript" src="JS_DB_CODE.js"></script>
  <script type="text/javascript" src="http://www.google.com/jsapi"></script>
  <script type="text/javascript">

function TDView()
{
var img = document.getElementById("1");
img.src="worldPic.png";
return false;
}	
function TDView2()
{
var img = document.getElementById("2");
img.src="installer2.jpg";
return false;
}
function TDView3()
{
var img = document.getElementById("2");
img.src="installer1.png";
return false;
}
	 	     
function SideView()
{
var img = document.getElementById("1");
img.src="eurPic.png";
return false;
}	
function FrontView()
{
var img = document.getElementById("1");
img.src="amPic.png";
return false;
}	

    
  
function TopView()
{
var img = document.getElementById("1");
img.src="asPic.png";
return false;
}	

function RearView()
{
var img = document.getElementById("1");
img.src="amPic.png";
return false;
}	
function RearView2()
{
var img = document.getElementById("1");
img.src="ocPic.png";
return false;
}	   
              
</script>
</head>

  <body bgcolor="#b0e0e6">
			<br/>
			<br/>
			<br/>
			<br/>
  <div id ="content1">
	<div id="menu" align="center">	
		<ul>
			<p><a href="AboutServlet"><li class="tabs">Home </li></a> </p>
			
			<p><a href="PreviewServlet"><li class="tabs">Preview</li></a></p>

			<p><a href="HomeServlet"><li class="tabs">Register</li></a></p>
			
			<p><a href="GameServlet"><li class="tabs">Demo</li></a></p>

		</ul> 
	</div>

	
	
			<p>

					<div class="txtDesc"><h1 align="center"><u>Screenshots</u></h1></div>
			<div class="imeges" align="center">
			<p><img id="1" src="worldPic.png" align="center" border="0"/></p>
			</div>
			<div class="txtDesc" align="center"> Click a button to change screenshots</div>
	
			


			
			<p align="center">
			<input onclick="TDView();" class="batan" type="submit" value="World Map" />
			<input onclick="SideView();" class="batan" type="submit" value="Europe" />
			<input onclick="FrontView();" class="batan" type="submit" value="America" />
			<input onclick="TopView();" class="batan" type="submit" value="Asia" />
			<input onclick="RearView();" class="batan" type="submit" value="Africa" />
			<input onclick="RearView2();" class="batan" type="submit" value="Oceania" />
			<br/>
			</p>
			
			</p>
			<br/>
			<br/>
			<br/>
			<p>
			<a href ="https://s9.solidfilesusercontent.com/OWJmZDdmZDY1MGI4YWEyY2EzOGExZmEyYmFlYjc4N2I5MDA1ZTRmYjoxWWtZOXQ6NjY1ODVkekkwR29LZ0J5ZnMtRTk5WGVIXzZZ/a41dd6b68f/Continental_Conquest-setup.exe"><img src="playnow.jpg" height="100" width="200"/></a>
			<div class="txtDesc"><h1 align="center"><u>How to install</u></h1></div>
			<p><img id="2" src="installer1.png" align="center" border="0"/></p>
			<p >Simply click <u>next</u> on every window, the game will install and run when it is finished.</p>
			<p align="center">
			<input onclick="TDView3();" class="batan" type="submit" value="Previous" align="left"/>
			<input onclick="TDView2();" class="batan" type="submit" value="Next" align="right"/>
			<br/>
			</p>
			
			
			</p>
			
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>			
			
			
			
		</div>	
  </body>
  </html>

  </xsl:template>
</xsl:stylesheet>

