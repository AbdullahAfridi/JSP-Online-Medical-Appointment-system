package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class removepatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>ThaiCreate.Com JSP Tutorial</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/roo12.css\"> \n");
      out.write("        <style>\n");
      out.write("            .table{\n");
      out.write("                padding-left: 400px;\n");
      out.write("                padding-top: 50px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"image/doc5.jpg\");\n");
      out.write("                background-repeat: no-repeat; \n");
      out.write("                background-color: blanchedalmond;\n");
      out.write("                background-size: 400px 900px;\n");
      out.write("            }  \n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t");

	Connection connect = null;
	Statement s = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/contact" +
				"?user=root&password=");
		
		s = connect.createStatement();
		
		String sql = "SELECT * FROM  addpatient ORDER BY pid ASC";
		
		ResultSet rec = s.executeQuery(sql);
		
      out.write("\n");
      out.write("                \n");
      out.write("\t\t<div class=\"table\">\n");
      out.write("                <table width=\"600\" border=\"1\">\n");
      out.write("\t\t  <tr>\n");
      out.write("\t\t    <th width=\"91\"> <div align=\"center\">pid </div></th>\n");
      out.write("\t\t    <th width=\"98\"> <div align=\"center\">First Name </div></th>\n");
      out.write("\t\t    <th width=\"198\"> <div align=\"center\">Last Name </div></th>\n");
      out.write("\t\t    <th width=\"97\"> <div align=\"center\">Gender </div></th>\n");
      out.write("\t\t    <th width=\"59\"> <div align=\"center\">Age </div></th>\n");
      out.write("\t\t    <th width=\"71\"> <div align=\"center\">DOB </div></th>\n");
      out.write("\t\t    <th width=\"71\"> <div align=\"center\">NIC </div></th>\n");
      out.write("                       <th width=\"71\"> <div align=\"center\">address </div></th>\n");
      out.write("                          <th width=\"71\"> <div align=\"center\">Contact_number </div></th>\n");
      out.write("                             <th width=\"71\"> <div align=\"center\">Appointment Date</div></th>\n");
      out.write("                                <th width=\"71\"> <div align=\"center\">Delete </div></th>\n");
      out.write("\t\t  </tr>\t\n");
      out.write("\t\t\t");
while((rec!=null) && (rec.next())) { 
      out.write("\n");
      out.write("\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t    <td><div align=\"center\">");
      out.print(rec.getString("pid"));
      out.write("</div></td>\n");
      out.write("\t\t\t\t    <td>");
      out.print(rec.getString("first_name"));
      out.write("</td>\n");
      out.write("\t\t\t\t    <td>");
      out.print(rec.getString("last_name"));
      out.write("</td>\n");
      out.write("\t\t\t\t    <td><div align=\"center\">");
      out.print(rec.getString("gender"));
      out.write("</div></td>\n");
      out.write("\t\t\t\t    <td align=\"right\">");
      out.print(rec.getString("age"));
      out.write("</td>\n");
      out.write("\t\t\t\t    <td align=\"right\">");
      out.print(rec.getString("dob"));
      out.write("</td>\n");
      out.write("                                     <td align=\"right\">");
      out.print(rec.getString("nic"));
      out.write("</td>\n");
      out.write("                                      <td align=\"right\">");
      out.print(rec.getString("address"));
      out.write("</td>\n");
      out.write("                                       <td align=\"right\">");
      out.print(rec.getString("contact_number"));
      out.write("</td>\n");
      out.write("                                        <td align=\"right\">");
      out.print(rec.getString("appintment_date"));
      out.write("</td>\n");
      out.write("\t\t\t\t    <td align=\"center\"> <a href=\"delete.jsp?pid=");
      out.print(rec.getString("pid"));
      out.write("\">Del</a></td>\n");
      out.write("                                    \n");
      out.write("                                    <td>\n");
      out.write("                                <p>\n");
      out.write("       <a href=\"#\" class=\"btn btn-info btn-lg\">\n");
      out.write("          <span class=\"glyphicon glyphicon-remove-sign\"></span> Remove\n");
      out.write("        </a>\n");
      out.write("         <a href=\"#\" class=\"btn btn-info btn-lg\">\n");
      out.write("          <span class=\"glyphicon glyphicon-edit\"></span> Edit\n");
      out.write("        </a>\n");
      out.write("      </p>\n");
      out.write("                            </td>\n");
      out.write("\t\t\t\t  </tr>\n");
      out.write("\t       \t");
}
      out.write("\n");
      out.write("\t  \t</table> \n");
      out.write("                </div>\n");
      out.write("\t    ");
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
			e.printStackTrace();
		}
	
		try {
			if(s!=null){
				s.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
			e.printStackTrace();
		}
	
      out.write("\n");
      out.write("</body>\n");
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
