<%@page import="java.sql.PreparedStatement"%>
<%@include file="connect.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!String name;%>
        <%
         //id=request.getParameter("id");
          name=request.getParameter("email");
          String pwd=request.getParameter("psw");
           String pwd1=request.getParameter("psw-repeat");
           // String phno=request.getParameter("phno"); 
        PreparedStatement ps=con.prepareStatement("insert into users(username,password,subtotal) values('"+ name +"','"+ pwd +"',null)");
     //  ps.setString(1,name);
     //   ps.setString(2,pwd);
     //    ps.setString(3,pwd1);
        //  ps.setString(4,add);
        //   ps.setString(3,phno);
          
            
        
      
       
       int k=ps.executeUpdate();
        if(k>0)
        {
            response.sendRedirect("./LoginPage.jsp");
        }
        %>
        
    </body>
</html>
