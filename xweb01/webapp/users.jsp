<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
<link rel="stylesheet" type="text/css" media="screen"
	href="css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<div class="row" style="margin-top: 40px">
			<div class="col-md-8 col-md-offset-2 ">
			<div>
			<a href="add.jsp">新增</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="search.jsp">搜索</a>
			</div>
				<div class="panel panel-primary">
					<div class="panel-heading">用户列表</div>

					<table class="table table-bordered table-hover text-center">
						<thead>
							<tr class="info">
								<td>用户名称</td>
								<td>用户密码</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="u" items="${userList}">
								<tr>
									<td>${u.userName }</td>
									<td>${u.password }</td>
									<td><a href="update?id=${u.id}">修改</a>
									<a href="delete?id=${u.id}">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

				</div>
			</div>

		</div>

	</div>
</body>
</html>