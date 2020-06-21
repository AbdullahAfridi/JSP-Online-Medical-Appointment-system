<%-- 
    Document   : viewDoctors
    Created on : Dec 1, 2018, 8:38:26 PM
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
                            %>

                                <script>
                                test();
                                </script>
                            <%
                        } else {
                %>
                
                <div class="form-group">
                    <label for="id" class="col-sm-3 control-label">Doctor ID</label>
                    <div class="col-sm-9">
                        <input type="text" id="id" placeholder="<%= resultset.getString("DoctorId") %>" name="id" class="form-control" autofocus>
                    </div>
                </div>

                <div class="form-group">
                    <label for="DoctorName" class="col-sm-3 control-label">Doctor Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="<%= resultset.getString("DoctorName") %>" name="name" class="form-control" autofocus>
                    </div>
                </div>
             
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-3 control-label">Phone number </label>
                    <div class="col-sm-9">
                        <input type="text" id="phoneNumber" placeholder="<%= resultset.getString("ContactNO") %>" name="pnumber" class="form-control">
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
                        <input type="text" id="address" placeholder="<%= resultset.getString("Address") %>" class="form-control" name= "address">
                    </div>
                </div>

                <div class="form-group">
                    <label for="SpecializedArea" class="col-sm-3 control-label">Specialized Area</label>
                    <div class="col-sm-9">
                        <input type="text" id="SpecializedArea" placeholder="<%= resultset.getString("SpecelizedArea") %>" name= "specialized" class="form-control" autofocus>
                    </div>
                </div>

                <div class="form-group">
                    <label for="Hospital" class="col-sm-3 control-label">Hospital</label>
                    <div class="col-sm-9">
                        <input type="text" id="Hospital" placeholder="<%= resultset.getString("Hospital") %>" name= "SpecelizedArea" class="form-control" autofocus>
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

    </body>

</html>
