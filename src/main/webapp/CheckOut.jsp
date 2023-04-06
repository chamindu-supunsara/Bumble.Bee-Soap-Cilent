<%-- 
    Document   : CheckOut
    Created on : Apr 6, 2023, 2:54:06 PM
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
    <h2>CHECKOUT</h2>
    <form action="Checkout_Servelet" method="post">
      <div class="input-box">
          <span>Items :</span>
          <input type="text" name="item" id="item" placeholder="" readonly="true" required>
      </div>
        <br>
      <div class="input-box">
          <span>Sizes :</span>
        <input type="text" name="size" placeholder="Enter your Size" required>
      </div>
        <br>
      <div class="input-box">
          <span>Quantity :</span>
          <input type="text" name="quantity" id="quantity" placeholder="" readonly="true" required>
      </div>
        <br>
      <div class="input-box">
          <span>Price :</span>
          <input type="text" name="price" id="price" placeholder="" readonly="true" required>
      </div>
        <br>
      <div class="input-box button">
        <input type="Submit" value="PAY NOW">
      </div>
    </form>
  </div>
  </body>
  <script>
    console.log(localStorage.getItem("totalCost"));
    console.log(localStorage.getItem("cartNumbers"));
    console.log(localStorage.getItem("productsInCart"));
    document.getElementById("price").value = localStorage.getItem("totalCost");
    document.getElementById("quantity").value = localStorage.getItem("cartNumbers");
    document.getElementById("item").value = localStorage.getItem("productsInCart");
 </script>
</html>