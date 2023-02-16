<%-- 
    Document   : CustomerLogin
    Created on : Feb 6, 2023, 12:12:35 PM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Stylesheet" href="CustomerLoginST.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
        <title>Customer Logging</title>
    </head>
    <body>
        
    <div class="container">
      <div class="wrapper">
        <div class="title"><span>Customer Login</span></div>
        <form action="#">
          <div class="row">
            <i class="fas fa-user"></i>
            <input type="text" placeholder="ID" required>
          </div>
          <div class="row">
            <i class="fas fa-lock"></i>
            <input type="password" placeholder="Password" required>
          </div>
          <br>
          <div class="row button">
            <input type="submit" value="Login">
          </div>
          <div class="signup-link">Not a member? <a href="CustomerRegistor.jsp">Signup now</a></div>
        </form>
      </div>
    </div>
    </body>
</html>
