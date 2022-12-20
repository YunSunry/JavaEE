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
		<h3 class="box-title">合作品牌商</h3>
	</div>
	<div class="box-body">

		<div class="pull-left">
			<div class="form-group form-inline">
				<div class="btn-group">
					<button type="button" class="btn btn-default" title="新建"
						data-toggle="modal" data-target="#addOrEditModal"
						onclick="resetFrombrand()">新增</button>
				</div>
			</div>
		</div>

		<!--工具栏 数据搜索 -->
		<div class="box-tools pull-right">
			<div class="has-feedback">
				<form action="${pageContext.request.contextPath}/brand/search"
					method="post">
					品牌名：<input name="brandName" value="${search.brandName}">&nbsp&nbsp&nbsp&nbsp
					联系电话：<input name="brandPhone" value="${search.brandPhone}">&nbsp&nbsp&nbsp&nbsp
					品牌类型：<input name="brandDes" value="${search.brandDes}">&nbsp&nbsp&nbsp&nbsp
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
						<th class="sorting_asc">品牌名称</th>
						<th class="sorting">联系电话</th>
						<th class="sorting">品牌类型</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pageResult.datas}" var="brand">
						<tr>
							<td>${brand.brandName}</td>
							<td>${brand.brandPhone}</td>
							<td>${brand.brandDes}</td>
						
							<td class="text-center">
								<button type="button" class="btn bg-olive btn-xs"
									data-toggle="modal" data-target="#addOrEditModal"
									onclick="findByBrId(${brand.brandId},'edit')">编辑</button>
								<button type="button" class="btn btn-xs btn-danger"
									data-toggle="modal"
									onclick="deleteBrandById(${brand.brandId})">删除</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!--数据表格/-->
			<%--分页插件--%>
			<div id="pagination" class="pagination"></div>
		</div>
	</div>


	<!-- 添加和编辑图书的模态窗口 -->
	<div class="modal fade" id="addOrEditModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h3 id="myModalLabel">品牌信息</h3>
				</div>
				<div class="modal-body">
					<form id="addOrEditbrand">
						<span><input type="hidden" id="ebid" name="brandId"></span>
						<table id="addOrEditTab"
							class="table table-bordered table-striped" width="800px">
							<%--图书的id,不展示在页面--%>
							<tr>
								<td>品牌名</td>
								<td><input class="form-control" placeholder="品牌名"
									name="brandName" id="ebbrandName"></td>
							</tr>
							<tr>
								<td>联系电话</td>
								<td><input class="form-control" placeholder="联系电话"
									name="brandPhone" id="ebbrandPhone"></td>
							</tr>
							<tr>
								<td>品牌类型</td>
								<td><input class="form-control" placeholder="品牌类型"
									name="brandDes" id="ebbrandDes"></td>
							</tr>

						</table>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-success" data-dismiss="modal"
						aria-hidden="true" id="aoe" onclick="addOrEditbrand()">保存</button>
					<button class="btn btn-default" data-dismiss="modal"
						aria-hidden="true">关闭</button>
				</div>
			</div>
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
    brandVO.brandName = "${search.brandName}"
    brandVO.brandPhone = "${search.brandPhone}"
    brandVO.brandDes = "${search.brandDes}"
    
   
    /*分页效果*/
    pagination(pageargs);
</script>


</body>


</html>