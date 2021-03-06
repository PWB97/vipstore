<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>推荐会员列表</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
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
								<a href="index.html"><img src="<%=request.getContextPath() %>/images/logo1.png" alt=""></a>
							</div>
					    </div>
					    <!--/.navbar-header-->
					 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					        <ul class="nav navbar-nav">
					        	   <li><a href="index.html">Home</a></li>
						             <li class="dropdown">
						        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Men <b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-m.html">Accessories</a></li>
										            <li><a href="product-m.html">Bags</a></li>
										            <li><a href="product-m.html">Cap & Hats</a></li>
										            <li><a href="product-m.html">Tops</a></li>
										            <li><a href="product-m.html">Jackets & Coats</a></li>
										            <li><a href="product-m.html">wallets</a></li>
										            <li><a href="product-m.html">Jeans</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
                                                 <li><a href="product-m.html">Shirts</a></li>
										            <li><a href="product-m.html">Shoes,Boots</a></li>
										            <li><a href="product-m.html">Shorts</a></li>
										             <li><a href="product-m.html">Watches</a></li>
										            <li><a href="product-m.html">Sunglasses</a></li>
										             <li><a href="product-m.html">Bands</a></li>
										            <li><a href="product-m.html">Swimwear</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-m.html">Jewellery</a></li>
										            <li><a href="product-m.html">Jack & Jones</a></li>
										            <li><a href="product-m.html">Ray-Ban</a></li>
										             <li><a href="product-m.html">Lipsticks</a></li>
										            <li><a href="product-m.html">Longer wear</a></li>
										            <li><a href="product-m.html">sarees</a></li>
										            <li><a href="product-m.html">Nike</a></li>
									            </ul>
								            </div>
							            </div>
						            </ul>
						        </li>
						            <li class="dropdown">
						        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Women <b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product.html">Accessories</a></li>
										            <li><a href="product.html">Bags</a></li>
										            <li><a href="product.html">Cap & Hats</a></li>
										            <li><a href="product.html">Tops</a></li>
										            <li><a href="product.html">Jackets & Coats</a></li>
										            <li><a href="product.html">wallets</a></li>
										            <li><a href="product.html">Jeans</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product.html">Shirts</a></li>
										            <li><a href="product.html">Shoes,Boots</a></li>
										            <li><a href="product.html">Shorts</a></li>
										             <li><a href="product.html">Watches</a></li>
										            <li><a href="product.html">Sunglasses</a></li>
										             <li><a href="product.html">Bands</a></li>
										            <li><a href="product.html">Swimwear</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product.html">Jewellery</a></li>
										            <li><a href="product.html">Jack & Jones</a></li>
										            <li><a href="product.html">Ray-Ban</a></li>
										             <li><a href="product.html">Lipsticks</a></li>
										            <li><a href="product.html">Longer wear</a></li>
										            <li><a href="product.html">sarees</a></li>
										            <li><a href="product.html">Nike</a></li>
									            </ul>
								            </div>
							            </div>
						            </ul>
						        </li>
						         <li class="dropdown">
						        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Kids<b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-k.html">Accessories</a></li>
										            <li><a href="product-k.html">Bags</a></li>
										            <li><a href="product-k.html">Cap & Hats</a></li>
										            <li><a href="product-k.html">Tops</a></li>
										            <li><a href="product-k.html">Jackets & Coats</a></li>
										            <li><a href="product-k.html">wallets</a></li>
										            <li><a href="product-k.html">Jeans</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-k.html">Shirts</a></li>
										            <li><a href="product-k.html">Shoes,Boots</a></li>
										            <li><a href="product-k.html">Shorts</a></li>
										             <li><a href="product-k.html">Watches</a></li>
										            <li><a href="product-k.html">Sunglasses</a></li>
										             <li><a href="product-k.html">Bands</a></li>
										            <li><a href="product-k.html">Swimwear</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-k.html">Jewellery</a></li>
										            <li><a href="product-k.html">Jack & Jones</a></li>
										            <li><a href="product-k.html">Ray-Ban</a></li>
										             <li><a href="product-k.html">Lipsticks</a></li>
										            <li><a href="product-k.html">Longer wear</a></li>
										            <li><a href="product-k.html">sarees</a></li>
										            <li><a href="product-k.html">Nike</a></li>
									            </ul>
								            </div>
							            </div>
						            </ul>
						        </li>
						        <li><a href="contact.html">Contact</a></li>
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
						<a href="checkout.html">
						<h3>
							<img src="<%=request.getContextPath() %>/images/cart.png" alt=""/>
							<div class="total">
							<span class="simpleCart_total"></span></div>
							</h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
					</div>    
					<div class="head-signin">
						<h5><a href="login.html"><i class="hd-dign"></i>Sign in</a></h5>
					</div>              
                     <div class="clearfix"> </div>					
				</div>
			</div>
		 <div class="clearfix"> </div>
		</div>
	</div>
</div>

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
					<li><span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li>
					<li><span>会员名</span></li>
					<li><span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li>
					<li><span>删除</span></li>
					<div class="clearfix"> </div>
				</ul>
				<ul class="cart-header simpleCart_shelfItem">
				<a class="close1" href="<%=request.getContextPath() %>/user/deleteInvited"></a>	
					<!-- 
						本页面未含用户id
					 -->
					 <form action="<%=request.getContextPath() %>/user/deleteInvited" method="post">
					 	<input name="userId" hidden="hidden" value="10008">
					 	<input name="loginName" hidden="hidden" value="XXX">
					 	<li><span>会员1</span></li>	
					 </form>
					<li><span>会员1</span></li>				
					<div class="clearfix"> </div>
				</ul>
				<ul class=" cart-header1 simpleCart_shelfItem">
					<li class="close2"> </li>
					<li><span>莎琪雅</span></li>	
					<div class="clearfix"> </div>
				</ul>
				<ul class="cart-header2 simpleCart_shelfItem">
					<li class="close3"> </li>
					<li><span>月仙</span></li>
					<div class="clearfix"> </div>
				</ul>
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