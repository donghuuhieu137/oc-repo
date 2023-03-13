<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <title>Document</title>
</head>

<body>
	<!-- wrapper -->
	<div class="wrapper">
		<!-- main-body -->
		<div class="login-main-body">
			<div class="col-sm-6 col-md-6 login-title">
				<span>Cập nhật thông tin</span>
			</div>
			<div class="col-sm-6 col-md-6 login-input">
				<form:form action="${pageContext.request.contextPath}/regist" method="post" modelAttribute="user">
					<form:hidden path="id"/>
					<form:input type="text" path="userName" name="userName" placeholder="userName"/>
					<br><br><br>
					<form:input type="text" path="email" name="email" placeholder="Email"/>
					<br><br><br>
					<form:input type="password" path="password" name="password" placeholder="Mật khẩu"/>
					<br><br><br>
					<form:input type="text" path="address" name="address" placeholder="Địa chỉ"/>
					<br><br><br>
					<div class="login-submit">
						<button type="submit">Đăng kí</button>
						<div class="get-password-cancel"><a href="/homepage-personal">Huỷ</a></div>
					</div>
				</form:form>
				<br>
			</div>
		</div>
		<!-- main-body -->
	</div>
</body>

</html>