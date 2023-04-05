<%-- 
    Document   : admin
    Created on : Mar 7, 2023, 10:24:59 AM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <link rel="stylesheet" href="adminStyle.css"> 
    </head>
    <body>
    <div class="wrapper">
    <form>
      <div class="input-box button">
        <button type="button" id="btn1"><a href="ViewDetails.jsp">View Customers Details</a></button>
      </div>
      <div class="input-box button">
         <button type="button" id="btn1"><a href="ManageCustomers.jsp">Manage Customers Details</a></button>
      </div>
      <div class="input-box button">
         <button type="button" id="btn1"><a href="ManageOrders.jsp">Manage Orders Details</a></button>
      </div>
    </form>
  </div> 
  </body>
</html>
