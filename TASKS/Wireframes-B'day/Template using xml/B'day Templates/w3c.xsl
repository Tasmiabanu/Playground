<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns="http://www.w3.org/1999/xhtml">
	<xsl:template match="/">

		<html>
			<style type="text/css">
body{
      background-color: #F6F8F9;
      margin:0px;
      padding:0px;
	  height:500px;
}
.templates { 
	color: white; 
	background-color : gray; 
	width: 80%;
		height: 400px;
	margin-left:10%;
} 
.heading { 
	color:rgba(0, 255, 255, 0.459); 
	font-size : 40px; 
	/* background-color : powderblue;  */
	margin-left: 37%;
} 
.main{
display : block; 
	padding: 1%;
	margin-left: 20%;
	font-size:20px;
}
.a{
	color:blue;

}
.title { 
	font-size : 30px; 
	font-weight : bold; 
	padding: 5%;
	margin-left: 35%;
} 
.wish{
	font-size : 30px; 
	font-weight : bold; 
	padding: 5%;
	padding-top:15%;
	font-style:italic;
	margin-left: 20%;
}
.emoji1{
	margin-top:10px;
}
.dhoni{
	padding:4%;
	margin-left:20px;
}
.box{
	margin-left:200px;
}
.surprise{
   font-size : 25px; 
	font-weight : bold; 
	padding-top:70%;
	margin-left: 20%;
    color: lightgreen;
}
			</style>
			<body >
				<img src="img1.jpg" width="50%" height="50%"/>
				<div class="a">
					<h1 align="center">Hurrayyy!!</h1>
					<div class="templates">
						<span class="title">Its your Birthday</span>
						<img class="emoji1" src="emoji1.jpg" width="55px" height="60px"/>
						<span class="main">Hi</span>

						<!-- <img src="girl.jpg" width="55px" height="60px"/> -->
						<!-- <p>
                                       <label></label>
                                      <input class="box" type="text" name="naaa"/>
                                         </p> -->

						<span class="wish">WISH YOU A VERY HAPPY BIRTHDAY!!</span>
						<img src="emoji2.jpg" width="41px" height="41px"/>
						<span class="surprise">Did you know that Dhoni was also born today!!</span>
						<img class="dhoni" src="dhoni.jpg" width="55px" height="55px"/>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet> 