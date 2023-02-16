<%-- 
    Document   : Order
    Created on : Feb 8, 2023, 8:40:59 PM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="OrderST.css">
</head>
<body>

<div class="container">
    <form action="#">
        <div class="row">
            <div class="col">

                <h3 class="title">Customer Details</h3>

                <div class="inputBox">
                    <span>ID :</span>
                    <input type="text" placeholder="200017503598" required>
                </div>
                <div class="inputBox">
                    <span>Full Name :</span>
                    <input type="email" placeholder="chamindu supunsara" required>
                </div>
                <div class="inputBox">
                    <span>address :</span>
                    <input type="text" placeholder="no - street - city" required>
                </div>
                <div class="inputBox">
                    <span>Phone Number :</span>
                    <input type="text" placeholder="077 2038566" required>
                </div>
             
            </div>

            <div class="col">

                <h3 class="title">Loan Option</h3>

                <div class="inputBox">
                    <span>Rules :</span>
                    <img src="Photos/card_img1.png" alt="">
                </div>
                <div class="inputBox">
                    <span>Loan Balance :</span>
                    <input type="text" placeholder="Up to 15 000">
                </div>
                <div class="inputBox">
                    <span>Birthday :</span>
                    <input type="text" placeholder="2000/06/23">
                </div>
                <div class="inputBox">
                    <span>Installment Plan :</span>
                    <input type="text" placeholder="Up to 3 Months">
                </div>
               
            </div>
    
        </div>

        <input type="submit" value="proceed to checkout" class="submit-btn">

    </form>
</div>    
    
</body>
</html>