package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Time;
import javafx.scene.control.Alert;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class insertData2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/foot.css\"> \n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("    <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//code.jquery.com/jquery-2.1.3.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        function test() {\n");
      out.write("            alert(\"Records Added Successfully\");\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function test2(){\n");
      out.write("            alert(\"Error While Adding Records\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        .button {\n");
      out.write("            background-color: #E130CD;\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px 32px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin-right: 50px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("       \n");
      out.write("            <div class=\"container-fluid bg-light-gray\">\n");
      out.write("\n");
      out.write("                <div class=\"container pt-5\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <h3 style=\"font-size:30px\"><b>Add New Doctors</b></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"underline\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                <div class=\"container mt-5\">\n");
      out.write("                    <form action=\"insertData2.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"firstName\" class=\"col-sm-3 control-label\">First Name</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"firstName\" placeholder=\"First Name\" name=\"fname\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"lastName\" class=\"col-sm-3 control-label\">Last Name</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"lastName\" placeholder=\"Last Name\" name=\"lname\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"phoneNumber\" class=\"col-sm-3 control-label\">Phone number </label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"phoneNumber\" placeholder=\"Phone Number\" name=\"pnumber\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email\" class=\"col-sm-3 control-label\">Email </label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"email\" placeholder=\"Email\" class=\"form-control\" name= \"email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"address\" class=\"col-sm-3 control-label\">Address </label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"address\" placeholder=\"Address\" class=\"form-control\" name= \"address\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"SpecializedArea\" class=\"col-sm-3 control-label\">Specialized Area</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"SpecializedArea\" placeholder=\"Specialized Area\" name= \"specialized\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"Hospital\" class=\"col-sm-3 control-label\">Hospital</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"Hospital\" placeholder=\"Hospital\" name= \"hospital\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"Max\" class=\"col-sm-3 control-label\">Max Appoinments</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"Hospital\" placeholder=\"Max Appoinments\" name= \"maxAppoinments\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"Max\" class=\"col-sm-3 control-label\">Available Date</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"Hospital\" placeholder=\"Available Date\" name= \"available\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label for=\"Max\" class=\"col-sm-3 control-label\">Week_Days</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"Hospital\" placeholder=\"Week_Days\" name= \"Week_Day\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                            <label for=\"Max\" class=\"col-sm-3 control-label\">Days_Section</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"Hospital\" placeholder=\"Morning,Afternoon or Evening\" name= \"Week_Day_Section\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"AvailableDays\" class=\"col-sm-3 control-label\">Available Days</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("                                <label class=\"radio-inline\">\n");
      out.write("\n");
      out.write("                                </label>\n");
      out.write("\n");
      out.write("                                <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"checkboxMo\">\n");
      out.write("                                        <label><input type=\"checkbox\" value=\"08.00-12.00\" name=\"time\">Morning(08.00to12.00)</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkboxNo\">\n");
      out.write("                                        <label><input type=\"checkbox\" value=\"12.00-14.00\" name=\"time\">Noon(12.00to14.00)</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkboxEv\">\n");
      out.write("                                        <label><input type=\"checkbox\" value=\"14.00-19.00\" name=\"time\">Evening(14.00to19.00)</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkboxNi\">\n");
      out.write("                                        <label><input type=\"checkbox\" value=\"19.00-22.00\" name=\"time\">Night(19.00to22.00)</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <label class=\"radio-inline\">\n");
      out.write("\n");
      out.write("                                </label>\n");
      out.write("\n");
      out.write("                                <div class=\"container\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        &nbsp;\n");
      out.write("                        &nbsp;\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"address\" class=\"col-sm-3 control-label\"></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"submit\" value=\"Add Doctor\" name=\"btnRegister\" class=\"button\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("        </div>\n");
      out.write("        ");
  
           
            

            
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String fullName = fname + " " + lname;
            String contact = request.getParameter("pnumber");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String date = request.getParameter("available");
            String specialized = request.getParameter("specialized");
            String hospital = request.getParameter("hospital");
            String maxAppoinments = request.getParameter("maxAppoinments");
             String dy = request.getParameter("Week_Day");
            String WeeK= request.getParameter("Week_Day_Section");

            try {
                String timee = "1";
            String b[] = request.getParameterValues("time");
            for (int i = 0; i < b.length; i++) {
                timee += b[i] + "";
            }
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");

                Statement stmt = con.createStatement();

                String query1 = "INSERT INTO doctor(DoctorName,SpecelizedArea,Address,ContactNO,Hospital,Email,ClinicTime,ClinicDate,MaxAppointments,Week_Day,Week_Day_Section) VALUES('" + fullName + "','" + specialized + "','" + address + "','" + contact + "','" + hospital + "','" + email + "','"+timee+"','"+date+"','"+maxAppoinments+"','"+dy+"','"+WeeK+"')";
                int n = stmt.executeUpdate(query1);
                if (n != 0) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("        test();\n");
      out.write("        </script>\n");
      out.write("        ");

                } else {
                     
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("        test2();\n");
      out.write("        </script>\n");
      out.write("        ");

                }
            } catch (SQLException e) {
                out.println(e.getMessage());
            } catch (Exception e) {
                out.println(e.getMessage());
            }


        
      out.write(" \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
