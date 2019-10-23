<?xml version="1.0" encoding="UTF-8"?> 
<xsl:stylesheet version="1.0" 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/xhtml"> 
<xsl:template match="/"> 


<html>
<style type="text/css">
.templates { 
	color: white; 
	background-color : gray; 
	width: 100%; 
} 
.heading { 
	color:rgba(0, 255, 255, 0.459); 
	font-size : 40px; 
	/* background-color : powderblue;  */
	margin-left: 37%;
} 
.main{
display : block; 
	padding: 2%;
	margin-left: 20%;
}
.title { 
	font-size : 35px; 
	font-weight : bold; 
	padding: 5%;
	margin-left: 30%;
} 
.surprise{
    padding: 4%;
    margin-left: 20%;
    color: lightgreen;
}
</style>



<body>
<h1 align="center">Hey there</h1>
<div class="templates">
<span class="title">Its your Birthday</span>

<span class="main">Hi</span>
<p>
<label>name</label>
  <input type="text" name="naaa"/>
  </p>
<span class="wish">WISH YOU A VERY HAPPY BIRTHDAY!!</span>
<span class="surprise">Did you know that Dhoni was also born today!!</span>


</div>
   
</body> 
</html> 
</xsl:template> 
</xsl:stylesheet> 