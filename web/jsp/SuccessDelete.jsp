<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@include file="connect.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <style> 
        body.landing #header {
		background-color: black;
		left: 0;
		position: absolute;
		top: 0;
	}

	#header {
		background-color: #202222;
		color: #ffffff;
		cursor: default;
		height: 4.75em;
		line-height: 4.75em;
		width: 100%;
		z-index: 10000;
	}

		#header h1 {
			color: #ffffff;
			height: inherit;
			left: 2.5em;
			line-height: inherit;
			margin: 0;
			padding: 0;
			position: absolute;
			top: 0;
		}

			#header h1 a {
				font-size: 1.25em;
			}

		#header nav {
			height: inherit;
			line-height: inherit;
			position: absolute;
			right: 2.75em;
			top: 0;
			vertical-align: middle;
		}

			#header nav > ul {
				list-style: none;
				margin: 0;
				padding-left: 0;
			}

				#header nav > ul > li {
					border-radius: 4px;
					display: inline-block;
					margin-left: 1.5em;
					padding-left: 0;
                                        color: skyblue;
				}
 
         
       </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="landing">
        
        <header id="header">
				<h1><font color="skyblue">SMART MARKET</font></h1>
				<nav id="nav">
					<ul>
						<li><a href="HomePage.html">HOME</a></li>
						<li>About Us</li>
					</ul>
				</nav>
			</header><br><br><br><br><br>
        <table border="1">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>cost</th>
                
                
                
            </tr>
            <tr>
                <%!Statement st;%>
        <%
         st=con.createStatement();
        ResultSet  rs=st.executeQuery("select * from supermarket.itemslist");
                    out.println("Items List after the deletion");

         while(rs.next())
         {
        %>
            <br><br>  <td><%=rs.getString(3)%></td>
             <td><%=rs.getString(1)%></td>
              
               <td><%=rs.getString(2)%></td>
                     
                 </td>
            </tr>  
           
           <% }%>
                    
           
        </table>
           <h2><a href="./UserHome.jsp">back</a></h2>

    </body>
</html>
