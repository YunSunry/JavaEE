<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<span>jsp页面</span>
${requestScope.userkey}
${requestScope.userkey.getName()}
${requestScope.userkey.name}
</body>
</html>