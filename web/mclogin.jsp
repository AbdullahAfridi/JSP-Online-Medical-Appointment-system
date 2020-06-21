<%-- 
    Document   : mclogin.jsp
    Created on : Dec 2, 2018, 12:39:51 PM
    Author     : ACS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%//@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                        Statement stmt = con.createStatement();
                        
                        String query = "SELECT * FROM customer WHERE username='"+username+"' AND password='"+password+"'";
                       
                        ResultSet rs = stmt.executeQuery(query);
                       


                       
                       while(rs.next()) 
                        { 
                        
                        String user_type=rs.getString("user_type"); 
                        if("admin".equals(user_type)) 
                        {
                            session.setAttribute("cus_id",rs.getString("cus_id"));
                        response.sendRedirect("adminePanel.jsp?user="+rs.getString("cus_name")); 
                        } 
                        
                        else if("customer".equals(user_type)) 
                        { 
                                session.setAttribute("cus_id",rs.getString("cus_id"));
                                
                        response.sendRedirect("Sorting.jsp?user="+rs.getString("cus_name")); 
                        } 
                       
                     
          
                    }
                        if (rs.next() == false) {
                            out.print("<p class='error'>Invalid Username or password</p>");
                            %> 
                            <jsp:include page='index.jsp' />
                            <%
                            
                            
                        }
                    }
                    catch (Exception e) {
                        out.println(e.getMessage());
                    }
                %>

    </body>
</html>
