

<%@page import="java.sql.Statement"%>
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
        .content,h1{
            text-align: center;
            font-family:Britannic Bold;
        }
        .content{
            padding: 120px;
        }
        
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 0px solid #dddddd;
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
      <a class="navbar-brand" href="#" style="color:red; ">Badulla Medical Center</a>
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
        
       

     
    <div class="content" align="center">
        <%
                    out.println("<form action=ShowAppointment.jsp method=post>");
                    
                    String did = request.getParameter("Doctor ID");
                    String pid = request.getParameter("Patient Id");
                   String cdate = request.getParameter("Clinic Date");
                  
                    String ctime = request.getParameter("Clinic Time");
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                        Statement stmt = con.createStatement();
                        
                        String query = "INSERT INTO appointment (DoctorID,PatientID,ClinicDate,ClinicTime) VALUES ('"+did+"', '"+pid+"', '"+cdate+"', '"+ctime+"')";
                        int n = stmt.executeUpdate(query);
                        if (n!=0){
                            //out.println(query);
                            out.println("<h2>Appointment Recoded... </h2>");
                            out.println("<br>");
                            out.println("<table border=0>");
                            out.println("<tr>");
                            out.println("<th>Enter the Patient ID</th>");
                            out.println("<th><input type='text' name='patientid' value='' size='30' /></th>");
                            out.println("<td><a href='ShowAppointment.jsp'><input type='submit' value='GET YOUR APPOINTMENT ID' name='btnSubmit'/></a></td>");
                            out.println("</tr>");
                            out.println("</table>");
                            
                        }
                        else{
                            out.println("<h4>Error while registering the user.</h4>");
                        }
                        
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    out.println("</form>");
                %>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

       
    </body>
</html>
