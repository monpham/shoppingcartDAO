<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="<c:out value="/resource/Styles/styles.css"/>"/>

<!DOCTYPE HTML>
<html>
<head>
<title>Pooled Admin Panel Category Flat Bootstrap Responsive Web Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Bootstrap Core CSS -->
<link rel="stylesheet"  href='<c:url value="/resource/bootstrap-4.0.0-beta-dist/css/bootstrap.min.css"/>'/>
<!-- Custom CSS -->
<link rel="stylesheet"  href='<c:url value="/resource/css/style.css"/>'/>
<link rel="stylesheet"  href='<c:url value="/resource/css/morris.css"/>'/>
<%-- <link rel="stylesheet"  href='<c:url value="/resources/Styles/styles.css"/>'/> --%>
<!-- Graph CSS -->
<link rel="stylesheet"  href='<c:url value="/resource/css/font-awesome.css"/>'/>
<!-- jQuery -->
<script src='<c:url value="/resource/JS/jquery-3.2.1.min.js"/>'></script>
<!-- //jQuery -->
<link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'/>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet"  href='<c:url value="/resource/css/icon-font.min.css"/>'/>

<!-- //lined-icons -->
</head> 
<body>
   <div class="page-container">
   <!--/content-inner-->
<div class="left-content">
	<div class="row">
		<h3>Sản phẩm </h3>
		<form modelAttribute="sanpham" action="/themSanpham" method="post">
			<c:if test="${type.equals('update')}">
				<tr>
					<td>ID:</td>
					<td>
						<form:input path="masanpham" readonly="true"/>
					</td>
				</tr>
			</c:if>
		<div class="col-md-5 col-sm-12 form-group">
			<label for="masanpham">Ma san pham </label></br>
			<input type="text" name="masanpham" id="masanpham" class="form-control" placeholder="Nhap vao ten san pham"/></br>

			<label for="tensanpham">Tên sản phẩm </label></br>
			<input type="text" name="tensanpham" id="tensanpham" class="form-control" placeholder="Nhap vao ten san pham"/></br>

			<label for="giatien">Giá tiền  </label></br>
			<input type="text" id="giatien" name="giatien" class="form-control" placeholder="Nhap vao gia tien"/></br>

            <label for="mota">Mô tả </label></br>
			<textarea rows="5" type="text" name="mota" id="mota" class="form-control" placeholder="Nhao vao mo ta" ></textarea></br>

			<label for="hinhsanpham">Hình ảnh  </label></br>
			<input type="file" id="hinhsanpham" name="hinhsanpham" class="form-control" placeholder="Nhap vao gia tien"/></br>

		    <p>
				<input type="submit">
		    </p>
			</form>
		</div>
		
		<div class="col-md-7 col-sm-12">
			
			<div style="float:right">
				
			</div>

			<ul class="pagination pagination-sm">
				<c:forEach var = "i" begin = "1" end = "${tongsopage }">
				
					 <c:choose>
	         
				         <c:when test = "${i == 1 }">
				           <li class="paging-item active"><a href="#">${i}</a></li>
				         </c:when>
				         
				         <c:otherwise>
				             <li class="paging-item"><a href="#">${i}</a></li>
				         </c:otherwise>
				      </c:choose>
					
		     	 </c:forEach>
			</ul>
		</div>
		
	</div>
 </div>
  <!--//content-inner-->
			<!--/sidebar-menu-->
   <div class="sidebar-menu">
	   <header class="logo1">
		   <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a>
	   </header>
	   <div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
	   <div class="menu">
		   <ul id="menu" >
			   <li><a href="/Dashboardhome"><i class="fa fa-tachometer"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>

			   <li id="menu-academico" ><a href="/inbox"><i class="fa fa-envelope nav_icon"></i><span>Inbox</span><div class="clearfix"></div></a></li>
			   <li id="menu-academico" ><a href='<c:url value="/tongsanpham"/>'><i class="fa fa-cube nav_icon" aria-hidden="true"></i><span>Sản phẩm</span><div class="clearfix"></div></a></li>
			   <li><a href="/gallery"><i class="fa fa-picture-o" aria-hidden="true"></i><span>Gallery</span><div class="clearfix"></div></a></li>
			   <li id="menu-academico" ><a href="/charts"><i class="fa fa-bar-chart"></i><span>Charts</span><div class="clearfix"></div></a></li>

			   <li id="menu-academico" ><a href="/errorpage"><i class="fa fa-exclamation-triangle" aria-hidden="true"></i><span>Error Page</span><div class="clearfix"></div></a></li>

			   <li><a href="/tables"><i class="fa fa-table"></i>  <span>Tables</span><div class="clearfix"></div></a></li>
			   <li><a href="/maps"><i class="fa fa-map-marker" aria-hidden="true"></i>  <span>Maps</span><div class="clearfix"></div></a></li>

			   <li id="menu-academico" ><a href="#"><i class="fa fa-file-text-o"></i>  <span>Pages</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
				   <ul id="menu-academico-sub" >
					   <li id="menu-academico-boletim" ><a href="/calendar">Calendar</a></li>
					   <li id="menu-academico-avaliacoes" ><a href="/account">Account</a></li>
					   <li id="menu-academico-avaliacoes" ><a href="/chitiethoadon">ChitietHoadon</a></li>
				   </ul>
		   </ul>
	   </div>
   </div>
							  <div class="clearfix"></div>		
							</div>
							<script>
							var toggle = true;
										
							$(".sidebar-icon").click(function() {                
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }
											
											toggle = !toggle;
										});
							</script>
<!--js -->
<script src='<c:url value="/resource/JS/jquery.nicescroll.js"/>'></script>
<script src='<c:url value="/resource/JS/scripts.js"/>'></script>
<script src='<c:url value="/resource/JS/custom.js"/>'></script>
<!-- Bootstrap Core JavaScript -->
<script src='<c:url value="/resource/JS/bootstrap.min.js"/>'></script>
   <!-- /Bootstrap Core JavaScript -->	   
<!-- morris JavaScript -->	
<script src='<c:url value="/resource/JS/raphael-min.js"/>'></script>
<script src='<c:url value="/resource/JS/morris.js"/>'></script>

<script>
	$(document).ready(function() {
		//BOX BUTTON SHOW AND CLOSE
	   jQuery('.small-graph-box').hover(function() {
		  jQuery(this).find('.box-button').fadeIn('fast');
	   }, function() {
		  jQuery(this).find('.box-button').fadeOut('fast');
	   });
	   jQuery('.small-graph-box .box-close').click(function() {
		  jQuery(this).closest('.small-graph-box').fadeOut(200);
		  return false;
	   });
	   
	    //CHARTS
	    function gd(year, day, month) {
			return new Date(year, month - 1, day).getTime();
		}
		
		graphArea2 = Morris.Area({
			element: 'hero-area',
			padding: 10,
        behaveLikeLine: true,
        gridEnabled: false,
        gridLineColor: '#dddddd',
        axes: true,
        resize: true,
        smooth:true,
        pointSize: 0,
        lineWidth: 0,
        fillOpacity:0.85,
			data: [
				{period: '2014 Q1', iphone: 2668, ipad: null, itouch: 2649},
				{period: '2014 Q2', iphone: 15780, ipad: 13799, itouch: 12051},
				{period: '2014 Q3', iphone: 12920, ipad: 10975, itouch: 9910},
				{period: '2014 Q4', iphone: 8770, ipad: 6600, itouch: 6695},
				{period: '2015 Q1', iphone: 10820, ipad: 10924, itouch: 12300},
				{period: '2015 Q2', iphone: 9680, ipad: 9010, itouch: 7891},
				{period: '2015 Q3', iphone: 4830, ipad: 3805, itouch: 1598},
				{period: '2015 Q4', iphone: 15083, ipad: 8977, itouch: 5185},
				{period: '2016 Q1', iphone: 10697, ipad: 4470, itouch: 2038},
				{period: '2016 Q2', iphone: 8442, ipad: 5723, itouch: 1801}
			],
			lineColors:['#ff4a43','#a2d200','#22beef'],
			xkey: 'period',
            redraw: true,
            ykeys: ['iphone', 'ipad', 'itouch'],
            labels: ['All Visitors', 'Returning Visitors', 'Unique Visitors'],
			pointSize: 2,
			hideHover: 'auto',
			resize: true
		});
		
	   
	});
	</script>
</body>
</html>