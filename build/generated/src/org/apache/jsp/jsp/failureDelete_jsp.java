package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class failureDelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html >\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>fail</title>\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("\tbody.landing #header {\n");
      out.write("\t\tbackground-color: black;\n");
      out.write("\t\tleft: 0;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\ttop: 0;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#header {\n");
      out.write("\t\tbackground-color: #202222;\n");
      out.write("\t\tcolor: #ffffff;\n");
      out.write("\t\tcursor: default;\n");
      out.write("\t\theight: 4.75em;\n");
      out.write("\t\tline-height: 4.75em;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\tz-index: 10000;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\t#header h1 {\n");
      out.write("\t\t\tcolor: #ffffff;\n");
      out.write("\t\t\theight: inherit;\n");
      out.write("\t\t\tleft: 2.5em;\n");
      out.write("\t\t\tline-height: inherit;\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\ttop: 0;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t\t#header h1 a {\n");
      out.write("\t\t\t\tfont-size: 1.25em;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t#header nav {\n");
      out.write("\t\t\theight: inherit;\n");
      out.write("\t\t\tline-height: inherit;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tright: 2.75em;\n");
      out.write("\t\t\ttop: 0;\n");
      out.write("\t\t\tvertical-align: middle;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t\t#header nav > ul {\n");
      out.write("\t\t\t\tlist-style: none;\n");
      out.write("\t\t\t\tmargin: 0;\n");
      out.write("\t\t\t\tpadding-left: 0;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t#header nav > ul > li {\n");
      out.write("\t\t\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\t\t\tmargin-left: 1.5em;\n");
      out.write("\t\t\t\t\tpadding-left: 0;\n");
      out.write("                                        color: skyblue;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body class=\"landing\">\n");
      out.write("    \n");
      out.write("    <header id=\"header\">\n");
      out.write("\t\t\t\t<h1><font color=\"skyblue\">SMART MARKET</font></h1>\n");
      out.write("\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><font color=\"skyblue\"><a href=\"../progs/HomePage.html\">HOME</a></font></li>\n");
      out.write("\t\t\t\t\t\t<li><font color=\"skyblue\"><a href=\"../progs/LoginPage.html\">LOGOUT</a></font></li>\n");
      out.write("\t\t\t\t\t\t<li><font color=\"skyblue\">About Us</font></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header><br><br><br><br>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <p><h1>There is a problem in Deleting Record \n");
      out.write("     Check Manually in your Database</h1></p>\n");
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
