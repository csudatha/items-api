<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello Chandra, welcome to Spring BOOT web app</h2>
<!-- <h4>itemID ${itemID}</h4>  -->
<h4>Item Object details ${itemObj}</h4>
<br/>
<br/>
<form action="/getItem" method="get">
<label>Item ID</label>
<input type="text" name="itemID" id="itemID"/>
<br/>
<input type="submit" value="Submit">
<br/>
<INPUT type="reset">
</form>
</body>
</html>