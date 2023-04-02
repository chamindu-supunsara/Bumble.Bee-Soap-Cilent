<%-- 
    Document   : ManageCustomers
    Created on : Mar 24, 2023, 9:39:06 AM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Customer</title>
        <link rel="stylesheet" href="ManageCustomersST.css">
    </head>
    <body>
        <div class="wrapper">
    <h2>MANAGE CUSTOMER DETAILS</h2>
    <form action="Customer_Register_Servelt" method="post">
      <div class="input-box">
          <input type="text" name="id" placeholder="Enter your ID" required>
      </div>
      <div class="input-box">
        <input type="text" name="name" placeholder="Enter your Full Name" >
      </div>
      <div class="input-box">
          <input type="email" name="email" placeholder="Enter Your Email" >
      </div>
      <div class="input-box">
          <input type="password" name="password" placeholder="Enter Your Password" >
      </div>
      <div class="input-box button">
          <input type="Submit" value="Update Customer" formaction="Admin_Customer_Update_Servelet" onclick="myFunction1()">
      </div>
      <div class="input-box button">
          <input type="Submit" value="Delete Customer" formaction="Admin_CustomerDelete_Servelt" onclick="myFunction2()">
      </div>
    </form>
  </div>
  </body>
  <script>
    function myFunction1() {
        alert("Update Successfuly");
    }
    function myFunction2() {
        alert("Delete Successfuly");
    }
</script>
</html>
