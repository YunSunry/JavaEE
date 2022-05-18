<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		var user = {
			"uId" : 1,
			"name" : "lisi"			
		};
		$.ajax({
			url : "hello3/json",
			data : JSON.stringify(user),
			type : "POST",
			contentType : "application/json;charset=UTF-8",
			dataType : "json",
			success : function(data) {				
				console.log(data);
				console.log(data.status)
			}
		})
	});
</script>
</head>
<body>
	<h3>在浏览器控制台查看返回结果</h3>
</body>
</html>