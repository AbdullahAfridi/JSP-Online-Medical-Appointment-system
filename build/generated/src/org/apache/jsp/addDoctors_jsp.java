package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class addDoctors_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
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
      out.write("                <div >\n");
      out.write("                    <form action=\"insertData2.jsp\" method=\"POST\">\n");
      out.write("\n");
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
      out.write("                                <input type=\"email\" id=\"email\" placeholder=\"Email\" class=\"form-control\" name= \"email\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"address\" class=\"col-sm-3 control-label\">Address </label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"email\" placeholder=\"Address\" class=\"form-control\" name= \"address\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"SpecializedArea\" class=\"col-sm-3 control-label\">Specialized Area</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"SpecializedArea\" placeholder=\"Specialized Area\" name= \"specialized\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"Hospital\" class=\"col-sm-3 control-label\">Hospital</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <input type=\"text\" id=\"Hospital\" placeholder=\"Hospital\" name= \"hospital\" class=\"form-control\" autofocus>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        &nbsp;\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"AvailableDays\" class=\"col-sm-3 control-label\">Available Days</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("                                <label class=\"radio-inline\">\n");
      out.write("                                    <input type=\"radio\" name=\"radioWeekdays\" checked>Weekdays\n");
      out.write("                                </label>\n");
      out.write("\n");
      out.write("                                <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"checkboxMo\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"08.00-12.00\" name=\"weekday\">Morning(08.00to12.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkboxNo\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"12.00-14.00\" name=\"weekday\">Noon(12.00to14.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkboxEv\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"14.00-19.00\" name=\"weekday\">Evening(14.00to19.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkboxNi\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"19.00-22.00\" name=\"weekday\">Night(19.00to22.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <label class=\"radio-inline\">\n");
      out.write("                                        <input type=\"radio\" name=\"radioWeekends\">Weekends\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"checkboxMo\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"\" name=\"weekendMo\">Morning(08.00to12.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkboxNo\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"\" name=\"weekendNo\">Noon(12.00to14.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkboxEv\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"\" name=\"weekendEv\">Evening(14.00to19.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkboxNi\">\n");
      out.write("                                            <label><input type=\"checkbox\" value=\"\" name=\"weekendNi\">Night(19.00to22.00)</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            &nbsp;\n");
      out.write("                            &nbsp;\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"address\" class=\"col-sm-3 control-label\"></label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input type=\"submit\" value=\"Register\" name=\"btnRegister\" class=\"button\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
