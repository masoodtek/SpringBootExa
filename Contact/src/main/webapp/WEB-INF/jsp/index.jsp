<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@page import="com.mas.controller.ContectController"%>  
<jsp:useBean id="obj" class="com.mas.entity.CustomerEntity"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  

</head>
<body>
<h1>Contact info login</h1>
<body>  
<div>
<form action="/add">  
Customer_Id: <input type="text" name="customer_id"><br/> 
customer_Name:<input type="text" name="customer_Name"><br/> 
customer_Email: <input type="text" name="customer_Email"><br/> 
mobile: <input type="text" name="mobile"><br/> 
<input type="submit" value="save">  
 </form>  
 </div>
 <a href="view.jsp">View Users</a> 
</body>
</html>