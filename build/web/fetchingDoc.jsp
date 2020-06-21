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
     

<h1> <span class="yellow">Doctor Information</span></h1>
<p>
        <a href="insertData2.jsp" class="btn btn-info btn-lg" style="margin-left: 1270px">
            <span class="glyphicon glyphicon-plus-sign" ></span> Plus
        </a>


</body>
<form method="post">
    

<table class="container">
    
<thead>
		<tr>
			<th><h1 style="color: orangered">Doctor_Name</h1></th>
			<th><h1 style="color: orangered">specialized_Area</h1></th>
			<th><h1 style="color: orangered">Address</h1></th>
			<th><h1 style="color: orangered">Phone_Number</h1></th>
                        <th><h1 style="color: orangered">Appointments</h1></th>
                        <th><h1 style="color: orangered"> Hospital </h1></th>
                        <th><h1 style="color: orangered"> Email </h1></th>
                         <th><h1 style="color: orangered"> Clinic_Date </h1></th>
                          <th><h1 style="color: orangered"> Clinic_Time </h1></th>
                           <th><h1 style="color: orangered"> Actions </h1></th>
                          
		</tr>
	</thead>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/contact";
String username="root";
String password="";
String query="SELECT * FROM  doctor order by DoctorID ASC ";
Connection conn=DriverManager.getConnection(url,username,password);
    Statement stmt = conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>
   <tbody>
		<tr>
                    <td> <%= rs.getString("DoctorName")%></td>
			 <td> <%= rs.getString("SpecelizedArea")%></td>
                          <td> <%= rs.getString("Address")%></td>
                           <td> <%= rs.getString("ContactNO")%></td>
                            <td> <%= rs.getString("MaxAppointments")%></td>
                            <td> <%= rs.getString("Hospital")%></td>
                            <td> <%= rs.getString("Email")%></td>
                            <td> <%= rs.getString("ClinicDate")%></td>
                            <td> <%= rs.getString("ClinicTime")%></td>
                            
                            <td>
                                 <p>
    <a href="deleteDoc.jsp?DoctorID=<%= rs.getString("DoctorID")%>">                        
          <span class="glyphicon glyphicon-remove-sign" style="color: red"></span>
      </a>
         
      </p>
                            </td>
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