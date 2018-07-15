<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>推荐会员列表</title>
<link href="<%=request.getContextPath() %>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=request.getContextPath() %>/js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" media="all"/>
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
<!-- header end here -->

<div class="ckeckout">
		<div class="container">
			<div class="ckeckout-top text-center col-md-6 col-md-offset-3">
			<div class=" cart-items heading">
			 <h1>你所推荐的会员</h1>
				<script>$(document).ready(function(c) {
					$('.close1').on('click', function(c){
						$('.cart-header').fadeOut('slow', function(c){
							$('.cart-header').remove();
						});
						});	  
					});
			   </script>
			<script>$(document).ready(function(c) {
					$('.close2').on('click', function(c){
						$('.cart-header1').fadeOut('slow', function(c){
							$('.cart-header1').remove();
						});
						});	  
					});
			   </script>
			   <script>$(document).ready(function(c) {
					$('.close3').on('click', function(c){
						$('.cart-header2').fadeOut('slow', function(c){
							$('.cart-header2').remove();
						});
						});	  
					});
			   </script>
               
			<div class="in-check">
				<ul class="unit">
					<li><span>会员号</span></li>
					<li><span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li>
					<li><span>真实姓名</span></li>
					<li><span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li>
					<li><span>删除</span></li>

					<div class="clearfix"> </div>
				</ul>
				<!-- <ul class="cart-header simpleCart_shelfItem">
						
					<li><span>会员1</span></li>
					<li><span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li>
					<li><span> 用户名</span></li>
					<a class="close7"></a>
					<div class="clearfix"> </div>
				</ul> -->
				<c:forEach var="user" items="${invitedUsers }">
					<ul class="cart-header simpleCart_shelfItem">
						
					<li><span>${user.loginName }</span></li>
					<li><span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li>
					<li><span>${user.userName }</span></li>
					<a  href="<%=request.getContextPath() %>/deleteInvitedUser?userId=${user.userId }&loginName=${user.loginName}" class="close7"></a>
					<div class="clearfix"> </div>
				</ul>
				</c:forEach>
				<%-- <center>
				<table border="2">
				<tr><th>邀请会员用户名</th><th>邀请会员真实姓名</th><th>操作</th></tr>
				<c:forEach var="user" items="${invitedUsers }">
				<tr><td>${user.loginName }</td><td>${user.userName }</td><td><a href="../deleteInvitedUser?userId=${user.userId }&loginName=${user.loginName}">删除</a></td></tr>
				</c:forEach>
				</table>
				</center> --%>
			</div>
			</div>  
		 </div>
		</div>
	</div>
<body>
<div class="footer">
	<div class="container">
		<div class="footer-main">
			<div class="ftr-grids-block">
				<div class="col-md-3 footer-grid">
					<ul>
						<li><a href="product.html">Accessories</a></li>
						<li><a href="product.html">Hand bags</a></li>
						<li><a href="product.html">Clothing</a></li>
						<li><a href="product.html">Brands</a></li>
						<li><a href="product.html">Watches</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<ul>
						<li><a href="login.html">Your Account</a></li>
						<li><a href="contact.html">Contact Us</a></li>
						<li><a href="product.html">Store Locator</a></li>
						<li><a href="pressroom.html">Press Room</a></li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid">
					<ul>
						<li><a href="terms.html">Website Terms</a></li>
						<li><select class="country">
										<option value="select your location">Select Country</option>
										<option value="saab">Australia</option>
										<option value="fiat">Singapore</option>
										<option value="audi">London</option>
									</select>
							
						</li>
						<li><a href="shortcodes.html">Short Codes</a></li>
					</ul>
				</div>
                
				<div class="col-md-3 footer-grid-icon">
					<ul>
						<li><a href="#"><span class="u-tub"> </span></a></li>
						<li><a href="#"><span class="instro"> </span></a></li>
						<li><a href="#"><span class="twitter"> </span></a></li>
						<li><a href="#"><span class="fb"> </span></a></li>
						<li><a href="#"><span class="print"> </span></a></li>
					</ul>
					<form>
					<input class="email-ftr" type="text" value="Newsletter" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Newsletter';}">
					<input type="submit" value="Submit"> 
					</form>
				</div>
		    <div class="clearfix"> </div>
		  </div>
		  <div class="copy-rights">
		     <p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
		   </div>
		</div>
	</div>
</div>
</body>
</html>
