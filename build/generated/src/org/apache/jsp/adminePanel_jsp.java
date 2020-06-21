package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminePanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Locatielezen Administrator page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/panel.css\" charset=\"utf-8\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"admin--test.css\" charset=\"utf-8\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    a,hover{ \n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    \n");
      out.write("}  \n");
      out.write("span{\n");
      out.write("    \n");
      out.write("    font-size:20px\n");
      out.write("}\n");
      out.write("      \n");
      out.write("</style>\n");
      out.write("  <body class=\"admin\">\n");
      out.write("\n");
      out.write("    <header class=\"admin__statusbar flex--center\">\n");
      out.write("      <span class=\"home\"><i class=\"fa fa-home\"></i>Home</span>\n");
      out.write("      <span id=\"username\"><i class=\"fa fa-user\"></i>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       ");

                         if(session.getAttribute("cus_id")!=null){
                            String username=request.getParameter("user");
                            out.print(username+"   ");
                            out.print("<a style='text-decoration:none; font-size:15px;' href='index.jsp'>(Logout)</a>");
                        }
                else {
                             
                           response.sendRedirect("loginn.jsp");
                         }
         
         
      out.write("\n");
      out.write("      \n");
      out.write("      </span>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <nav class=\"admin__sidepanel\">\n");
      out.write("      <ul>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"ContctFetching.jsp\" >  <span class=\"glyphicon glyphicon-envelope\"></span> &nbsp&nbsp&nbsp Inquiries</a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"fetchinPatients.jsp\"><i class=\"fa fa-bed\" style=\"font-size:25px;color:white\"></i></i>Manage Patients</a>\n");
      out.write("        \n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"fetchingDoc.jsp\">    <span class=\"glyphicon glyphicon-user\"></span> &nbsp&nbsp&nbsp&nbsp&nbspManage Doctors</a>\n");
      out.write("         \n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("         <a href=\"fetchingPoint.jsp\">   <span class=\"glyphicon glyphicon-calendar\"></span>&nbsp&nbsp&nbsp&nbsp Appointments</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("        \n");
      out.write("    </nav>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    <!--<main class=\"admin__main\">\n");
      out.write("\n");
      out.write("      <h1>\n");
      out.write("        Document Title\n");
      out.write("      </h1>\n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("-->\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
