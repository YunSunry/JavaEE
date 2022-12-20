<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录窗口</title>
<link rel="stylesheet" type="text/css" media="screen" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row" style="margin-top: 80px">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-primary">
					<div class="panel-heading">修改</div>
					<div class="panel-body">
						<form action="doupdate" method="post"  >
							<div class="form-group">
								<label for="id">ID</label> <input type="text"
									class="form-control" name="id" value="${user.id}" readonly>
							</div>
							<div class="form-group">
								<label for="userName">用户名</label> <input type="text"
									class="form-control" name="username" placeholder="请输入用户名">
							</div>
							<div class="form-group">
								<label for="password">密码</label> <input type="password"
									class="form-control" name="password" placeholder="请输入密码"
									>
							</div>
							<div class="form-inline text-right">
								<button type="submit" class="btn btn-primary">提交</button>
								<button type="reset" class="btn btn-default" focus>重置</button>

							</div>
						</form>
					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>