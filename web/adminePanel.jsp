<html>
  <head>
    <meta charset="utf-8">
    <title>Locatielezen Administrator page</title>
    <link rel="stylesheet" href="css/panel.css" charset="utf-8" />
    <link rel="stylesheet" href="admin--test.css" charset="utf-8" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  <style>
    a,hover{ 
    color: white;
    text-decoration: none;
    
}  
span{
    
    font-size:20px
}
      
</style>
  <body class="admin">

    <header class="admin__statusbar flex--center">
      <span class="home"><i class="fa fa-home"></i>Home</span>
      <span id="username"><i class="fa fa-user"></i>
      
      
       <%
                         if(session.getAttribute("cus_id")!=null){
                            String username=request.getParameter("user");
                            out.print(username+"   ");
                            out.print("<a style='text-decoration:none; font-size:15px;' href='index.jsp'>(Logout)</a>");
                        }
                else {
                             
                           response.sendRedirect("loginn.jsp");
                         }
         
         %>
      
      </span>
    </header>

    <nav class="admin__sidepanel">
      <ul>
        <li>
            <a href="ContctFetching.jsp" >  <span class="glyphicon glyphicon-envelope"></span> &nbsp&nbsp&nbsp Inquiries</a>
        </li>
        <li>
            <a href="fetchinPatients.jsp"><i class="fa fa-bed" style="font-size:25px;color:white"></i></i>Manage Patients</a>
        
        </li>
        <li>
            <a href="fetchingDoc.jsp">    <span class="glyphicon glyphicon-user"></span> &nbsp&nbsp&nbsp&nbsp&nbspManage Doctors</a>
         
        </li>
        <li>
         <a href="fetchingPoint.jsp">   <span class="glyphicon glyphicon-calendar"></span>&nbsp&nbsp&nbsp&nbsp Appointments</a>
        </li>
        
      </ul>
        
    </nav>
      

    <!--<main class="admin__main">

      <h1>
        Document Title
      </h1>

    </main>
-->
  </body>
</html>
