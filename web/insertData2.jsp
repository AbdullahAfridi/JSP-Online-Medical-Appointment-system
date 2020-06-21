<%-- 
    Document   : insertData2
    Created on : Nov 18, 2018, 2:23:03 PM
    Author     : Sandaru Imal
--%>

<%@page import="java.sql.Time"%>
<%@page import="javafx.scene.control.Alert"%>
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
    <script>
        function test() {
            alert("Records Added Successfully");
        }
        
        function test2(){
            alert("Error While Adding Records");
        }
    </script>
    <style>

        .button {
            background-color: #E130CD;
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

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <body>

       
            <div class="container-fluid bg-light-gray">

                <div class="container pt-5">

                    <div class="row">
                        <h3 style="font-size:30px"><b>Add New Doctors</b></h3>
                    </div>
                    <div class="row">
                        <div class="underline"></div>
                    </div>
                </div>

            </div>

                <div class="container mt-5">
                    <form action="insertData2.jsp" method="POST">

                        <div class="form-group">
                            <label for="firstName" class="col-sm-3 control-label">First Name</label>
                            <div class="col-sm-9">
                                <input type="text" id="firstName" placeholder="First Name" name="fname" class="form-control" autofocus>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="lastName" class="col-sm-3 control-label">Last Name</label>
                            <div class="col-sm-9">
                                <input type="text" id="lastName" placeholder="Last Name" name="lname" class="form-control" autofocus>
                            </div>
                        </div>


                        <div class="form-group">
                            <label for="phoneNumber" class="col-sm-3 control-label">Phone number </label>
                            <div class="col-sm-9">
                                <input type="text" id="phoneNumber" placeholder="Phone Number" name="pnumber" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="email" class="col-sm-3 control-label">Email </label>
                            <div class="col-sm-9">
                                <input type="text" id="email" placeholder="Email" class="form-control" name= "email">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="address" class="col-sm-3 control-label">Address </label>
                            <div class="col-sm-9">
                                <input type="text" id="address" placeholder="Address" class="form-control" name= "address">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="SpecializedArea" class="col-sm-3 control-label">Specialized Area</label>
                            <div class="col-sm-9">
                                <input type="text" id="SpecializedArea" placeholder="Specialized Area" name= "specialized" class="form-control" autofocus>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="Hospital" class="col-sm-3 control-label">Hospital</label>
                            <div class="col-sm-9">
                                <input type="text" id="Hospital" placeholder="Hospital" name= "hospital" class="form-control" autofocus>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="Max" class="col-sm-3 control-label">Max Appoinments</label>
                            <div class="col-sm-9">
                                <input type="text" id="Hospital" placeholder="Max Appoinments" name= "maxAppoinments" class="form-control" autofocus>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="Max" class="col-sm-3 control-label">Available Date</label>
                            <div class="col-sm-9">
                                <input type="text" id="Hospital" placeholder="Available Date" name= "available" class="form-control" autofocus>
                            </div>
                        </div>
                          <div class="form-group">
                            <label for="Max" class="col-sm-3 control-label">Week_Days</label>
                            <div class="col-sm-9">
                                <input type="text" id="Hospital" placeholder="Week_Days" name= "Week_Day" class="form-control" autofocus>
                            </div>
                        </div>
                          <div class="form-group">
                            <label for="Max" class="col-sm-3 control-label">Days_Section</label>
                            <div class="col-sm-9">
                                <input type="text" id="Hospital" placeholder="Morning,Afternoon or Evening" name= "Week_Day_Section" class="form-control" autofocus>
                            </div>
                        </div>



                        <div class="form-group">
                            <label for="AvailableDays" class="col-sm-3 control-label">Available Days</label>
                            <div class="col-sm-9">

                                <label class="radio-inline">

                                </label>

                                <div class="container">


                                    <div class="checkboxMo">
                                        <label><input type="checkbox" value="08.00-12.00" name="time">Morning(08.00to12.00)</label>
                                    </div>
                                    <div class="checkboxNo">
                                        <label><input type="checkbox" value="12.00-14.00" name="time">Noon(12.00to14.00)</label>
                                    </div>
                                    <div class="checkboxEv">
                                        <label><input type="checkbox" value="14.00-19.00" name="time">Evening(14.00to19.00)</label>
                                    </div>
                                    <div class="checkboxNi">
                                        <label><input type="checkbox" value="19.00-22.00" name="time">Night(19.00to22.00)</label>
                                    </div>
                                </div>

                                <label class="radio-inline">

                                </label>

                                <div class="container">

                                </div>



                            </div>
                        </div>

                        &nbsp;
                        &nbsp;
                        <div class="form-group">
                            <label for="address" class="col-sm-3 control-label"></label>
                            <div class="col-sm-9">
                                <input type="submit" value="Add Doctor" name="btnRegister" class="button"/>
                            </div>
                        </div>
                    </form>
                </div>
            
        



        <div class="content">
        </div>
        <%  
           
            

            
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String fullName = fname + " " + lname;
            String contact = request.getParameter("pnumber");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String date = request.getParameter("available");
            String specialized = request.getParameter("specialized");
            String hospital = request.getParameter("hospital");
            String maxAppoinments = request.getParameter("maxAppoinments");
             String dy = request.getParameter("Week_Day");
            String WeeK= request.getParameter("Week_Day_Section");

            try {
                String timee = "1";
            String b[] = request.getParameterValues("time");
            for (int i = 0; i < b.length; i++) {
                timee += b[i] + "";
            }
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");

                Statement stmt = con.createStatement();

                String query1 = "INSERT INTO doctor(DoctorName,SpecelizedArea,Address,ContactNO,Hospital,Email,ClinicTime,ClinicDate,MaxAppointments,Week_Day,Week_Day_Section) VALUES('" + fullName + "','" + specialized + "','" + address + "','" + contact + "','" + hospital + "','" + email + "','"+timee+"','"+date+"','"+maxAppoinments+"','"+dy+"','"+WeeK+"')";
                int n = stmt.executeUpdate(query1);
                if (n != 0) {
        %>

        <script>
        test();
        </script>
        <%
                } else {
                     %>

        <script>
        test2();
        </script>
        <%
                }
            } catch (SQLException e) {
                out.println(e.getMessage());
            } catch (Exception e) {
                out.println(e.getMessage());
            }


        %> 

    </body>
    





</html>