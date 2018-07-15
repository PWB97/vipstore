<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE HTML>
<html>
<head>
<title>个人中心</title>
<link href="<%=request.getContextPath() %>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
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
						        	<a href="${ findType}?Type=3">肉类</a>
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
<!--sign in start here-->


<center><div class="signin">
	<div class="container">
		<div class="signin-main">
			<h1>个人中心</h1>
			<h2>个人信息修改</h2>
			<form action="<%=request.getContextPath() %>/user/changeUserInfo" method="post">
				<input name="userId" hidden="hidden" value="10008"/>  <!-- 本网页显示的ID传到后台 -->
				用户名：<input name="userName" type="text" placeholder="usename" class="form-control" required />
				<br> 
				身份证：<input name="identityCode" type="text" placeholder="identitycode" class="form-control" required/>
				<br>
				邮&nbsp;箱&nbsp;：&nbsp;&nbsp;<input name="email" type="text" placeholder="email" class="form-control" />
				<br>
				手&nbsp;机&nbsp;：&nbsp;&nbsp;<input name="mobile" type="text" placeholder="mobile" class="form-control" />
				<br>
				地&nbsp;址&nbsp;：&nbsp;&nbsp;<input name="address" type="text" placeholder="address" class="form-control" />
				<br>
                &nbsp&nbsp性别：&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="radio"  name="sex" value="1" required/>
                              男
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="radio"  name="sex" value="0" required/>
               	 女
				<input type="submit" value="提交">
			</form>
		</div>
	</div>
</div>
</center>
<!--sign in end here-->
<!--footer strat here-->
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
		     <p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a></p>
		   </div>
		</div>
	</div>
</div>
<!--footer end here-->
</body>
</html>