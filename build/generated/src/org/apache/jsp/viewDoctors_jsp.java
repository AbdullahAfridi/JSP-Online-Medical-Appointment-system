package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewDoctors_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Medical Center </title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container pt-5\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <h3 style=\"font-size:30px\"><b>View Doctors</b></h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search\">\n");
      out.write("\n");
      out.write("                    <form action=\"searchData2.jsp\" method=\"POST\">\n");
      out.write("                        <input type=\"text\" id=\"id\" placeholder=\"Enter the Doctor's Name to Search\" name=\"Search\" class=\"form-control\" autofocus>\n");
      out.write("                        <input type=\"submit\" value=\"Search\" name=\"btnSearch\" class=\"button\"/>\n");
      out.write("                      \n");
      out.write("                    </form>>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");


                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                        Statement stmt = con.createStatement();
                        String search = request.getParameter("Search");
                        ResultSet resultset
                                = stmt.executeQuery("select * from doctor where DoctorName LIKE '" + search + "'");

                        if (!resultset.next()) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                                <script>\n");
      out.write("                                test();\n");
      out.write("                                </script>\n");
      out.write("                            ");

                        } else {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"id\" class=\"col-sm-3 control-label\">Doctor ID</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"id\" placeholder=\"");
      out.print( resultset.getString("DoctorId") );
      out.write("\" name=\"id\" class=\"form-control\" autofocus>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"DoctorName\" class=\"col-sm-3 control-label\">Doctor Name</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"firstName\" placeholder=\"");
      out.print( resultset.getString("DoctorName") );
      out.write("\" name=\"name\" class=\"form-control\" autofocus>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"phoneNumber\" class=\"col-sm-3 control-label\">Phone number </label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"phoneNumber\" placeholder=\"");
      out.print( resultset.getString("ContactNO") );
      out.write("\" name=\"pnumber\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\" class=\"col-sm-3 control-label\">Email </label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"email\" id=\"email\" placeholder=\"");
      out.print( resultset.getString("Email") );
      out.write("\" class=\"form-control\" name= \"email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"address\" class=\"col-sm-3 control-label\">Address </label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"address\" placeholder=\"");
      out.print( resultset.getString("Address") );
      out.write("\" class=\"form-control\" name= \"address\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"SpecializedArea\" class=\"col-sm-3 control-label\">Specialized Area</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"SpecializedArea\" placeholder=\"");
      out.print( resultset.getString("SpecelizedArea") );
      out.write("\" name= \"specialized\" class=\"form-control\" autofocus>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"Hospital\" class=\"col-sm-3 control-label\">Hospital</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"Hospital\" placeholder=\"");
      out.print( resultset.getString("Hospital") );
      out.write("\" name= \"SpecelizedArea\" class=\"form-control\" autofocus>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                ");

                    } catch (SQLException e) {
                        e.getMessage();
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
