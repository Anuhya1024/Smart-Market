<!DOCTYPE html>
<html>
    			<link rel="stylesheet" href="../css/style1.css" />
<style>
form {
    border: 3px solid skyblue;
}

input[type=text], input[type=password] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: skyblue;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: blue;
    cursor: pointer;
    width: 25%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 10px 0 5px 0;
}

/*.container {
    padding: 16px;
}*/
div.container1 {
		position: relative;
		width: 100%;
		
		}
		div.container {
		float: left;
		width: 50%;
		background: #ffffff;
		}	
		div.container2 {
		float: right;
		width: 50%;
		background: #ffffff;

		}
		
/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn {
       width: 25%;
    }
}
</style>
<body>

			<header id="header">
				<h1><font color="skyblue"><a href="HomePage.html">SMART MARKET</a></font></h1>
				<nav id="nav">
					<ul>
						<li><a href="HomePage.html">HOME</a></li>
						<li>About Us</li>
					</ul>
				</nav>
			</header><br>
                        
<div class="container1">

  <div class="container" >
      <form method="post" action="./LoginUseAction.jsp" > 
          <br>
          &nbsp;<h2><font color="skyblue"><u>User Login Form</u></font></h2> <br><br> 

    &nbsp;&nbsp;<label><b>Username</b></label><br>
   &nbsp;&nbsp; <input type="text" placeholder="Enter Username" name="uname" required><br><br>

   &nbsp;&nbsp; <label><b>Password</b></label><br>
    &nbsp;&nbsp;<input type="password" placeholder="Enter Password" name="upwd" required><br><br>
        
    &nbsp;&nbsp;<button type="submit">Login</button><br>
    </form>
  </div>

<div class="container2" >
    <form action="./LoginAdminAction.jsp" method="post">
        <br>
       &nbsp; <h2><font color="skyblue"><b><u>ADMIN Login</u> </b></font></h2>  <br><br>

    &nbsp;&nbsp;<label><b>Username</b></label><br>
   &nbsp;&nbsp; <input type="text" placeholder="Enter Username" name="aname" required><br><br>

    &nbsp;&nbsp;<label><b>Password</b></label><br>
    &nbsp;&nbsp;<input type="password" placeholder="Enter Password" name="apwd" required><br><br>
        
    &nbsp;&nbsp;<button type="submit">Login</button><br>
   
  </div>
    
  </div>
</body>
</html>