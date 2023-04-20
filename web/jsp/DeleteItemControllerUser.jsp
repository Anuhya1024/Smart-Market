<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="connect.jsp" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page</title>
    </head>
    <body>
        <%!String id;
        int o1;%>
        <%
                 id=request.getParameter("number");
                 int id1 = Integer.parseInt(id);
         Statement st2=con.createStatement();
                 o1 =(int)session.getAttribute("oid");

       PreparedStatement ps = con.prepareStatement("delete from supermarket.itemslist where itemid="+ id1 +" and orderid="+ o1 +"  ");
int i = ps.executeUpdate();
if(i > 0)
{%>
<jsp:forward page="./SuccessDelete.jsp"/>
<% 
}
else
%>
<jsp:forward page="./failureDelete.jsp"/>
<%

        
       %> 
    </body>
</html>