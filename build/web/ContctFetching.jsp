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
  
 
</head>
<body>

<h1> <span class="yellow">Inquiries</span></h1>

</body>
<form method="post">

<table class="container">
<thead>
		<tr>
			<th><h1 style="color: orangered">First_Name</h1></th>
			<th><h1 style="color: orangered">Last_Name</h1></th>
			<th><h1 style="color: orangered">Email</h1></th>
			<th><h1 style="color: orangered">Phone_Number</h1></th>
                        <th><h1 style="color: orangered">Message</h1></th>
                      
                        
		</tr>
	</thead>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/contact";
String username="root";
String password="";
String query="select * from contact12";
Connection conn=DriverManager.getConnection(url,username,password);
    Statement stmt = conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>
   <tbody>
		<tr>
                    <td> <%= rs.getString("fname")%></td>
			 <td> <%= rs.getString("lname")%></td>
                          <td> <%= rs.getString("email")%></td>
                           <td> <%= rs.getString("phone")%></td>
                            <td> <%= rs.getString("message")%></td>
                         
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