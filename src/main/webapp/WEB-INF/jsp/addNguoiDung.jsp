<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/31/20
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Online Login Form Responsive Widget Template :: w3layouts</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Online Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Meta tag Keywords -->
    <!-- css files -->
    <link rel="stylesheet" href="/login/css/style.css" type="text/css" media="all" /> <!-- Style-CSS -->
    <link rel="stylesheet" href="/login/css/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
    <!-- //css files -->
    <!-- online-fonts -->
    <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">
    <!-- //online-fonts -->
</head>
<body>
<div class="center-container">
    <!--header-->
    <div class="header-w3l">
        <h1> Start User New </h1>
    </div>
    <div class="main-content-agile">
        <div class="sub-main-w3">
            <div class="wthree-pro">
                <h2>Not To Duplicate Content</h2>
            </div>

<form:form modelAttribute="Nguoidung" action="newBook">

        <c:if test="${type.equals('update')}">
            <tr>
                <td>ID:</td>
                <td>
                    <form:input path="manguoidung" readonly="true"/>
                </td>
            </tr>
        </c:if>
        <div class="pom-agile">
                <form:input placeholder="E-mail" path="email" class="user" type="email" required="" />

        </div>
            <div class="pom-agile"></div>
                <form:input  placeholder="ID Host" path="machucvu" class="user" type="text" required=""/>


            <div class="pom-agile"></div>
                <form:input placeholder="Password"  path="matkhau" class="pass" type="password" required=""/>

            <div class="right-w3l">
                <a href="/dashboard" ><img src="/admin/images/add4.png" alt="HTML tutorial" style="width:60px;height:60px;"><Delete</a>
            </div>
            <div class="sub-w3l">

                <div class="right-w3l">
                    <input type="submit" value="Login">
                </div>
            </div>


</form:form>

        </div>
    </div>
</div>
    <!--//main-->
    <!--footer-->
    <div class="footer">
        <p>&copy; 2017 Online Login Form. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
    </div>
    <!--//footer-->
</body>
</html>
