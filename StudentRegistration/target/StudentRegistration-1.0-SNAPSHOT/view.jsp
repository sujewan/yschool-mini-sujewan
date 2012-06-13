<%-- 
    Document   : view
    Created on : May 3, 2012, 10:31:48 AM
    Author     : sujewan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student Details</title>
</head>
<body>
    <jsp:useBean class="org.yit.yschool.studentregistration.StudentDetails" id="modelBean" scope="session"></jsp:useBean>
    <div align="center">
        <h1>Student Details</h1>
        <h3>Hai <jsp:getProperty name="modelBean" property="studentName"></jsp:getProperty>, You are successfully registered. Check your details.</h3>
    </div>
    <table width="290" border="0" align="center">
        <tr>
            <td>
                <b>Student Name</b>
            </td>
            <td>
                : <jsp:getProperty name="modelBean" property="studentName"></jsp:getProperty>
            </td>
        </tr>
        <tr>
            <td>
                <b>Address</b>
            </td>
            <td>
                : <jsp:getProperty name="modelBean" property="address"></jsp:getProperty>
            </td>
        </tr>
        <tr>
            <td>
                <b>Grade</b>
            </td>
            <td>
                : <jsp:getProperty name="modelBean" property="grade"></jsp:getProperty>
            </td>
        </tr>
        <tr>
            <td>
                <b>Parent Name</b> 
            </td>
            <td>
                : <jsp:getProperty name="modelBean" property="parentName"></jsp:getProperty>
            </td>
        </tr> 
        <tr>
            <td>
                
            </td>
        </tr>
    </table>
    
    <div align="center">
        <a href="index.jsp">Go to Register Page</a>
    </div>
            
</body>
</html>
