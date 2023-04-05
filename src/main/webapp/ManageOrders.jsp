<%-- 
    Document   : ManageOrders
    Created on : Apr 5, 2023, 9:35:37 AM
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
    <h2>MANAGE ORDERS DETAILS</h2>
    <form action="Customer_Order_Servelt" method="post">
      <div class="input-box">
          <input type="text" name="id" placeholder="Enter your ID" required>
      </div>
      <div class="input-box">
        <input type="text" name="name" placeholder="Enter your Full Name" >
      </div>
      <div class="input-box">
          <input type="text" name="address" placeholder="Enter Your Address" >
      </div>
      <div class="input-box">
          <input type="text" name="price" placeholder="Enter Your Price" >
      </div>
      <div class="input-box">
          <input type="text" name="loan" placeholder="Enter Your Loan" >
      </div>
      <div class="input-box">
          <input type="text" name="birthday" placeholder="Enter Your Birthday" >
      </div>
      <div class="input-box">
          <input type="text" name="plan" placeholder="Enter Your Plan" >
      </div>
      <div class="input-box button">
          <input type="Submit" value="Update Order" formaction="Admin_Order_Update_Servelet" onclick="myFunction1()">
      </div>
      <div class="input-box button">
          <input type="Submit" value="Delete Order" formaction="Admin_DeleteOrders_Servelt" onclick="myFunction2()">
      </div>
    </form>
  </div>
  </body>
  <script>
    function myFunction1() {
        alert("Order Update Successfuly");
    }
    function myFunction2() {
        alert("Order Delete Successfuly");
    }
</script>
</html>