package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("       <style>\n");
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
      out.write("    </style>\n");
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
      out.write("      <a class=\"navbar-brand\" href=\"#\" style=\"color:red; \">Badulla Medical Center</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("        <li><a href=\"about.html\">About</a></li> \n");
      out.write("        <li><a href=\"contactus.html\">Contact</a></li> \n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"loginn.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"loginn.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("  \n");
      out.write("   \n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"image/cd1.jpg\" alt=\"Photo Iphone\" style=\"width:100%;height:350px\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"image/cd2.jpg\" alt=\"Badulla\" style=\"width:100%;height:350px\">\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"image/cd3.jpg\" alt=\"Passara\" style=\"width:100%;height:350px\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container-fluid bg-light-gray\">\n");
      out.write("\n");
      out.write("<div class=\"container pt-5\">\n");
      out.write("   \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <h3 style=\"font-size:30px\"><b>Most Expert Doctors</b></h3>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"underline\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"card\">\n");
      out.write("         <img src=\"image/doc4.jpg\" alt=\"card-1\" class=\"card-img-top\" style=\" height:350px \">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <h5 style=\"margin-left: 90px\"><b>Dr Sandaru Imal</b></h5> \n");
      out.write("        <p style=\"margin-left: 70px\"> Trained at Lanka Hospital</p>\n");
      out.write("       <p style=\"margin-left: 85px\"> 9 years experience</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <img src=\"image/doc3.jpg\" alt=\"card-1\" class=\"card-img-top\"  style=\"height:350px\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <h5 style=\"margin-left: 100px\"><b>Dr Theapaq</b></h5> \n");
      out.write("          <p style=\"margin-left: 85px\"> Trained at Durdan's </p>\n");
      out.write("          <p style=\"margin-left: 90px\"> 7 years experience</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <img src=\"image/doc5.jpg\" alt=\"card-1\" class=\"card-img-top\" style=\"height:350px\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <h5 style=\"margin-left: 100px\"><b>Dr Hasini</b></h5>\n");
      out.write("          <p  style=\"margin-left: 50px\"> Trained at Asiri Central Hospital</p>\n");
      out.write("          <p  style=\"margin-left: 80px\">10 years experience </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <img src=\"image/doc6.jpg\" alt=\"card-1\" class=\"card-img-top\" style=\"height:350px\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <h5 style=\"margin-left: 90px\"><b>Dr Thulasika</b></h5>\n");
      out.write("          <p  style=\"margin-left: 40px\"> Trained at National Eye Hospital</p> \n");
      out.write("           <p  style=\"margin-left: 80px\">10 years experience </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    <div class=\"content\" align=\"center\">\n");
      out.write("          <h2>Search Doctor Here</h2>\n");
      out.write("            <h2>And Make Your Appointment</h2>\n");
      out.write("        <form name=\"Select\" action=\"Sorting.jsp\" method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("               <tbody>\n");
      out.write("                   <tr> <td>Search by Disease</td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            ");

                                try
                                {
                                  
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                                    String query = "Select SpecelizedArea from doctor";
                                    PreparedStatement ptmt = con.prepareStatement(query);
                                    ResultSet rs = ptmt.executeQuery();
                                   
                                        
      out.write("\n");
      out.write("                                        <select id=\"sell\" name=\"Select_Illness\">\n");
      out.write("                                            ");

                                             while(rs.next())
                                             {
      out.write("\n");
      out.write("                                             <option>");
      out.print( rs.getString("SpecelizedArea"));
      out.write("</option>\n");
      out.write("                                             ");
 } 
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                             ");
}
                                              catch(Exception ex)
                                                {
                                                    
                                                }

                                             
      out.write("\n");
      out.write("                                          \n");
      out.write("                                \n");
      out.write("                       \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>Select the Date That You Want to Make An Appointment</td></tr>\n");
      out.write("                     <tr>\n");
      out.write("                         <td>\n");
      out.write("                            <input type=\"date\" value=\"2018-11-30\" min=\"2018-01-01\" max=\"2020-12-31\" name=\"date_app\">\n");
      out.write("                         </td>\n");
      out.write("                     </tr>\n");
      out.write("                        <tr>\n");
      out.write("                         <td>\n");
      out.write("                             <select name=\"time_app\">\n");
      out.write("                                 <option selected disabled>Please select Time</option>\n");
      out.write("                                 <option>Morning (08.00to12.00)</option>\n");
      out.write("                                 <option>Afternoon (12.00to14.00)</option>\n");
      out.write("                                 <option>Evening (14.00to19.00)</option>\n");
      out.write("                                 <option>Night (19.00to22.00)</option>\n");
      out.write("                             </select>\n");
      out.write("                         </td>\n");
      out.write("                        </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <a href=\"#\">  <input type=\"submit\" value=\"Search\" name=\"Sort\" /></a>\n");
      out.write("                      \n");
      out.write("            </form>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <footer id=\"myFooter\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <h5>Get started</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"http://localhost/register.php\">Sign up</a></li>\n");
      out.write("                        <li><a href=\"http://localhost/login.php\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <h5>Coustomer Services</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">0769657777</a></li>\n");
      out.write("                        <li><a href=\"#\">Abdullahdaulatzai@yahoo.com</a></li>\n");
      out.write("                        <li><a href=\"#\">226 Lower St, Badulla</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <h5>Best For</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">General Surgeries</a></li>\n");
      out.write("                        <li><a href=\"#\">Eyes Treatment </a></li>\n");
      out.write("                        <li><a href=\"#\"> arthropathy</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <h5>About</h5>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"http://localhost/contact.php\">Contact Us</a></li>\n");
      out.write("                        <li><a href=\"file:///C:/wamp/www/about.html#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Here we use the Google Embed API to show Google Maps. -->\n");
      out.write("            <!-- In order for this to work in your project you will need to generate a unique API key.  -->\n");
      out.write("            <div style=\"width: 100%\"><iframe width=\"100%\" height=\"300\" src=\"https://maps.google.com/maps?width=100%&amp;height=300&amp;hl=en&amp;q=226%20Lower%20St%2C%20Badulla+(Ramya%20Communication)&amp;ie=UTF8&amp;t=&amp;z=14&amp;iwloc=B&amp;output=embed\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\"><a href=\"https://www.maps.ie/create-google-map/\">Google Maps iframe generator</a></iframe></div><br />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"social-networks\">\n");
      out.write("            <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"google\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-copyright\">\n");
      out.write("            <p>© 2018 Copyright Text </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
