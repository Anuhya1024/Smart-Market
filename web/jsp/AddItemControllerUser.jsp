<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="connect.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page</title>
        
        <style>#header {
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
				}</style>
    </head>
    <body>
         <header id="header">
				<h1><font color="skyblue">SMART MARKET</font></h1>
				<nav id="nav">
					<ul>
						<li><font color="skyblue"><a href="">HOME</a></font></li>
						<li><font color="skyblue"><a href="">HELLO USER</a></font></li>
						<li><font color="skyblue">About Us</font></li>
					</ul>
				</nav>
			</header><br><br>
        
        
        <%! String Name;
        int o;
        int order;
        %>
        <%
             Name=request.getParameter("Name");
        session.setAttribute("Name",Name);
         String ic1=request.getParameter("ItemCost");
          int ic = Integer.parseInt(ic1);
           String id1=request.getParameter("ItemId");
           int id= Integer.parseInt(id1);
         Statement st3=con.createStatement();
   
        o =(int)session.getAttribute("oid");
        int i=st3.executeUpdate("insert into supermarket.itemslist(ItemName,ItemCost,ItemId,orderid) values('"+ Name +"',"+ ic +"," + id +","+ o +") ");
        out.println("Data is successfully inserted!");
        
       %> 
       
       <h2><a href="./UserHome.jsp">back</a></h2>

    </body>
</html>