<%-- 
    Document   : CustomerRegistor
    Created on : Feb 6, 2023, 12:18:06 PM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Stylesheet" href="CustomerRegistorST.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
        <title>Customer Registration</title>
    </head>
    <body>
        
    <div class="wrapper">
    <h2>Registration</h2>
    <form action="Customer_Register_Servelt" method="post">
      <div class="input-box">
          <input type="text" name="id" placeholder="Enter your ID" required>
      </div>
      <div class="input-box">
        <input type="text" name="name" placeholder="Enter your Full Name" required>
      </div>
      <div class="input-box">
          <input type="email" name="email" placeholder="Enter Your Email" required>
      </div>
      <div class="input-box">
          <input type="password" name="password" placeholder="Enter Your Password" required>
      </div>
      <div class="input-box button">
        <input type="Submit" value="Register Now">
      </div>
      <div class="text">
        <h3>Already have an account? <a href="CustomerLogin.jsp">Login now</a></h3>
      </div>
    </form>
  </div>
  </body>
</html>
