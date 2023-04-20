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
        <%
                /* id=request.getParameter("number");
                 int id1 = Integer.parseInt(id);
         Statement st=con.createStatement();
       PreparedStatement ps1 = con.prepareStatement("delete from supermarket.inventory where itemid="+ id1 +" ");
int i = ps1.executeUpdate();
if(i > 0)
{ */  //
//<jsp:forward page="./SuccessDeleteIn.jsp"/>
//<% 
//}
//else
//
        
//<jsp:forward page="./failureDeleteIn.jsp"/>
//<%

        
       %>
        <%!String id;%>
        <%
                 id=request.getParameter("no");
                 int id1 = Integer.parseInt(id);
         Statement st=con.createStatement();
       PreparedStatement ps = con.prepareStatement("delete from supermarket.inventory where itemid="+ id1 +" ");
      int i = ps.executeUpdate();
if(i > 0)
{%>
<jsp:forward page="./SuccessDeleteIn.jsp"/>
<% 
}
else
%>
<jsp:forward page="./failureDeleteIn.jsp"/>


    </body>
</html>