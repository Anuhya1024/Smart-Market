package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class LoginUserAction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String pw; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!--<html> \n");
      out.write("<head> \n");
      out.write("<title>Connection with my SQL database</title> \n");
      out.write("</head> \n");
      out.write("<body>-->\n");
      out.write('\n');
 
try {
String connectionURL = "jdbc:mysql://localhost:3306/supermarket"; 
Connection conn = null; 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 
conn = DriverManager.getConnection(connectionURL, "root", "Vsaritha1230");
String name=request.getParameter("uname");
       // session.setAttribute("id1",id);
          pw=request.getParameter("upwd");
   Statement st=conn.createStatement();
       //Statement st1=conn.createStatement();
        ResultSet  rs=st.executeQuery("select password from supermarket.userlogin where username='"+name+"'");       
    if((rs.getString("password")).equals(pw))
    {
response.sendRedirect("../progs/UserHome.html");
    }
    else{
response.sendRedirect("../progs/LoginPage.html");
}
}
catch(Exception ex){

out.println("Unable to connect to database.");
}

      out.write("\n");
      out.write("<!--</body> \n");
      out.write("</html>-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
