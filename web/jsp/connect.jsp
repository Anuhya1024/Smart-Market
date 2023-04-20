<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! Connection con;%>
     <%
    String connectionURL = "jdbc:mysql://localhost:3306/supermarket"; 

Class.forName("com.mysql.jdbc.Driver").newInstance(); 
con = DriverManager.getConnection(connectionURL, "root", "Vsaritha1230");
if(con!=null)   
//out.println("connected\n");
     %>  
    </body>
</html>