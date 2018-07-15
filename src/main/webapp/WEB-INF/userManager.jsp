<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
  <script src="<%=request.getContextPath() %>/js/html5shiv.min.js"></script>
  <script src="<%=request.getContextPath() %>/js/respond.min.js"></script>
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
                <div class="meun-item meun-item-active" href="#user" aria-controls="user" role="tab" data-toggle="tab"><img src="<%=request.getContextPath() %>/images/icon_user_grey.png">用户管理</div>
				<div class="meun-item"><a href="<%=request.getContextPath() %>/user/allowUser"><img src="<%=request.getContextPath() %>/images/icon_user_grey.png">通过用户申请</a></div>
                <div class="meun-title">商品管理</div>
                <div class="meun-item"><a href="<%=request.getContextPath() %>/product/showProduct"><img src="<%=request.getContextPath() %>/images/icon_card_grey.png">商品信息</a></div>
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
                    
            <!--用户管理模块-->
            <div role="tabpanel" class="tab-pane" id="user">
                <div class="data-div">
                    <div class="row tableHeader">
                        <div class="col-xs-1 ">
                            用户名
                        </div>
                        <div class="col-xs-1">
                            真实姓名
                        </div>
                        <div class="col-xs-1">
                            电话
                        </div>
                       <div class="col-xs-1">
                            性别
                        </div>
                        <div class="col-xs-1">
                            地址
                        </div>
                        <div class="col-xs-1">
                            状态
                        </div>
                        <div class="col-xs-2">
                            操作
                        </div>
                    </div>
                    <c:forEach items="${users}" var="user" >
                    	 <div class="tablebody">
                        <div class="row">
                            <div class="col-xs-1 ">
                                ${user.loginName}
                            </div>
                            <div class="col-xs-1">
                                ${user.userName}
                            </div>
                            <div class="col-xs-1">
                                ${user.mobile}
                            </div>
                            <div class="col-xs-1">
                                ${user.sex}
                            </div>
                            <div class="col-xs-1">
                                ${user.address}
                            </div>
                            <div class="col-xs-1">
                               	${user.type}
                            </div>
                            <div class="col-xs-2">
                                <a class="btn btn-danger btn-xs" href="<%=request.getContextPath() %>/user/userManager/delete?userId=${user.userId}">删除</a>
                            </div>
                        </div>
						</div>
					</c:forEach>
                   

                </div>
                <!--页码块-->
                <footer class="footer">
                    <ul class="pagination">
                        <li>
                            <select>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                            </select>
                            页
                        </li>
                        <li class="gray">
                            共20页
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-left">
                            </i>
                        </li>
                        <li>
                            <i class="glyphicon glyphicon-menu-right">
                            </i>
                        </li>
                    </ul>
                </footer>


                <!--弹出删除用户警告窗口-->
                <div class="modal fade" id="deleteUser" role="dialog" aria-labelledby="gridSystemModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="gridSystemModalLabel">提示</h4>
                            </div>
                            <div class="modal-body">
                                <div class="container-fluid">
                                    确定要删除该用户？删除后不可恢复！
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-xs btn-white" data-dismiss="modal">取 消</button>
                                <button type="button" class="btn  btn-xs btn-danger">保 存</button>
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