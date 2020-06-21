package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Sorting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  ");

                         if(session.getAttribute("cus_id")!=null){
                            String username=request.getParameter("user");
                            out.print(username+"   ");
                            out.print("<a style='text-decoration:none; font-size:15px;' href='index.jsp'>(Logout)</a>");
                        }
                else {
                             
                           response.sendRedirect("loginn.jsp");
                         }
         
         
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("        table {\n");
      out.write("            font-family: arial, sans-serif;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td, th {\n");
      out.write("            border: 1px solid #dddddd;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #dddddd;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("         <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Medical Center </title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"css/foot.css\"> \n");
      out.write("            <!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span> \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\" style=\"color:red; \">Badullah Medical Center</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"http://localhost:8080/RAD-1_Project/index.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"#\">About</a></li> \n");
      out.write("        <li><a href=\"#\">Contact</a></li> \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("\n");
      out.write("     \n");
      out.write("    <div class=\"content\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Doctor Name</th>\n");
      out.write("                        <th>Specialized Field</th>\n");
      out.write("                        <th>Clinic Date</th>\n");
      out.write("                        <th>Clinic Time</th>\n");
      out.write("                        <th>Appointment</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 
               String dis = request.getParameter("Select_Illness");    
               String daTe = request.getParameter("date_app");
               String tiMe = request.getParameter("time_app");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
           
            String query = "Select * from doctor where SpecelizedArea='"+dis+"'";
            PreparedStatement ptmt = con.prepareStatement(query);
            ResultSet rs = ptmt.executeQuery();
            while(rs.next())
            {
                out.println("<tr>");
                out.println("<form action=Appointment.jsp method=post>");
                String id = rs.getString("DoctorID");
                String name = rs.getString("DoctorName");
                String field = rs.getString("SpecelizedArea");
                String date = rs.getString("ClinicDate");
                String time = rs.getString("Week_Day_Section");
                int max = rs.getInt("MaxAppointments");
               // max=4;
                out.println("<th><input type=text name ='docname' value='"+name+"' readonly='true'></th>");
                out.println("<th>"+field+"</th>");
                out.println("<th>"+date+"</th>");
                out.println("<th>"+time+"</th>");
                String Q = "Select count(*) as Count from appointment where DoctorID='"+id+"' && ClinicDate='"+daTe+"' && ClinicTime='"+tiMe+"'";
                PreparedStatement pm = con.prepareStatement(Q);
                ResultSet rset = pm.executeQuery();
              
                if(rset.next())
                {
                     int num = Integer.parseInt(rset.getString("Count"));
                     num=5;
                    System.out.println(num);
                        if(max==num)
                {
                    out.println("<th>Cannot Make Appoinment</th>");
                }
                else
                {
                 out.println("<th><input type=submit value='Make Appointment'></th>");   
                }
                }
                out.println("</form>");
                out.println("</tr>");
            }
        
      out.write(" \n");
      out.write("                     \n");
      out.write("          \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
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
