<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<link href="<%=request.getContextPath() %>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=request.getContextPath() %>/js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="<%=request.getContextPath() %>/css/oyyx.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shoplist Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--Google Fonts-->
<link href='https://fonts.googleapis.com/css?family=Hind:400,500,300,600,700' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=request.getContextPath() %>/js/move-top.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
<script src="<%=request.getContextPath() %>/js/simpleCart.min.js"> </script>
<script src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
</head>
<body>
<!--header strat here-->
<div class="header">
	<div class="container">
		<div class="header-main">
			<div class="top-nav">
				<div class="content white">
	              <nav class="navbar navbar-default" role="navigation">
					    <div class="navbar-header">
					        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						        <span class="sr-only">Toggle navigation</span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
					        </button>
					        <div class="navbar-brand logo">
								<a href="/vipstore/"><img src="<%=request.getContextPath() %>/images/logo1.png" alt=""></a>
							</div>
					    </div>
					    <!--/.navbar-header-->
					 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					        <ul class="nav navbar-nav">
							        <c:url var="index" value="/"></c:url>
							        <c:url var="findType" value="/product/findTypeProduct"></c:url>							     
					        	   <li><a href="${ index}">首页</a></li>
						             <li class="dropdown">
						        	<a href="${ findType}?Type=1">水果</a>
						        </li>
						            <li class="dropdown">
						        	<a href="${ findType}?Type=2">蔬菜</a>
						        </li>
						         <li class="dropdown">
						        	<a href="${ findType}?Type=3">生鲜</a>
						        </li>
						        <li class="dropdown">
						        	<a href="${ findType}?Type=4">其它</a>
						        </li>
						        <li><a href="<%=request.getContextPath() %>/infolist">资讯</a></li>
						       
					        </ul>
					    </div>
					    <!--/.navbar-collapse-->
					</nav>
					<!--/.navbar-->
				</div>
			</div>
			<div class="header-right">
				<div class="search">
					<div class="search-text">
					    <input class="serch" type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"/>
					</div>
					<div class="cart box_1">
						<a href="<%=request.getContextPath() %>/tmpcart">
						<h3>
							<img src="<%=request.getContextPath() %>/images/cart.png" alt=""/>
							<div class="total">
							<span class="simpleCart_total"></span></div>
							</h3>
						</a>
						<c:url var="showCart" value="/tmpcart"></c:url>
						<p><a href="<%=request.getContextPath() %>/tmpcart" class="simpleCart_empty">购物车</a></p>
					</div>    
					<c:url var="userCenter" value="/user/UserCenter.html"></c:url>
					<div class="head-signin">
                    <h5><a href="${userCenter }"><i class="hd-dign"></i></a></h5>
                     <li class="dropdown">
						        	<a href="userdetail" class="dropdown-toggle" data-toggle="dropdown"><b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="<%=request.getContextPath() %>/user/changeUserInfo">修改信息</a></li>
										            <li><a href="<%=request.getContextPath() %>/user/repassword.html">修改密码</a></li>
										            <li><a href="<%=request.getContextPath() %>/user/checkInvitedUsers.html">推荐会员</a></li>
										            <li><a href="<%=request.getContextPath() %>/order/userOrder.html">个人订单</a></li>
										            <li><a href="<%= request.getContextPath()%>/user/UserCenter.html">个人中心</a></li>
										            <li><a href="<%= request.getContextPath()%>/user/logout">注销</a></li>
										          
									            </ul>
								            </div>
								          
							            </div>
						            </ul>
						        </li>
                     <div class="clearfix"> </div>					
				</div>
			</div>
		 <div class="clearfix"> </div>
		</div>
	</div>
</div>
</div>
<!--header end here-->
<!--banner strat here-->

	
	

<div class="home-block">
	<div class="container">
		<div class="home-block-main">
		 <c:forEach var="Product" items="${Products}">
			<div class="col-md-3 home-grid">
				<div class="home-product-main">
				   <div class="home-product-top">
				   <c:url var="productDetail" value="/product/detailProduct"></c:url>
				      <a href="${productDetail }?id=${Product.productId}"><img src="<%=request.getContextPath() %>/images/${Product.productPath}" width="150" height="80" class="img-responsive zoom-img"></a>
				   </div>
					<div class="home-product-bottom">
							<p align="center">${Product.productName}</p>						
					</div>
					<div class="srch">
						<span>¥${Product.productPrice}</span>
					</div>
				</div>
			</div>
			</c:forEach>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>	
<!--home block end here-->
<!--footer strat here-->
<div class="footer">
	
</div>
<!--footer end here-->
</body>
</html>