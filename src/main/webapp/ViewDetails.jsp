<%-- 
    Document   : ViewDetails
    Created on : Mar 24, 2023, 9:40:42 AM
    Author     : A V I A N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Details</title>
         <link rel="stylesheet" href="ViewDetailsST.css"> 
    </head>
    <body>
    <section class="search" id="section--3">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
                 
            <form class="formbooking" action="Admin_ViewOrder_Servelt" method="post">
                    <div class="searchHead">
                    <h3>VIEW DETAILS</h3>
                    </div>
                    <div>
                        <input type="text" placeholder="SEARCH"  class="srchinput" name="id" value="${db.id}" required> 
                    </div>
                    <div class="btn">
                    <button type="submit" class="searchbtn"> Search</button>
                    </div>
                       
    <div class="table-wrapper">
    <table class="fl-table" action="Admin_ViewOrder_Servelt">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>ADDRESS</th>
            <th>PRICE</th>
            <th>LOAN</th>
            <th>BIRTHDAY</th>
            <th>PLAN</th>
          
        </tr>
        </thead>
        <tbody>
        <tr>
            <td name="id">${db.id}</td>
            <td name="name">${db.name}</td>
            <td name="address">${db.address}</td>
            <td name="price">${db.price}</td>
            <td name="loan">${db.loan}</td>
            <td name="birthday">${db.birthday}</td>
            <td name="plan">${db.plan}</td>
        </tr>  
        <tr>
            <td name="id">${db.id}</td>
            <td name="name">${db.name}</td>
            <td name="address">${db.address}</td>
            <td name="price">${db.price}</td>
            <td name="loan">${db.loan}</td>
            <td name="birthday">${db.birthday}</td>
            <td name="plan">${db.plan}</td>
           
        </tr> 
    </table>
    </div>                   
    </form>  
    </section>
    </body>
</html>
