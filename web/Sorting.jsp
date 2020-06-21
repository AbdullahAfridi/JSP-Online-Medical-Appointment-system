

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <%
                         if(session.getAttribute("cus_id")!=null){
                            String username=request.getParameter("user");
                            
                        }
                else {
                             
                           response.sendRedirect("loginn.jsp");
                         }
         
         %>
<!DOCTYPE html>
<html>
    <head>
        <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
            
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
        </style>
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
        <li><a href="logout.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>

    </div>
  </div>

</nav>
        <div class="container mt-5">
            
        </div>
        
     

     
    <div class="content">
        <table border="1">
                <thead>
                    <tr>
                        <th>Doctor Name</th>
                        <th>Specialized Field</th>
                        <th>Clinic Date</th>
                        <th>Clinic Time</th>
                        <th>Appointment</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
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
        %> 
                     
          
                    
                </tbody>
            </table>
    </div>
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

       
    </body>
</html>
