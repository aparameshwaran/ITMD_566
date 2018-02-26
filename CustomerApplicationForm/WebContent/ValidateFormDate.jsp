<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Validation</title>
</head>
<body>
<jsp:useBean id="vb" class="customerservlet.GetData" />
 
  <jsp:setProperty name="vb" property="emailAddress" />
  <jsp:setProperty name="vb" property="zipcode" />
 
  
 
  <br>
  <% if(!vb.validateEmail()){
  	out.println("Email Address in invalid or less than 7 charachters");
  }
	%> 
  <br>
  
  <%if(!vb.validateZip()){
	out.println("Zip code is invalid");  
  }
  %>
  <br>
</body>
</html>