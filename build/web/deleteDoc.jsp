<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<html>
<head>
	<title>ThaiCreate.Com JSP Tutorial</title>
</head>
<body>
	
	<%	
	Connection connect = null;
	Statement s = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/contact" +
				"?user=root&password=");
		
		s = connect.createStatement();
		
		String strpid = request.getParameter("DoctorID");
		
		
		String sql = "DELETE FROM doctor " +
				" WHERE DoctorID = '" + strpid + "' ";
         s.execute(sql);
        
         out.println("Record Delete Successfully");
         response.sendRedirect("fetchingDoc.jsp");
	  		
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
	%>
</body>
</html>