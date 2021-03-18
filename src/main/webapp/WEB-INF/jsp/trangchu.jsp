<%@page import="java.util.List"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="<c:out value="/resource/Styles/styles.css"/>"/>
<link rel='stylesheet prefetch' href='https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css'>
<link href="/resource/css/star.css" rel="stylesheet">
<html>
<head>
<jsp:include page="header.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div id="header" class="container-fluid">
		<nav class="navbar navbar-default none_nav">
		  <div class="container-fluid">
		    <!-- Brand and toggle get grouped for better mobile display -->
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#"><img src='<c:url value="/resource/Image/icon_yame_shop.png"/>'></a>
		    </div>
		
		    <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav navbar-center">
		        <li class="active"><a href="/trangchu">TRANG CHỦ</a></li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Sản phẩm <span class="caret"></span></a>
		          <ul class="dropdown-menu">
					  <c:forEach var="value" items="${danhmuc}">
						<li><a href='<c:url value="/sanpham/${value.madanhmuc}/${value.tendanhmuc}"/>'>${value.tendanhmuc }</a></li>
						<li role="separator" class="divider"></li>
					</c:forEach>
		            
		          </ul>
		        </li>
		        <li><a href="/blog">Blog</a></li>
		        <li><a href="https://www.facebook.com/monzroom13">LIÊN HỆ</a></li>
		        
		      </ul>
		      
		      <ul class="nav navbar-nav navbar-right">
		      	<c:choose>
		      		<c:when test="${chucaidau != null }">
		      			 <li><a class="circle-avartar" href="dangnhap/"><span>${chucaidau }</span></a></li>
		      		</c:when>
		      		
		      		<c:otherwise>
		      			 <li><a href="/dangnhap">${email}
							 <c:if test="${email == null }">
								 ĐĂNG NHẬP
							 </c:if>
						     </a>
						 </li>
		      		</c:otherwise>
		      	</c:choose>


				  <li id="giohang"><a href="/giohang" ><img src='<c:url value="/resource/Image/ic_shopping_cart_white_24dp_1x.png"/>'>
					  <c:if test="${soluongsanphamgiohang > 0 }">
						  <div class="circle-giohang"><span>${soluongsanphamgiohang }</span></div>
					  </c:if>

					  <c:if test="${soluongsanphamgiohang <= 0 || soluongsanphamgiohang == null  }">
						  <div><span>${soluongsanphamgiohang }</span></div>
					  </c:if>
				  </a></li>



			  </ul>
		    </div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		
		<div class="event_header container wow rubberBand">
			<span>2021</span><br/>
			<span style="font-size: 50px">Khuyến Mãi 20%</span><br/>

			<button>XEM NGAY</button>
		</div>
	</div>
	<div id="info" class="container">
		<div class="row">
			<div class="col-12 col-sm-4 col-md-4 wow fadeInLeft" data-wow-duration="1s">
				<img class="icon" src='<c:url value="/resource/Image/icon_chatluong.png"/>'/><br/>
				<span style="font-size: 32px; font-weight: 500;">CHẤT LƯỢNG</span><br/>
				<span>Chúng tôi cam kết sẽ mang đến cho các bạn chất lượng sản phẩm tốt nhất</span>
			</div>
			
			<div class="col-12 col-sm-4 col-md-4 wow fadeInDown" data-wow-duration="1s" data-wow-delay="1s">
				<img class="icon" src='<c:url value="/resource/Image/icon_conheo.png"/>'/><br/>
				<span style="font-size: 32px; font-weight: 500;">TIẾT KIỆM CHI PHÍ</span><br/>
				<span>Cam kết giá rẻ nhất Việt Nam giúp các bạn tiết kiệm hơn 20%cho từng sản phẩm</span>
			</div>
			
			<div class="col-12 col-sm-4 col-md-4 wow fadeInUp" data-wow-duration="1s" data-wow-delay="2s">
				<img class="icon" src='<c:url value="/resource/Image/icon_giaohang.png"/>'/><br/>
				<span style="font-size: 32px; font-weight: 500;">GIAO HÀNG</span><br/>
				<span>Cam kết giao hàng tận nơi trong ngày. Để mang sản phẩm đếncho khách hàng nhanh nhất</span>
			</div>
		</div>
		
	</div>
	
	<div id="title-sanpham" class="container">

		<span>SẢN PHẨM HOT
		</span>
		<div class="row" style="margin-top:42px">
		
			<c:forEach var="sanpham" items="${listSanPham}">
				<div class="col-md-3 col-sm-6">
					<a href="/chitiet/${sanpham.masanpham}">
						<div class="sanpham wow zoomIn">
							<img alt="hinh" src='<c:url value="/resource/sanpham/${sanpham.hinhsanpham}"/>' /><br/>
							<span>${sanpham.tensanpham} </span><br/>
							<span class="gia">${sanpham.giatien } VNĐ</span>
						</div>
					</a>

				</div>
			</c:forEach>

			<!-- end san pham --> 
		</div>
		<div class="stars">
			<form action="">
				<input class="star star-5" id="star-5" type="radio" name="star"/>
				<label class="star star-5" for="star-5"></label>
				<input class="star star-4" id="star-4" type="radio" name="star"/>
				<label class="star star-4" for="star-4"></label>
				<input class="star star-3" id="star-3" type="radio" name="star"/>
				<label class="star star-3" for="star-3"></label>
				<input class="star star-2" id="star-2" type="radio" name="star"/>
				<label class="star star-2" for="star-2"></label>
				<input class="star star-1" id="star-1" type="radio" name="star"/>
				<label class="star star-1" for="star-1"></label>
			</form>
		</div>
	</div>
	
	<div id="footer" class="container-fluid">
		<div class="row">
			<div class="col-sm-4 col-md-4 wow tada">
				<p><span class="title-footer">THÔNG TIN SHOP</span></p>
				<span>Yame là một thương hiệu thời trang đầy uy tín, luôn đảm bảo chất lượng sản phẩm tốt nhất cho khách hàng.</span>
			</div>
			
			<div class="col-sm-4 col-md-4 wow tada">
				<p><span class="title-footer">LIÊN HỆ</span></p>
				<span>79/10 WWW iakring Pleiku Gia Lai </span>
				<span>quocphamfwd@gmail.com</span>
				<span>0766638883</span>
			</div>
			
			<div class="col-sm-4 col-md-4 wow tada">
				<p><span class="title-footer">GÓP Ý</span></p>
				<form action="">
					<input name="tenNhanVien" class="material-textinput" style="margin-bottom: 8px" type="text" placeholder="Email"/>
					<textarea name="tuoi" style="margin-bottom: 8px" rows="4" cols="50" placeholder="Nội dung"></textarea>
					<button class="material-primary-button">ĐỒNG Ý</button>
				</form>

			</div>
		</div>
		<div class="map">
			<div class="col-md-6 w3layouts-map">
				<iframe src="https://www.google.com/maps/embed?pb=!1m23!1m12!1m3!1d61345.06068667799!2d108.14568633933153!3d16.062049336592864!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!4m8!3e4!4m5!1s0x3142190362aadce5%3A0xa46045c9451d011!2zMzctOSBMw6ogVGjhu4sgVMOtbmgsIEjDsmEgS2jDqiwgVGhhbmggS2jDqiwgxJDDoCBO4bq1bmcgNTUwMDAwLCBWaeG7h3QgTmFt!3m2!1d16.0619697!2d108.1807061!4m0!5e0!3m2!1svi!2s!4v1609946721773!5m2!1svi!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
			</div>
			<div class="clearfix"> </div>
		</diV>
	</div>

	<jsp:include page="footer.jsp"/>
</body>

</html>