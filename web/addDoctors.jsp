<%-- 
    Document   : addDoctors
    Created on : Nov 30, 2018, 8:00:17 PM
    Author     : Sandaru Imal
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>



           
            <div class="container-fluid bg-light-gray">

                <div class="container pt-5">

                    <div class="row">
                        <h3 style="font-size:30px"><b>Add New Doctors</b></h3>
                    </div>
                    <div class="row">
                        <div class="underline"></div>
                    </div>
                </div>

                <div >
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
                                <input type="email" id="email" placeholder="Email" class="form-control" name= "email">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="address" class="col-sm-3 control-label">Address </label>
                            <div class="col-sm-9">
                                <input type="text" id="email" placeholder="Address" class="form-control" name= "address">
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
                        &nbsp;

                        <div class="form-group">
                            <label for="AvailableDays" class="col-sm-3 control-label">Available Days</label>
                            <div class="col-sm-9">

                                <label class="radio-inline">
                                    <input type="radio" name="radioWeekdays" checked>Weekdays
                                </label>

                                <div class="container">


                                    <div class="container">


                                        <div class="checkboxMo">
                                            <label><input type="checkbox" value="08.00-12.00" name="weekday">Morning(08.00to12.00)</label>
                                        </div>
                                        <div class="checkboxNo">
                                            <label><input type="checkbox" value="12.00-14.00" name="weekday">Noon(12.00to14.00)</label>
                                        </div>
                                        <div class="checkboxEv">
                                            <label><input type="checkbox" value="14.00-19.00" name="weekday">Evening(14.00to19.00)</label>
                                        </div>
                                        <div class="checkboxNi">
                                            <label><input type="checkbox" value="19.00-22.00" name="weekday">Night(19.00to22.00)</label>
                                        </div>
                                    </div>

                                    <label class="radio-inline">
                                        <input type="radio" name="radioWeekends">Weekends
                                    </label>

                                    <div class="container">


                                        <div class="checkboxMo">
                                            <label><input type="checkbox" value="" name="weekendMo">Morning(08.00to12.00)</label>
                                        </div>
                                        <div class="checkboxNo">
                                            <label><input type="checkbox" value="" name="weekendNo">Noon(12.00to14.00)</label>
                                        </div>
                                        <div class="checkboxEv">
                                            <label><input type="checkbox" value="" name="weekendEv">Evening(14.00to19.00)</label>
                                        </div>
                                        <div class="checkboxNi">
                                            <label><input type="checkbox" value="" name="weekendNi">Night(19.00to22.00)</label>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            &nbsp;
                            &nbsp;
                            <div class="form-group">
                                <label for="address" class="col-sm-3 control-label"></label>
                                <div class="col-sm-9">
                                    <input type="submit" value="Register" name="btnRegister" class="button"/>
                                </div>
                            </div>




                    </form>
                </div>
            </div>
        </div>

