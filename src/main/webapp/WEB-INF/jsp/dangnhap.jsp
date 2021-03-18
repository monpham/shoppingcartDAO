
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="<c:out value="/resource/Styles/styles.css"/>"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"/>
</head>
<body id="body-login">
	<div>
		<form id="ajax" action=${pageContext.request.contextPath}></form>
	</div>
	
	<div id="body-flex-login">
		<div id="container-login">
			<div id="container-login-left">
				<div id="header-top-left" class="header-login">
					<span id="text-logo">Welcome</span><br/>
					<span id="hint-text-logo">Hãy tạo nên phong cách của bạn cùng Minishop ! </span>
				</div>
				
				<div id="header-bottom-left">
					<p><img alt="icon_oval" src='<c:url value="/resource/Image/icon_oval.png" />' /><span>Luôn cập nhật xu hướng thời trang mới nhất </span></p>
					<p><img alt="icon_oval" src='<c:url value="/resource/Image/icon_oval.png" />' /><span>Giảm hơn 50% tất cả các mặt hàng giành cho khách VIP </span></p>
					<p><img alt="icon_oval" src='<c:url value="/resource/Image/icon_oval.png" />' /><span>Tận tình tư vấn để tạo nên phong cách của bạn</span></p>
				</div>
			</div>
			
			<div id="container-login-right">
				<div id="header-top-right" class="header-login">
					<span class="actived" id="dangnhap">Đăng nhập</span> / <span id="dangky">Đăng ký</span>
				</div>
				<!-- khi đăng nhập dữ liệu truyền qua phương thức post chạy đến controller -->
				<div id="container-center-login-right">
					<form action="/trangchu"  method="post">
						<div class="container-login-form" id="container-center-login-right">
							<input id="email" name="email" class="material-textinput input-icon-email" placeholder="Email" type="text" /><br/>
							<input id="matkhau" name="matkhau" class="material-textinput input-icon-password" placeholder="Mật khẩu " type="password" /><br/>
							<input id="btnDangNhap" class="material-primary-button" type="submit" value="ĐĂNG NHẬP" / ><br/>

						</div>
					</form>

						<div class="container-signup-form" id="container-center-login-right">
							<form action="/kiemtradangky" method="post">
								<input id="email" name="email" class="material-textinput input-icon-email" placeholder="Email" type="text" /><br/><p></p>
								<input id="matkhau" name="matkhau" class="material-textinput input-icon-password" placeholder="Mật khẩu " type="password" /><br/><p></p>
								<input id="nhaplaimatkhau" name="nhaplaimatkhau" class="material-textinput input-icon-password" placeholder="Nhập lại mật khẩu " type="password" /><br/>
								<input id="btnDangNhap" class="material-primary-button" type="submit" value="ĐĂNG KÝ" /><br/>
							</form>
							
						</div>
						
						
						<span id="ketqua"></span>
						<span>${kiemtradangky}</span>
				</div>
				
				<div id="container-social-login">
					<img alt="icon_oval" src='<c:url value="/resource/Image/icon_facebook.png" />' />
					<img alt="icon_oval" src='<c:url value="/resource/Image/icon_google.png" />' />
				</div>
				
		
				
			</div>
			
		</div>
	</div>
	
	
</body>

<jsp:include page="footer.jsp"/>
</html>