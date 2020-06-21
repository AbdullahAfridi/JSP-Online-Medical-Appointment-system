<%-- 
    Document   : searchData2
    Created on : Dec 2, 2018, 6:24:02 AM
    Author     : Sandaru Imal
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Medical Center </title>
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

    <link rel="stylesheet" type="text/css" href="css/foot.css"> 

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-2.1.3.min.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>

        .button {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin-right: 50px;
            cursor: pointer;
        }
    </style>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <body>


       
                    

            
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


            <div class="container pt-5">

                <div class="row">
                    <h3 style="font-size:30px"><b>View Doctors</b></h3>
                </div>
                <div class="search">

                    <form action="searchData2.jsp" method="POST">
                        <input type="text" id="id" placeholder="Enter the Doctor's Name to Search" name="Search" class="form-control" autofocus>
                        <input type="submit" value="Search" name="btnSearch" class="button"/>

                    </form>>

                </div>




                <%

                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                        Statement stmt = con.createStatement();
                        String search = request.getParameter("Search");
                        ResultSet resultset
                                = stmt.executeQuery("select * from doctor where DoctorName LIKE '" + search + "'");

                        if (!resultset.next()) {
                            out.println("Sorry, could not find that Doctor. ");
                        } else {
                %>

                <div class="form-group">
                    <label for="id" class="col-sm-3 control-label">Doctor ID</label>
                    <div class="col-sm-9">
                        <input type="text" id="id" placeholder="<%= resultset.getString("DoctorId")%>" name="id" class="form-control" autofocus>
                    </div>
                </div>

                <div class="form-group">
                    <label for="DoctorName" class="col-sm-3 control-label">Doctor Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="<%= resultset.getString("DoctorName")%>" name="name" class="form-control" autofocus>
                    </div>
                </div>

                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-3 control-label">Phone number </label>
                    <div class="col-sm-9">
                        <input type="text" id="phoneNumber" placeholder="<%= resultset.getString("ContactNO")%>" name="pnumber" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email </label>
                    <div class="col-sm-9">
                        <input type="email" id="email" placeholder="<%= resultset.getString("Email") %>" class="form-control" name= "email">
                    </div>
                </div>

                <div class="form-group">
                    <label for="address" class="col-sm-3 control-label">Address </label>
                    <div class="col-sm-9">
                        <input type="text" id="address" placeholder="<%= resultset.getString("Address")%>" class="form-control" name= "address">
                    </div>
                </div>

                <div class="form-group">
                    <label for="SpecializedArea" class="col-sm-3 control-label">Specialized Area</label>
                    <div class="col-sm-9">
                        <input type="text" id="SpecializedArea" placeholder="<%= resultset.getString("SpecelizedArea")%>" name= "specialized" class="form-control" autofocus>
                    </div>
                </div>

                <div class="form-group">
                    <label for="Hospital" class="col-sm-3 control-label">Hospital</label>
                    <div class="col-sm-9">
                        <input type="text" id="Hospital" placeholder="<%= resultset.getString("Hospital")%>" name= "SpecelizedArea" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="Hospital" class="col-sm-3 control-label"></label>
                    <div class="col-sm-9">
                        <form action="deleteData3.jsp" method="POST">
                        <input type="submit" value="Delete" name="btnSearch" class="button"/>
                        </form>
                    </div>
                </div>


                <%
                    }
                %>
                <%
                    } catch (SQLException e) {
                        e.getMessage();
                    }
                %>

            </div>

            <div class="content">
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


    </body>

</html>