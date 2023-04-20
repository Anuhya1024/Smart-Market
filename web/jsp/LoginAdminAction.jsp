
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="connect.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!String aname;
        String p;
        String pw;
        String n;%>
        <%
            
         aname=request.getParameter("aname");
        session.setAttribute("aname",aname);
          pw =request.getParameter("apwd");
        Statement st=con.createStatement();
       Statement st1=con.createStatement();
        ResultSet  rs=st.executeQuery("select password from supermarket.admin where username='" + aname +"'");
        while(rs.next())
        {
        p=rs.getString("password");
        }
       ResultSet  rs1=st1.executeQuery("select username from supermarket.admin where password='" + p +"'");
     while(rs1.next())
        {
        n=rs1.getString("username");
        }
        if((pw.equals(p)&&aname.equals(n)))   
{
    response.sendRedirect("../progs/AdminHome.html");
}
else{
    response.sendRedirect("./LoginPage.jsp");
  

}  %>