<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
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
        <!--[if lt IE 9]>
  <script src="js/html5shiv.min.js"></script>
  <script src="js/respond.min.js"></script>
<![endif]-->
        <link href="css/bootstrap.min.css" rel="stylesheet">
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
                 <div class="meun-item"><a href="<%=request.getContextPath() %>/user/userManager"><img src="<%=request.getContextPath() %>/images/icon_user_grey.png">用户管理</a></div>
				<div class="meun-item" ><a href="<%=request.getContextPath() %>/user/allowUser"><img src="<%=request.getContextPath() %>/images/icon_user_grey.png">通过用户申请</a></div>
                <div class="meun-title">商品管理</div>
                <div class="meun-item meun-item-active" href="#stud" aria-controls="stud" role="tab" data-toggle="tab"><img src="<%=request.getContextPath() %>/images/icon_card_grey.png">商品信息</div>
				<div class="meun-title">资讯管理</div>
				<div class="meun-item"><a href="<%=request.getContextPath() %>/showNews"><img src="<%=request.getContextPath() %>/images/icon_card_grey.png">资讯信息</a></div>
            </div>
            <!-- 右侧具体内容栏目 -->
        <div id="rightContent">
                <a class="toggle-btn" id="nimei">
                    <i class="glyphicon glyphicon-align-justify"></i>
                </a>
                <!-- Tab panes -->
        <div class="tab-content">                            			
			<!--通过用户模块-->
            

			
            <!--商品信息管理模块-->
            <!--商品信息管理模块-->
            <div role="tabpanel" class="tab-pane" id="stud">
				<div class="check-div">
                            <button class="btn btn-yellow btn-xs" data-toggle="modal" data-target="#addChar1">添加商品</button>
                        </div>
                <div class="data-div">
                    <div class="row tableHeader">
                        <div class="col-xs-2 ">
                            	商品图片
                        </div>
                        <div class="col-xs-1 ">
                           	 商品名
                        </div>
                        <div class="col-xs-2">
                           	 单价
                        </div>
                        <div class="col-xs-2">
                            	种类
                        </div>
                        <div class="col-xs-2 ">
                           	 产地
                        </div>
                        <div class="col-xs-2">
                            	库存
                        </div>
                        <div class="col-xs-1">
                          	 操作
                        </div>
                    </div>
                    <div class="tablebody">
                    <c:forEach var="Products" items="${Products}">
                        <div class="row">
                            <div class="col-xs-2 ">
                                <img src="<%=request.getContextPath() %>/images/${Products.productPath}" width="80" height="50"></a>
                            </div>
                            <div class="col-xs-1">
                                ${Products.productName}
                            </div>
                            <div class="col-xs-2">
                                ${Products.productPrice}
                            </div>
                            <div class="col-xs-2">
                               ${Products.productType}
                            </div>
                            <div class="col-xs-2">
                                ${Products.productOrigin}
                            </div>
                            <div class="col-xs-2">
                                ${Products.productStock}
                            </div>
                            <c:url var="productDelete" value="/product/deleteProduct">
							<c:param name="productId" value="${Products.productId }" />
							</c:url>
							<c:url var="productModify" value="/product/productModify">
								<c:param name="productId" value="${Products.productId }" />
							</c:url>
                            <div class="col-xs-1">
                            	<a href="${productDelete }" onclick="if (!(confirm('你确定要删除这项商品的信息吗?'))) return false">删除|</a>		
								<a href="${productModify }">修改</a>
		
                            </div>
                        </div>
                        </c:forEach>
                    </div>
                </div>                             
                    </ul>
                </footer>

                <!--弹出删除警告窗口-->

                <div class="modal fade" id="deleteObey" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">提示</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    确定要删除该违约记录？删除后不可恢复！
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-danger">保 存</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->
				                <!--增加商品弹出窗口-->
                <div class="modal fade" id="addChar1" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">添加商品</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                   <form:form action="productModelHandle" method="POST" enctype="multipart/form-data">
				
							  			<p>商品名称：<input type="text" class="style1" name="commodityName" id="commodityName"/></p><br>
										<p>商品价格：<input type="text" class="style1" name="commodityPrice" id="commodityPrice"/></p><br>
										<p>
										<p>商品种类：
										<input type="radio" class="style2" name="commodityType" value="1" id="commodityType"/>水果&nbsp;
										<input type="radio" class="style2" name="commodityType" value="2" id="commodityType"/>蔬菜&nbsp;
										<input type="radio" class="style2" name="commodityType" value="3" id="commodityType"/>生鲜&nbsp;
										<input type="radio" class="style2" name="commodityType" value="4" id="commodityType"/>其他&nbsp;
										</p><br>
										<p>商品描述：<input type="text" class="style1" name="commodityDescription" id="commodityDescription"/></p><br>
										<p>商品数量：<input type="text" class="style1" name="commodityNumber" id="commodityNumber"/></p><br>
										<p>商品产地：<input type="text" class="style1" name="commodityOrigin" id="commodityOrigin"/></p><br>
										
										<p>商品图片：<input type="file" class="style1" required name="pic" id="exampleInputFile"/></p>
										<input type="submit" class="style1" value="Save" class="save" />	
									</form:form>
                            </div>                         
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->

            </div>
			
                

                <!--弹出删除违约记录警告窗口-->

                <div class="modal fade" id="deleteObey" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">提示</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    确定要删除？删除后不可恢复！
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-danger">保 存</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->
				                <!--增加权限弹出窗口-->
                <div class="modal fade" id="addChar" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">添加资讯</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    <form class="form-horizontal">
                                        <div class="form-group ">
                                            <label for="sName" class="col-xs-3 control-label">标题：</label>
                                            <div class="col-xs-6 ">
                                                <input type="email" class="form-control input-sm duiqi" id="sName" placeholder="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="sLink" class="col-xs-3 control-label">内容：</label>
                                            <div class="col-xs-6 ">
                                                <textarea class="form-control input-sm duiqi"></textarea>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn btn-xs btn-green">保 存</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->

            </div>
        </div>
    </div>
</div>

<script src="<%=request.getContextPath() %>/js/jquery.nouislider.js"></script>


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