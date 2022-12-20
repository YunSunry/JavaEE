<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<title>点餐管理系统</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/AdminLTE.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pagination.css">
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/pagination.js"></script>
<script src="${pageContext.request.contextPath}/js/my.js"></script>
</head>

<body class="hold-transition skin-red sidebar-mini">
	<!-- .box-body -->
	<div class="box-header with-border">
		<h3 class="box-title">点餐管理</h3>
	</div>
	<div class="box-body">

		<div class="pull-left">
			<div class="form-group form-inline">
				<div class="btn-group">
					<button type="button" class="btn btn-default" title="新建"
						data-toggle="modal" data-target="#addOrEditModal"
						onclick="resetFrom()">新增</button>
				</div>
			</div>
		</div>

		<!--工具栏 数据搜索 -->
		<div class="box-tools pull-right">
			<div class="has-feedback">
				<form action="${pageContext.request.contextPath}/comment/search"
					method="post">
					用户名：<input name="commandUsername" value="${search.commandUsername}">&nbsp&nbsp&nbsp&nbsp
					<input class="btn btn-default" type="submit" value="查询">
				</form>
			</div>
		</div>
		<!--工具栏 数据搜索 /-->


		<!-- 数据列表 -->
		<div class="table-box">
			<!-- 数据表格 -->
			<table id="dataList"
				class="table table-bordered table-striped table-hover dataTable text-center">
				<thead>
					<tr>
						<th class="sorting_asc">用户名</th>
						<th class="sorting">用户评价内容</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pageResult.datas}" var="comment">
						<tr>
							<td>${comment.commandUsername}</td>
							<td>${comment.commentContent}</td>
			
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!--数据表格/-->
			<%--分页插件--%>
			<div id="pagination" class="pagination"></div>
		</div>
	</div>


	
	<script>
    /*分页插件展示的总页数*/
    pageargs.total = Math.ceil(${pageResult.total}/pageargs.pagesize);
    /*分页插件当前的页码*/
    pageargs.cur = ${pageNum}
    /*分页插件页码变化时将跳转到的服务器端的路径*/
    pageargs.gourl = "${gourl}"
    /*保存搜索框中的搜索条件，页码变化时携带之前的搜索条件*/
    commentVO.commandUsername = "${search.commandUsername}"
    commentVO.commentContent = "${search.commentContent}"
  
    /*分页效果*/
    pagination(pageargs);
</script>

</body>


</html>