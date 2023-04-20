<%@page import="java.util.*"%>
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
         <%!String uname;
        String pass;
        String pwd;
        String usename;
         int oi;
         int oid;%>
        <%
            
         uname=request.getParameter("uname");
        session.setAttribute("uname",uname);
          pwd=request.getParameter("upwd");
        Statement st=con.createStatement();
       Statement st1=con.createStatement();
        ResultSet  rs=st.executeQuery("select password from supermarket.users where username='" + uname +"'");
        while(rs.next())
        {
        pass=rs.getString("password");
        }
       ResultSet  rs1=st1.executeQuery("select username from supermarket.users where password='" + pass +"'");
     while(rs1.next())
        {
        usename=rs1.getString("username");
       // request.setAttribute("usename", rs1.getString("username"));

        }
            Statement st11=con.createStatement();

         ResultSet  rs11=st11.executeQuery("select orderid from supermarket.users where password='" + pass +"' and username='" + uname +"'");
    while(rs11.next())
        {
       oi=rs11.getInt("orderid");

        }
               session.setAttribute("oid", oi);
        if((pwd.equals(pass)&&uname.equals(usename)))   
{
    response.sendRedirect("./UserHome.jsp");
}
else{
    response.sendRedirect("./LoginPage.jsp");
  

}  %>
    </body>
</html>