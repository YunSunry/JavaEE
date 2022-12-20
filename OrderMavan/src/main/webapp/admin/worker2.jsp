<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<title>员工基本信息</title>
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
		<h3 class="box-title">员工基本信息</h3>
	</div>
	<div class="box-body">

		<div class="pull-left">
			<div class="form-group form-inline">
				<div class="btn-group">
					<button type="button" class="btn btn-default" title="新建"
						data-toggle="modal" data-target="#addOrEditModal"
						onclick="resetWorkerFrom()">新增</button>
				</div>
			</div>
		</div>

		<!--工具栏 数据搜索 -->
		<div class="box-tools pull-right">
			<div class="has-feedback">
				 <form action="${pageContext.request.contextPath}/worker/search" method="post">
               	员工姓名：<input name="workerName" value="${search.workerName}">&nbsp&nbsp&nbsp&nbsp
                员工年龄：<input name="workerAge" value="${search.workerAge}">&nbsp&nbsp&nbsp&nbsp
                员工性别：<input name="wokerSex" value="${search.wokerSex}">&nbsp&nbsp&nbsp&nbsp
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
						<th class="sorting">员工编号</th>
						<th class="sorting_asc">员工姓名</th>
						<th class="sorting">员工年龄</th>
						<th class="sorting">员工性别</th>
						<th class="text-center">员工工资</th>
						<th class="text-center">操作</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pageResult.datas}" var="worker">
						<tr>
							<td>${worker.workerId}</td>
							<td>${worker.workerName}</td>
							<td>${worker.workerAge}</td>
							<td>${worker.wokerSex}</td>
							<td>${worker.workerWage}</td>
							<td class="text-center">
								<button type="button" class="btn bg-olive btn-xs"
									data-toggle="modal" data-target="#addOrEditModal"
									onclick="findworkerById(${worker.workerId},'editworker')" >编辑</button>
								<button type="button" class="btn btn-xs btn-danger"
									data-toggle="modal"
									onclick="deleteworkerById(${worker.workerId})">删除</button>
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
					<h3 id="myModalLabel">员工信息</h3>
				</div>
				<div class="modal-body">
					<form id="addOrEditWorker">
						<span><input type="hidden" id="workerid" name="workerId"></span>
						<table id="addOrEditTab"
							class="table table-bordered table-striped" width="800px">
							<%--图书的id,不展示在页面--%>
							<tr>
								<td>姓名</td>
								<td><input class="form-control" placeholder="姓名"
									name="workerName" id="workername"></td>
							</tr>
							<tr>
								<td>年龄</td>
								<td><input class="form-control" placeholder="年龄"
									name="workerAge" id="workerage"></td>
							</tr>
							<tr>
								<td>性别</td>
								<td><input class="form-control" placeholder="性别"
									name="wokerSex" id="workersex"></td>
							</tr>
							<tr>
								<td>工资</td>
								<td><input class="form-control" placeholder="工资"
									name="workerWage" id="workerwage"></td>
							</tr>

						</table>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-success" data-dismiss="modal"
						aria-hidden="true" id="aoe" onclick="saveWorker()">保存</button>
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
    workerVo.workerName = "${search.workerName}"
    workerVo.workerAge = "${search.workerAge}"
    workerVo.wokerSex = "${search.wokerSex}"
    /*分页效果*/
    pagination(pageargs);
</script>

</body>


</html>