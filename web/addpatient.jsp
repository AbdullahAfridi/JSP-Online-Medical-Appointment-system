<%-- 
    Document   : addpatient
    Created on : Nov 28, 2018, 8:52:57 PM
    Author     : Sanjaya Parakrama
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
<%

String first_name=request.getParameter("cus_name");
String age=request.getParameter("age");
String gender=request.getParameter("gender");
String email=request.getParameter("email");
String mobil=request.getParameter("mobile");
String apid=request.getParameter("apID");
String us=request.getParameter("username");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
Statement stmt=con.createStatement();


String query= "INSERT INTO customer(cus_name,age,gender,email,mobile,apID,username) "
        + "VALUES ('"+first_name+"','"+age+"','"+gender+"','"+email+"','"+mobil+"','"+apid+"','"+us+"')";
int n=stmt.executeUpdate(query);
 if (n!=0){
           out.println("<h4>Patient Add Successfully.</h4>");
              }else{
           out.println("<h4>Error while Adding patient...</h4>");
                        }
}catch (Exception e) {
                        out.println(e.getMessage());
                    }
%>
    </body>
</html>