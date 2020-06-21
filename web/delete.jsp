<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>

<html>
<head>
	<title>Deletion</title>
</head>
<body>
	
	<%	
	Connection connect = null;
	Statement s = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/contact" +"?user=root&password=");
				
		
		s = connect.createStatement();
		
		String strpid = request.getParameter("cus_id");
		
		
		String sql = "DELETE FROM customer " +" WHERE cus_id = '" + strpid + "' ";
				
         s.execute(sql);
        
         out.println("Record Delete Successfully");
	  	 response.sendRedirect("fetchinPatients.jsp");	
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