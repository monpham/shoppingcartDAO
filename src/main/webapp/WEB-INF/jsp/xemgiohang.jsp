<%@page import="java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <jsp:include page="header.jsp"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div id="header-chitiet" class="container-fluid">
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

                    <li><a href="/dashboard"> ADMIN </a></li>


                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <c:choose>
                        <c:when test="${chucaidau != null }">
                            <li><a class="circle-avartar" href="dangnhap/"><span>${chucaidau }</span></a></li>
                        </c:when>

                        <c:otherwise>
                            <li><a href="dangnhap/">${email}
                                <c:if test="${email == null }">
                                    ĐĂNG NHẬP
                                </c:if></a></li>
                        </c:otherwise>
                    </c:choose>

                    <li id="giohang"><a href="#" ><img src='<c:url value="/resource/Image/ic_shopping_cart_white_24dp_1x.png"/>'>
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
</div>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-sm-12">
            <h3>Danh sách sản phẩm trong giỏ hàng</h3>
            <table class="table">
                <thead>
                <tr>
                    <td><h5>Tên sản phầm</h5></td>
                    <td><h5>Màu sản phẩm</h5> </td>
                    <td><h5>Size</h5></td>
                    <td><h5>Số lượng</h5> </td>
                    <td><h5>Giá tiền</h5>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="value" items="${giohangs }">
                    <tr data-machitiet="${value.getMachitiet() }">
                        <td class="tensp" data-masp=" ${value.getMasp() }"> ${value.getTensp() }</td>
                        <td class="mau" data-mamau="${value.getMamau() }">${value.getTenmau() }</td>
                        <td class="size"  data-masize="${value.getMasize() }">${value.getTensize() }</td>
                        <td class="soluong"><input class="soluong-giohang" min="1" type="number" value="${value.getSoluong() }" /></td>
                        <td class="giatien" data-value="${value.getGiatien() }">${value.getGiatien() }</td>
                        <td class="xoa-giohang btn btn-danger">Xóa</td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
            <h4>Tổng tiền : <span id="tongtien" style="color:red">1,500,000 VNĐ</span></h4>
        </div>

        <div class="col-md-6 col-sm-12">

            </div>
        </div>
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
            <span>43 Nguyễn trãi , phường 12, quận 5  TP. Hồ Chí Minh</span>
            <span>checongbinh@gmail.com</span>
            <span>0909489834</span>
        </div>

        <div class="col-sm-4 col-md-4 wow tada">
            <p><span class="title-footer">GÓP Ý</span></p>
            <form action="" method="post">
                <input name="tenNhanVien" class="material-textinput" style="margin-bottom: 8px" type="text" placeholder="Email"/>
                <textarea name="tuoi" style="margin-bottom: 8px" rows="4" cols="50" placeholder="Nội dung"></textarea>
                <button class="material-primary-button">ĐỒNG Ý</button>
            </form>

        </div>
    </div>

</div>

<jsp:include page="footer.jsp"/>
</body>


</html>