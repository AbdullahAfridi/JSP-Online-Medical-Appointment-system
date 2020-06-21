<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%
String fname1 = request.getParameter("fname");
String lname1 = request.getParameter("lname");
String email1 = request.getParameter("email");
String message1 = request.getParameter("message");
String phone1 = request.getParameter("phone");

Connection connection = null;
PreparedStatement pstatement = null;
int updateQuery = 0;
if(fname1!=null && lname1!=null && phone1!=null)
    
{
if(fname1!="" && lname1!="" && phone1!="")
{
    
  
try {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","");
String queryString = "insert into contact12(fname,lname,email,phone,message) values(?,?,?,?,?)";
pstatement = connection.prepareStatement(queryString);
pstatement.setString(1, fname1);
pstatement.setString(2, lname1);
pstatement.setString(3, email1);
pstatement.setString(4, phone1);
pstatement.setString(5, message1);
updateQuery = pstatement.executeUpdate();
if (updateQuery != 0) {%>
<!DOCTYPE html>
<html lang="en">
<head>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	.bs-example{
		margin: 20px;
	}
</style>
</head>
<body>
<div class="bs-example">
    <div class="alert alert-success fade in">
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Success!</strong> Thank You! Your Inquiry successfully Sent 
    </div>
</div>
</body>
</html>          

<%
}

} 
catch (Exception ex){
out.println(ex+"<br> "+ "Please Add Unique Email Address And Fill all The Fields");

ex.printStackTrace();
}finally {
// close all the connections.
pstatement.close();
connection.close();
}

}

}

%>