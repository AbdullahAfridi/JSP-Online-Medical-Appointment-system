<%-- 
    Document   : register
    Created on : Nov 28, 2018, 8:21:20 PM
    Author     : ACS
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login/Register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="newjavascript.js"></script>
        <link rel="stylesheet" href="newcss.css">
    </head>
    <body>
        <%
            String fullname = request.getParameter("fullname");
            String age = request.getParameter("age");
            String mobile = request.getParameter("mobile");
            String gender = request.getParameter("gender");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String cpassword = request.getParameter("confirm-password");
            String email = request.getParameter("email");
            int l = mobile.length();
           // String query1 = "SELECT username FROM customer where username='" + username + "'";
            
           
             if (l == 10) {
                 
                     
                         Class.forName("com.mysql.jdbc.Driver");
                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
                         Statement stmt = con.createStatement();
                         String query = "SELECT username FROM customer where username='" + username + "'";
                         ResultSet rs = stmt.executeQuery(query);
                         if(rs.next()) {
                             String username1=rs.getString("username");
                             out.print("<p class='error'> Username &nbsp");
                             out.print(username1);
                                  out.print(" &nbsp already exists!!</p>");
                             
                             
                             
      
                         } 
                         else {
                             if(password!=cpassword){
                                 
                              //   String query2 = "INSERT INTO customer(cus_name,age,email,mobile,username,password) VALUES ('" + fullname + "','" + age + "', '" + email + "', '" + mobile + "', '" + username + "', '" + password + "');";
                                 ResultSet rss = stmt.executeQuery(query);
                                 int i = stmt.executeUpdate("INSERT INTO customer(cus_name,age,gender,email,mobile,username,password) VALUES ('" + fullname + "','" + age + "','" + gender + "', '" + email + "', '" + mobile + "', '" + username + "', '" + password + "');");
                                    
                                 if (i > 0) {
                                     out.println("<p class='success'>Registered Successfully, Now you can login </p>");
                                 }
                                 
                                 
                                 
                                 
                                 
                                 
                                 
                             }
                             else {
                                 out.print("<p class='error'> Passwords doesn't match </p>");
                                 
                                 
                             }
                             
                             
                             
                             
                             
                             
                         }
                         
                         
                        

             }
             
             else {
                 out.println("<p class='error'> Invalid Digits of phone number</p>");
                 
                 
                 
             }
   


            
        %>











        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-login">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-6">
                                    <a href="#" class="active" id="login-form-link">Login</a>
                                </div>
                                <div class="col-xs-6">
                                    <a href="#" id="register-form-link">Register</a>
                                </div>
                            </div>
                            <hr>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form id="login-form" action="https://phpoll.com/login/process" method="post" role="form" style="display: block;">
                                        <div class="form-group">
                                            <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                                        </div>
                                        <div class="form-group text-center">
                                            <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
                                            <label for="remember"> Remember Me</label>
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <div class="text-center">
                                                        <a href="https://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                    <form id="register-form" action="register.jsp" method="post" role="form" style="display: none;">
                                        <div class="form-group">
                                            <input type="text" name="fullname" id="fullname" tabindex="2" class="form-control" placeholder="Full Name">
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="age" id="age" tabindex="2" class="form-control" placeholder="Age">
                                        </div>
                                        <div class="form-group">
                                            &nbsp <input type="radio" name="gender" id="gender" tabindex="2" class="Gender" placeholder="Gender"> Male
                                            <input type="radio" name="gender" id="gender" tabindex="2" class="Gender" placeholder="Gender"> Female
                                        </div>



                                        <div class="form-group">
                                            <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="mobile" id="mobile" tabindex="2" class="form-control" placeholder="Mobile">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>














    </body>
</html>
