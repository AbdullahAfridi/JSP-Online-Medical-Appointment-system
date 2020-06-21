

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Medical Center </title>
          <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

          <link rel="stylesheet" type="text/css" href="css/foot.css"> 
            <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    </head>
    <body>
         <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="#" style="color:red; ">Badullah Medical Center</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="http://localhost:8080/RAD-1_Project/index.jsp">Home</a></li>
        <li><a href="#">About</a></li> 
        <li><a href="contactus.html">Contact</a></li> 
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>

    </div>
  </div>

</nav>
        
        

     
    <div class="content">
        <%
                    out.println("<form action='AppointmentSubmission.jsp' method='POST'>");
                            
                    out.println("<table border=0>");
                    String dname = request.getParameter("docname");    
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                    String query = "Select DoctorID,ClinicDate,Week_Day_Section from doctor where DoctorName='"+dname+"'";
                    PreparedStatement ptmt = con.prepareStatement(query);
                    ResultSet rs = ptmt.executeQuery();
                    if(rs.next())
                    {
                        out.println("<tr>");
                        String id = rs.getString("DoctorID");
                        out.println("<th>DoctorID</th>");
                        out.println("<th><input type=text value='"+id+"' name = 'Doctor ID'></th>");
                        out.println("</tr>");

                        out.println("<tr>");
                        String cldate = rs.getString("ClinicDate");
                        out.println("<th>Clinic Date</th>");
                        out.println("<th><input type=date value='"+cldate+"' name = 'Clinic Date'></th>");
                        out.println("</tr>");

                        out.println("<tr>");
                        String cltime = rs.getString("Week_Day_Section");
                        out.println("<th>Clinic Time</th>");
                        out.println("<th><input type='text' value='"+cltime+"' name='Clinic Time'></th>");
                        out.println("</tr>");

                        out.println("<tr>");
                        out.println("<td>Patient Id </td>");
                        out.println("<td><input type='text' name='Patient Id' value='' size='30' /></td>");
                        out.println("</tr>");

                        out.println("<tr>");
                        out.println("<td></td>");
                        out.println("<td><input type='submit' value='Submit' name='btnSubmit'/><input type='reset' value='Clear' name='btnClear' /></td>");
                        out.println("</tr>");

                        out.println("</table>");

                        out.println("</form>");
                    }

                %>
    </div>
 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

       
    </body>
</html>
