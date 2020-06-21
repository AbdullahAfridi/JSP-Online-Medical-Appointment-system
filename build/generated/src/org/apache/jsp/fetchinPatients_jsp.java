package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class fetchinPatients_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"                                                    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Displaying Data From SQL</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/roo.css\"> \n");
      out.write("  <style>\n");
      out.write("      \n");
      out.write("      h1{\n");
      out.write("       color: red;   \n");
      out.write("          \n");
      out.write("      }\n");
      out.write("      span{\n");
      out.write("          \n");
      out.write("          font-size: 30px;\n");
      out.write("            border-top-color: red;      }\n");
      out.write("  </style>\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1> <span class=\"yellow\">Patient Information</span></h1>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<form method=\"post\">\n");
      out.write("\n");
      out.write("<table class=\"container\">\n");
      out.write("<thead>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th><h1 style=\"color: orangered\">Full_Name</h1></th>\n");
      out.write("\t\t\t<th><h1 style=\"color: orangered\">Age</h1></th>\n");
      out.write("                        <th><h1 style=\"color: orangered\">Gender</h1></th>\n");
      out.write("                         <th><h1 style=\"color: orangered\"> Email </h1></th>\n");
      out.write("                         <th><h1 style=\"color: orangered\"> Phone_Number </h1></th>\n");
      out.write("                          <th><h1 style=\"color: orangered\"> Appointment_ID </h1></th>\n");
      out.write("                          \n");
      out.write("                         \n");
      out.write("\t\t</tr>\n");
      out.write("\t</thead>\n");

try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/contact";
String username="root";
String password="";
String query="SELECT * from customer ORDER BY cus_id ASC";
Connection conn=DriverManager.getConnection(url,username,password);
    Statement stmt = conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{


      out.write("\n");
      out.write("   <tbody>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td> ");
      out.print( rs.getString("cus_name"));
      out.write("</td>\n");
      out.write("\t\t\t <td> ");
      out.print( rs.getString("age"));
      out.write("</td>\n");
      out.write("                          <td> ");
      out.print( rs.getString("gender"));
      out.write("</td>\n");
      out.write("                           <td> ");
      out.print( rs.getString("email"));
      out.write("</td>\n");
      out.write("                            <td> ");
      out.print( rs.getString("mobile"));
      out.write("</td>\n");
      out.write("                             <td> ");
      out.print( rs.getString("apID"));
      out.write("</td>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                            <td>\n");
      out.write("                                 <p>\n");
      out.write("      <a href=\"delete.jsp?cus_id=");
      out.print( rs.getString("cus_id"));
      out.write("\">                         \n");
      out.write("          <span class=\"glyphicon glyphicon-remove-sign\" style=\"color: red\"></span>\n");
      out.write("      </a>\n");
      out.write("          <a href=\"addpatient.html\">                           \n");
      out.write("      \n");
      out.write("          <span class=\"glyphicon glyphicon-plus-sign\"></span> \n");
      out.write("       \n");
      out.write("          </a>\n");
      out.write("      </p>\n");
      out.write("                            </td>\n");
      out.write("\t\t</tr>\n");
      out.write("        ");


}

      out.write("\n");
      out.write("    </table>\n");
      out.write("    ");

    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }





      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</html> ");
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
