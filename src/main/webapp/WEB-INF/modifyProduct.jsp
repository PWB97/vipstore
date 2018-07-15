<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="ch">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta name="format-detection" content="telephone=no">
        <title>后台管理</title>
        <script src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
        <script src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
        <script>
            $(function() {
                $(".meun-item").click(function() {
                    $(".meun-item").removeClass("meun-item-active");
                    $(this).addClass("meun-item-active");
                    var itmeObj = $(".meun-item").find("img");
                    itmeObj.each(function() {
                        var items = $(this).attr("src");
                        items = items.replace("_grey.png", ".png");
                        items = items.replace(".png", "_grey.png")
                        $(this).attr("src", items);
                    });
                    var attrObj = $(this).find("img").attr("src");
                    ;
                    attrObj = attrObj.replace("_grey.png", ".png");
                    $(this).find("img").attr("src", attrObj);
                });
                $("#topAD").click(function() {
                    $("#topA").toggleClass(" glyphicon-triangle-right");
                    $("#topA").toggleClass(" glyphicon-triangle-bottom");
                });
                $("#topBD").click(function() {
                    $("#topB").toggleClass(" glyphicon-triangle-right");
                    $("#topB").toggleClass(" glyphicon-triangle-bottom");
                });
                $("#topCD").click(function() {
                    $("#topC").toggleClass(" glyphicon-triangle-right");
                    $("#topC").toggleClass(" glyphicon-triangle-bottom");
                });
                $(".toggle-btn").click(function() {
                    $("#leftMeun").toggleClass("show");
                    $("#rightContent").toggleClass("pd0px");
                })
            })
        </script>
        <style type="text/css">
        #container h1{
        	font-family:"楷体";
            color:grey;/*文本颜色*/
            text-align:center;/*对齐方式*/
            /*border:1px solid black;/*边框样式*/
            font-size:60px;
            hight:240px;
        }
        #container form{
        	font-family:"宋体";
        	font-size:20px;
        	text-align:center;/*对齐方式*/
        	font-weight:bold;
        
        }
        #container form input.style1{
            border: 1px solid #ccc;
            border-radius: 2px;
            color: #000;
            font-family: 'Open Sans', sans-serif;
            font-size: 1em;
            height: 50px;
            padding: 0 16px;
            transition: background 0.3s ease-in-out;
            width: 30%;
        }
        #container form input.style2{
		  position: relative;
		  width: 16px;
		  height: 16px;
		  background-clip: border-box;
		  -webkit-appearance: none;
		     -moz-appearance: none;
		          appearance: none;
		  margin: -0.15px 0.6px 0 0;
		  vertical-align: text-bottom;
		  border-radius: 50%;
		  background-color: #fff;
		  border: 1px solid #d7d7d7;
		}
		#container form input.style2:disabled {
		  opacity: 0.65;
		}
		#container form input.style2:before {
		  content: '';
		  display: block;
		  height: 0px;
		  width: 0px;
		  -webkit-transition: width 0.25s, height 0.25s;
		  transition: width 0.25s, height 0.25s;
		}
		#container form input.style2:checked:before {
		  height: 8px;
		  width: 8px;
		  border-radius: 50%;
		  margin: 3px 0 0 3px;
		}
		#container form input.style2:focus {
		  outline: none;
		  box-shadow: inset 0 1px 1px rgba(255,255,255,0.075), 0 0px 2px #38a7ff;
		}
		#container form input.style2:checked {
		  border: 1px solid #555;
		}
		#container form input.style2:checked:before {
		  background-color: #555;
		}
        #container form input.style2:focus {
            outline: none;
            border-color: #9ecaed;
            box-shadow: 0 0 10px #9ecaed;
        }
  
        
    </style>
        <!--[if lt IE 9]>
  <script src="js/html5shiv.min.js"></script>
  <script src="js/respond.min.js"></script>
<![endif]-->
        <link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css" />
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/slide.css" />
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/flat-ui.min.css" />
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/jquery.nouislider.css">
    </head>

    <body>
        <div id="wrap">
            <!-- 左侧菜单栏目块 -->
            <div class="leftMeun" id="leftMeun">
                <div id="logoDiv">
                </div>
                <div class="meun-title">账号管理</div>
                <div class="meun-item" href="#user" aria-controls="user" role="tab" data-toggle="tab"><img src="<%=request.getContextPath() %>/images/icon_user_grey.png">用户管理</div>
				<div class="meun-item" href="#user1" aria-controls="user1" role="tab" data-toggle="tab"><img src="<%=request.getContextPath() %>/images/icon_user_grey.png">通过用户申请</div>
                <div class="meun-title">商品管理</div>
                <div class="meun-item" href="#stud" aria-controls="stud" role="tab" data-toggle="tab"><img src="<%=request.getContextPath() %>/images/icon_card_grey.png">商品信息</div>
				<div class="meun-title">资讯管理</div>
				<div class="meun-item" href="#stud1" aria-controls="stud1" role="tab" data-toggle="tab"><img src="<%=request.getContextPath() %>/images/icon_card_grey.png">资讯信息</div>
            </div>
            <!-- 右侧具体内容栏目 -->
        <div id="rightContent">
                <a class="toggle-btn" id="nimei">
                    <i class="glyphicon glyphicon-align-justify"></i>
                </a>
                <!-- Tab panes -->
        <div id="container">
			<h1 style="text-align:center">商品修改</h1>
	        	<form:form action="updateProduct" method="POST">
				
					<input type="hidden" class="style1" name="commodityId" id="commodityId" value="${Product.productId}"/><br>
		  			<p>商品名称：<input type="text" class="style1" name="commodityName" id="commodityName" value="${Product.productName}"/></p><br>
					<p>商品价格：<input type="text" class="style1" name="commodityPrice" id="commodityPrice" value="${Product.productPrice}"/></p><br>
					<p>
					<p>商品描述：<input type="text" class="style1" name="commodityDescription" id="commodityDescription" value="${Product.productDescription}"/></p><br>
					<p>商品数量：<input type="text" class="style1" name="commodityNumber" id="commodityNumber" value="${Product.productStock}"/></p><br>
					<p>商品产地：<input type="text" class="style1" name="commodityOrigin" id="commodityOrigin" value="${Product.productOrigin}"/></p><br>
					
					<input type="submit" class="style1" value="Save" class="save" />	
				</form:form>
	      
        </div>

<script src="js/jquery.nouislider.js"></script>


<script>
                                                //min/max slider
                                                function huadong(my, unit, def, max) {
                                                    $(my).noUiSlider({
                                                        range: [0, max],
                                                        start: [def],
                                                        handles: 1,
                                                        connect: 'upper',
                                                        slide: function() {
                                                            var val = Math.floor($(this).val());
                                                            $(this).find(".noUi-handle").text(
                                                                    val + unit
                                                                    );
                                                            console.log($(this).find(".noUi-handle").parent().parent().html());
                                                        },
                                                        set: function() {
                                                            var val = Math.floor($(this).val());
                                                            $(this).find(".noUi-handle").text(
                                                                    val + unit
                                                                    );
                                                        }
                                                    });
                                                    $(my).val(def, true);
                                                }
                                                huadong('.slider-minmax1', "分钟", "5", 30);
                                                huadong('.slider-minmax2', "分钟", "6", 15);
                                                huadong('.slider-minmax3', "分钟", "10", 60);
                                                huadong('.slider-minmax4', "次", "2", 10);
                                                huadong('.slider-minmax5', "天", "3", 7);
                                                huadong('.slider-minmax6', "天", "8", 10);
</script>
</body>

</html>