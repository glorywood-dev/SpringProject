<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List</title>
</head>
<body>
	<h1>Board List View</h1>
	<table border="1">
		<tr>
			<th>User Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${boardLists}" var="boardList">
			<tr>
				<td>${boardList.id}</td>
				<td>${boardList.fName}</td>
				<td>${boardList.lName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>