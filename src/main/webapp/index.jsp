<%-- 
    Document   : index
    Created on : Feb 11, 2023, 4:06:56 PM
    Author     : A V I A N
--%>

<%@page import="com.mycompany.client.StudentService"%>
<%@page import="com.mycompany.client.StudentService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
            StudentService_Service service = new StudentService_Service();
            StudentService proxy = service.getStudentServicePort();
            out.println(proxy.hello("Well Done"));
            %>
        </h1>
    </body>
</html>
