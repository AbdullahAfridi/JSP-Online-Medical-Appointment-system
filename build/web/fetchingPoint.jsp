<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.DriverManager"%>

<%@page import="java.sql.Connection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                                                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Displaying Data From SQL</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="css/roo.css"> 
  <style>
      
      h1{
       color: red;   
          
      }
      span{
          
          font-size: 30px;
            border-top-color: red;      }
  </style>
 
</head>
<body>
     

<h1> <span class="yellow">Appointments Information</span></h1>



</body>
<form method="post">
    

<table class="container">
    
<thead>
		<tr>
			<th><h1 style="color: orangered">Appointment_ID</h1></th>
			<th><h1 style="color: orangered">Doctor_ID</h1></th>
			<th><h1 style="color: orangered">Patient_ID</h1></th>
			<th><h1 style="color: orangered">Clinic_Date</h1></th>
                        <th><h1 style="color: orangered">Clinic_Time</h1></th>
                        
                          
		</tr>
	</thead>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/contact";
String username="root";
String password="";
String query="SELECT * FROM  appointment ";
Connection conn=DriverManager.getConnection(url,username,password);
    Statement stmt = conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>
   <tbody>
		<tr>
                    <td> <%= rs.getString("AppointmentID")%></td>
			 <td> <%= rs.getString("DoctorID")%></td>
                          <td> <%= rs.getString("PatientId")%></td>
                           <td> <%= rs.getString("ClinicDate")%></td>
                            <td> <%= rs.getString("ClinicTime")%></td>
                           
		</tr>
        <%

}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }




%>

</form>
</html> 