

<%@page import="javax.swing.JOptionPane"%>
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
            text-align: center;
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
        <li class="active"><a href="#">Home</a></li>
        <li><a href="about.html">About</a></li> 
        <li><a href="contactus.html">Contact</a></li> 
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="loginn.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="loginn.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>

    </div>
  </div>

</nav>
        
        <div class="container">
  
   
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>

    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="image/cd1.jpg" alt="Photo Iphone" style="width:100%;height:350px">
      </div>

      <div class="item">
        <img src="image/cd2.jpg" alt="Badulla" style="width:100%;height:350px">
      </div>
    
      <div class="item">
        <img src="image/cd3.jpg" alt="Passara" style="width:100%;height:350px">
      </div>

    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </div>
  <div class="container-fluid bg-light-gray">

<div class="container pt-5">
   
  <div class="row">
    <h3 style="font-size:30px"><b>Most Expert Doctors</b></h3>
  </div>
    <div class="row">
    <div class="underline"></div>
  </div>
</div>



<div class="container mt-5">
  <div class="row">
    <div class="col-md-3">
      <div class="card">
         <img src="image/doc4.jpg" alt="card-1" class="card-img-top" style=" height:350px ">
        <div class="card-body">
          <h5 style="margin-left: 90px"><b>Dr Sandaru Imal</b></h5> 
        <p style="margin-left: 70px"> Trained at Lanka Hospital</p>
       <p style="margin-left: 85px"> 9 years experience</p>
        </div>
      </div>

    </div>
    
    <div class="col-md-3">
      <div class="card">
        <img src="image/doc3.jpg" alt="card-1" class="card-img-top"  style="height:350px">
        <div class="card-body">
          <h5 style="margin-left: 100px"><b>Dr Theapaq</b></h5> 
          <p style="margin-left: 85px"> Trained at Durdan's </p>
          <p style="margin-left: 90px"> 7 years experience</p>
        </div>
      </div>
    </div>
    
    <div class="col-md-3">
      <div class="card">
        <img src="image/doc5.jpg" alt="card-1" class="card-img-top" style="height:350px">
        <div class="card-body">
          <h5 style="margin-left: 100px"><b>Dr Hasini</b></h5>
          <p  style="margin-left: 50px"> Trained at Asiri Central Hospital</p>
          <p  style="margin-left: 80px">10 years experience </p>
        </div>
      </div>
    </div>
    <div class="col-md-3">
      <div class="card">
        <img src="image/doc6.jpg" alt="card-1" class="card-img-top" style="height:350px">
        <div class="card-body">
          <h5 style="margin-left: 90px"><b>Dr Thulasika</b></h5>
          <p  style="margin-left: 40px"> Trained at National Eye Hospital</p> 
           <p  style="margin-left: 80px">10 years experience </p>
        </div>
      </div>
    </div>
  </div>
</div>
     </div>

     
    <div class="content" align="center">
          <h2>Search Doctor Here</h2>
            <h2>And Make Your Appointment</h2>
        <form name="Select" action="Sorting.jsp" method="POST">
            <table>
               <tbody>
                   <tr> <td>Search by Disease</td></tr>
                    <tr>
                        <td>
                            <%
                                try
                                {
                                  
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                                    String query = "Select SpecelizedArea from doctor";
                                    PreparedStatement ptmt = con.prepareStatement(query);
                                    ResultSet rs = ptmt.executeQuery();
                                   
                                        %>
                                        <select id="sell" name="Select_Illness">
                                            <%
                                             while(rs.next())
                                             {%>
                                             <option><%= rs.getString("SpecelizedArea")%></option>
                                             <% } %>
                                        </select>
                                             <%}
                                              catch(Exception ex)
                                                {
                                                    
                                                }

                                             %>
                                          
                                
                       
                        </td>
                    </tr>
                    <tr><td>Select the Date That You Want to Make An Appointment</td></tr>
                     <tr>
                         <td>
                            <input type="date" value="2018-11-30" min="2018-01-01" max="2020-12-31" name="date_app">
                         </td>
                     </tr>
                        <tr>
                         <td>
                             <select name="time_app">
                                 <option selected disabled>Please select Time</option>
                                 <option>Morning (08.00to12.00)</option>
                                 <option>Afternoon (12.00to14.00)</option>
                                 <option>Evening (14.00to19.00)</option>
                                 <option>Night (19.00to22.00)</option>
                             </select>
                         </td>
                        </tr>
                </tbody>
            </table>
            <br>
            <a href="#">  <input type="submit" value="Search" name="Sort" /></a>
                      
            </form>
        <br>
        
    </div>
    <footer id="myFooter">
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <h5>Get started</h5>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="http://localhost/register.php">Sign up</a></li>
                        <li><a href="http://localhost/login.php">Login</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>Coustomer Services</h5>
                    <ul>
                        <li><a href="#">0769657777</a></li>
                        <li><a href="#">Abdullahdaulatzai@yahoo.com</a></li>
                        <li><a href="#">226 Lower St, Badulla</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>Best For</h5>
                    <ul>
                        <li><a href="#">General Surgeries</a></li>
                        <li><a href="#">Eyes Treatment </a></li>
                        <li><a href="#"> arthropathy</a></li>
                    </ul>
                </div>
                <div class="col-sm-3">
                    <h5>About</h5>
                    <ul>
                        <li><a href="http://localhost/contact.php">Contact Us</a></li>
                        <li><a href="file:///C:/wamp/www/about.html#">About Us</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                    </ul>
                </div>
            </div>
            <!-- Here we use the Google Embed API to show Google Maps. -->
            <!-- In order for this to work in your project you will need to generate a unique API key.  -->
            <div style="width: 100%"><iframe width="100%" height="300" src="https://maps.google.com/maps?width=100%&amp;height=300&amp;hl=en&amp;q=226%20Lower%20St%2C%20Badulla+(Ramya%20Communication)&amp;ie=UTF8&amp;t=&amp;z=14&amp;iwloc=B&amp;output=embed" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"><a href="https://www.maps.ie/create-google-map/">Google Maps iframe generator</a></iframe></div><br />
        </div>
        <div class="social-networks">
            <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
            <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
            <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
        </div>
        <div class="footer-copyright">
            <p>© 2018 Copyright Text </p>
        </div>
    </footer>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

       
    </body>
</html>
