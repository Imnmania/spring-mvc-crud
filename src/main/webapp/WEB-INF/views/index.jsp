<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Manager</title>
</head>
<body>
	<%-- <h1>${message}</h1> --%>
	<div align="center">
		
		<h1>Customer Manager</h1>
		<form method="get" action="search">
			<input type="text" name="keyword" />
			<input type="submit" value="Search" />
		</form>
		
		<h3><a href="newCustomer">New Customer</a></h3>
		
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
			
			<c:forEach items="${customerList}" var="customer">
				<tr>
					<td>${customer.id}</td>
					<td>${customer.name}</td>
					<td>${customer.email}</td>
					<td>${customer.address}</td>
				</tr>
			</c:forEach>
		</table>
	
	</div>
</body>
</html>