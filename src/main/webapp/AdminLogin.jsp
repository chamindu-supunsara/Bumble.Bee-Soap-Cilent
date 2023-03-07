<%-- 
    Document   : AdminLogin
    Created on : Feb 6, 2023, 12:06:31 PM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Stylesheet" href="AdminLoginST.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
        <title>Admin Logging</title>
    </head>
    <body>
    <div class="container">
      <div class="wrapper">
        <div class="title"><span>Admin Login</span></div>
        <form action="Admin_login_Servelet" method="post">
          <div class="row">
            <i class="fas fa-user"></i>
            <input type="text" placeholder="Username" name="id" required>
          </div>
          <div class="row">
            <i class="fas fa-lock"></i>
            <input type="password" placeholder="Password" name="password" required>
          </div>
          <br>
          <div class="row button">
            <input type="submit" value="Login">
          </div>
        </form>
      </div>
    </div>
    </body>
</html>
