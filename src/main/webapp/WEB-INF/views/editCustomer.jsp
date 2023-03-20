<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Customer</title>
</head>
<body>

	<div align="center">
		
		<h3>Edit Customer</h3>
		
		<form:form action="save" method="post" modelAttribute="customer">
			<table>
				<tr>
					<td>ID: </td>
					<td>
						${customer.id}
						<form:hidden path="id" />
					</td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:input path="name"></form:input></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email"></form:input></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><form:input path="address"></form:input></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Update"/>
					</td>
				</tr>
			</table>
		</form:form>
		
	</div>

</body>
</html>