<%-- 
    Document   : Shop2
    Created on : Feb 8, 2023, 10:46:38 AM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Stylesheet" href="Shop2ST.css">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap" rel="stylesheet">
        <title>Electronic Shop</title>
    </head>
    <body>
        <header>
            <div class="overlay"></div>
            <nav>
                <h2>ELECTRONIC SHOP</h2>
                <ul>
                    <li class="home"><a href="Home.jsp"><ion-icon name="home"></ion-icon>Home</a></li>
                    <li class="shop"><a href="Shop.jsp"><ion-icon name="apps"></ion-icon>SHOP</a></li>
                    <li class="cart"><a href="Cart.jsp"><ion-icon name="cart"></ion-icon>CART<span>0</span></a></li>
                </ul>
            </nav>
        </header>
        
        <div class="container">
            <div class="image">
                <a class="add-cart cart1" href="#"></a>
            </div>
            <div class="image">
                <a class="add-cart cart2" href="#"></a>
            </div>
            <div class="image">
                <a class="add-cart cart3" href="#"></a>
            </div>
            <div class="image">
                <a class="add-cart cart4" href="#"></a>
            </div>
            <div class="image">
                <a class="add-cart cart1" href="#"></a>
            </div>
            <div class="image">
                <a class="add-cart cart2" href="#"></a>
            </div>
            <div class="image">
                <a class="add-cart cart3" href="#"></a>
            </div>
            <div class="image">
                <a class="add-cart cart4" href="#"></a>
            </div>
            <div class="image">
                <img src="Photos/battery.png" alt="tshirt1">
                <h3>Battery</h3>
                <h3>$50.00</h3>
                <a class="add-cart cart1" href="#">Add Cart</a>
                <input type="hidden" value="15" />
            </div>
            <div class="image">
                <img src="Photos/cctv.png" alt="tshirt1">
                <h3>CCTV</h3>
                <h3>$80.00</h3>
                <a class="add-cart cart2" href="#">Add Cart</a>
                <input type="hidden" value="20" />
            </div>
            <div class="image">
                <img src="Photos/clock.png" alt="tshirt1">
                <h3>Clock</h3>
                <h3>$20.00</h3>
                <a class="add-cart cart3" href="#">Add Cart</a>
                <input type="hidden" value="15" />
            </div>
            <div class="image">
                <img src="Photos/headset.png" alt="tshirt1">
                <h3>Headset</h3>
                <h3>$60.00</h3>
                <a class="add-cart cart4" href="#">Add Cart</a>
                <input type="hidden" value="20" />
            </div>
            <div class="image">
                <img src="Photos/powerbank.png" alt="tshirt1">
                <h3>Power Bank</h3>
                <h3>$0.00</h3>
                <a class="add-cart cart" href="#">Out Of Stock</a>
                <input type="hidden" value="15" />
            </div>
            <div class="image">
                <img src="Photos/clock2.png" alt="tshirt1">
                <h3>Clock</h3>
                <h3>$0.00</h3>
                <a class="add-cart cart" href="#">Out Of Stock</a>
                <input type="hidden" value="15" />
            </div>
        </div>
        
        <footer class="footer">
            <div class="foo">
            <div class="row">
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
        
        <script src="main.js"></script> 
        <script src="https://unpkg.com/ionicons@4.5.10-0/dist/ionicons.js"></script>
    </body>
</html>
