<%-- 
    Document   : Home
    Created on : Jan 31, 2023, 9:28:22 AM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Stylesheet" href="HomeST.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Home</title>
    </head>
    <body>
        
        <div class="container">
            <div class="navbar">
                <img src="Photos/logo.png" class="logo">
                <nav>
                    <ul>
                        <li><a href="Home.jsp">Home</a></li>
                        <li><a href="CustomerLogin.jsp">All Category ▾</a>
                            <ul class="dropdown">
                                <li><a href="CustomerLogin.jsp">Fashion</a></li>
                                <li><a href="CustomerLogin.jsp">Electronic</a></li>
                                <li><a href="CustomerLogin.jsp">Jewellery</a></li>
                            </ul>
                        </li>
                        <li><a href="#">Contact Us</a></li>
                        <li><a href="#">About</a></li>
                        <li><button type="button" id="btn1"><a href="CustomerLogin.jsp">Shop Now</a></button></li>
                    </ul>
                </nav>
            </div>
        </div>  
        <!-- Navigation Bar -->
        
        <div class="container1">
            <div class="wrapper">
                <img src="Photos/1.png">
                <img src="Photos/2.png">
                <img src="Photos/3.png">
                <img src="Photos/4.png">
            </div>
        </div>
        <!-- Slide Words -->
        
        <div class="card">
        <div class="image">
                <img src="Photos/black.png" alt="items">
                <h3>Black T-Shirt</h3>
                <h3>$8.00</h3>
                <a class="add-carts cart1" href="CustomerLogin.jsp">SHOP NOW</a>
            </div>
            <div class="image">
                <img src="Photos/jhumka.png" alt="items">
                <h3>Jhumka</h3>
                <h3>$10.00</h3>
                <a class="add-carts cart2" href="CustomerLogin.jsp">SHOP NOW</a>
            </div>
            <div class="image">
                <img src="Photos/cream.png" alt="items">
                <h3>Cream T-Shirt</h3>
                <h3>$6.00</h3>
                <a class="add-carts cart3" href="CustomerLogin.jsp">SHOP NOW</a>
            </div>
            <div class="image">
                <img src="Photos/headset.png" alt="items">
                <h3>Dark Green T-Shirt</h3>
                <h3>$60.00</h3>
                <a class="add-carts cart4" href="CustomerLogin.jsp">SHOP NOW</a>
            </div>
        </div>
         
        <footer class="footer">
            <div class="foo">
            <div class="row1">
                <div class="footer-col">
                    <h4>BRANCHES</h4>
                    <ul>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Our Services</a></li>
                        <li><a href="#">Gallary</a></li>
                    </ul>
                </div>
                <div class="footer-col">
                    <h4>GET HELP</h4>
                    <ul>
                        <li><a href="#">FAQ</a></li>
                        <li><a href="#">Contact Us</a></li>
                        <li><a href="#">Payment Plan</a></li>
                    </ul>
                </div>
                <div class="footer-col">
                    <h4>FOLLOW US</h4>
                    <ul>
                        <li><a href="#">Facebook</a></li>
                        <li><a href="#">Instagram</a></li>
                    </ul>
                </div>
                <div class="footer-col">
                    <h4>ADMIN</h4>
                    <ul>
                        <li><a href="AdminLogin.jsp">Admin Login</a></li>
                    </ul>
                </div>
            </div>
            </div>
        </footer>
    </body>
</html>
