package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \t\t\t<link rel=\"stylesheet\" href=\"../css/style1.css\" />\n");
      out.write("<style>\n");
      out.write("form {\n");
      out.write("    border: 3px solid skyblue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color: skyblue;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: blue;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cancelbtn {\n");
      out.write("    width: auto;\n");
      out.write("    padding: 10px 18px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 10px 0 5px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*.container {\n");
      out.write("    padding: 16px;\n");
      out.write("}*/\n");
      out.write("div.container1 {\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\tdiv.container {\n");
      out.write("\t\tfloat: left;\n");
      out.write("\t\twidth: 50%;\n");
      out.write("\t\tbackground: #ffffff;\n");
      out.write("\t\t}\t\n");
      out.write("\t\tdiv.container2 {\n");
      out.write("\t\tfloat: right;\n");
      out.write("\t\twidth: 50%;\n");
      out.write("\t\tbackground: #ffffff;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("    .cancelbtn {\n");
      out.write("       width: 25%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t<h1><font color=\"skyblue\"><a href=\"HomePage.html\">SMART MARKET</a></font></h1>\n");
      out.write("\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"HomePage.html\">HOME</a></li>\n");
      out.write("\t\t\t\t\t\t<li>About Us</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header><br>\n");
      out.write("                        \n");
      out.write("<div class=\"container1\">\n");
      out.write("\n");
      out.write("  <div class=\"container\" >\n");
      out.write("      <form method=\"post\" action=\"./LoginUseAction.jsp\" > \n");
      out.write("          <br>\n");
      out.write("          &nbsp;<h2><font color=\"skyblue\"><u>User Login Form</u></font></h2> <br><br> \n");
      out.write("\n");
      out.write("    &nbsp;&nbsp;<label><b>Username</b></label><br>\n");
      out.write("   &nbsp;&nbsp; <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required><br><br>\n");
      out.write("\n");
      out.write("   &nbsp;&nbsp; <label><b>Password</b></label><br>\n");
      out.write("    &nbsp;&nbsp;<input type=\"password\" placeholder=\"Enter Password\" name=\"upwd\" required><br><br>\n");
      out.write("        \n");
      out.write("    &nbsp;&nbsp;<button type=\"submit\">Login</button><br>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"container2\" >\n");
      out.write("    <form action=\"./LoginAdminAction.jsp\" method=\"post\">\n");
      out.write("        <br>\n");
      out.write("       &nbsp; <h2><font color=\"skyblue\"><b><u>ADMIN Login</u> </b></font></h2>  <br><br>\n");
      out.write("\n");
      out.write("    &nbsp;&nbsp;<label><b>Username</b></label><br>\n");
      out.write("   &nbsp;&nbsp; <input type=\"text\" placeholder=\"Enter Username\" name=\"aname\" required><br><br>\n");
      out.write("\n");
      out.write("    &nbsp;&nbsp;<label><b>Password</b></label><br>\n");
      out.write("    &nbsp;&nbsp;<input type=\"password\" placeholder=\"Enter Password\" name=\"apwd\" required><br><br>\n");
      out.write("        \n");
      out.write("    &nbsp;&nbsp;<button type=\"submit\">Login</button><br>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
