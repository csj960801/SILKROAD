<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:if test="${confirmYN}">
	<title>관리자 승인</title>
</c:if>
<c:choose>
	<c:when test="${!confirmYN}">
		<title>관리자 승인 거부</title>
	</c:when>
</c:choose>
</head>
<body>

</body>
</html>