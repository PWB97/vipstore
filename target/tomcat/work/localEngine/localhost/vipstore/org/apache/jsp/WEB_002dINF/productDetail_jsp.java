package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Single</title>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Shoplist Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--Google Fonts-->\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Hind:400,500,300,600,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/easing.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("<!-- //end-smoth-scrolling -->\r\n");
      out.write("<!--flex slider-->\r\n");
      out.write("<script defer src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.flexslider.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("// Can also be used with $(document).ready()\r\n");
      out.write("$(window).load(function() {\r\n");
      out.write("  $('.flexslider').flexslider({\r\n");
      out.write("    animation: \"slide\",\r\n");
      out.write("    controlNav: \"thumbnails\"\r\n");
      out.write("  });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<!--flex slider-->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/imagezoom.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/simpleCart.min.js\"> </script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--header strat here-->\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"header-main\">\r\n");
      out.write("\t\t\t<div class=\"top-nav\">\r\n");
      out.write("\t\t\t\t<div class=\"content white\">\r\n");
      out.write("\t              <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t        </button>\r\n");
      out.write("\t\t\t\t\t        <div class=\"navbar-brand logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/vipstore/\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo1.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <!--/.navbar-header-->\r\n");
      out.write("\t\t\t\t\t <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t        <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t        ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t        ");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\t\t\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t        \t   <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t             <li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=1\">水果</a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("\t\t\t\t\t\t            <li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=2\">蔬菜</a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("\t\t\t\t\t\t         <li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=3\">生鲜</a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("\t\t\t\t\t\t        <li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=4\">其它</a>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/infolist\">资讯</a></li>\r\n");
      out.write("\t\t\t\t\t\t       \r\n");
      out.write("\t\t\t\t\t        </ul>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <!--/.navbar-collapse-->\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t<!--/.navbar-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<div class=\"search-text\">\r\n");
      out.write("\t\t\t\t\t    <input class=\"serch\" type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/tmpcart\">\r\n");
      out.write("\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/cart.png\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"total\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span></div>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/tmpcart\" class=\"simpleCart_empty\">购物车</a></p>\r\n");
      out.write("\t\t\t\t\t</div>    \r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"head-signin\">\r\n");
      out.write("                    <h5><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCenter }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><i class=\"hd-dign\"></i></a></h5>\r\n");
      out.write("                     <li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"userdetail\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t            <ul class=\"dropdown-menu multi-column columns-3\">\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <ul class=\"multi-column-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/changeUserInfo\">修改信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/repassword.html\">修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/checkInvitedUsers.html\">推荐会员</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/order/userOrder.html\">个人订单</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/user/UserCenter.html\">个人中心</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/user/logout\">注销</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          \r\n");
      out.write("\t\t\t\t\t\t\t\t\t            </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t          \r\n");
      out.write("\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t            </ul>\r\n");
      out.write("\t\t\t\t\t\t        </li>\r\n");
      out.write("                     <div class=\"clearfix\"> </div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--header end here-->\r\n");
      out.write("<!--banner strat here-->\r\n");
      out.write("<div class=\"single\">\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("   \t <div class=\"single-main\">\r\n");
      out.write("   \t \t<div class=\"single-top-main\">\r\n");
      out.write("\t   \t\t<div class=\"col-md-5 single-top\">\t\r\n");
      out.write("\t\t\t   <div class=\"flexslider\">\r\n");
      out.write("\t\t\t\t  <ul class=\"slides\">\r\n");
      out.write("\t\t\t\t    <li data-thumb=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t        <div class=\"thumb-image\"> <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\r\n");
      out.write("\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t    <li data-thumb=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t         <div class=\"thumb-image\"> <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\r\n");
      out.write("\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t    <li data-thumb=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t       <div class=\"thumb-image\"> <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\r\n");
      out.write("\t\t\t\t    </li> \r\n");
      out.write("\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-7 single-top-left simpleCart_shelfItem\">\r\n");
      out.write("\t\t\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\t\t\t<h6 class=\"item_price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h6>\t\t\t\r\n");
      out.write("\t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Product.productDescription}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t<form action=\"addShoppingCar\" class=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t  \t数量: <input type=\"text\" name=\"number\" />\r\n");
      out.write("\t\t\t\t\t  \t<input type=\"hidden\" name=\"productId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ Product.productId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t    <button type=\"submit\" id=\"add-button\">添加到购物车</button>\t    \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<h4>选择数量</h4>\r\n");
      out.write("\t\t<!-- \t\t<ul class=\"bann-btns\">\r\n");
      out.write("\t\t\t\t\t<li><select class=\"bann-size\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" class=\"item_add\">添加购物车</a></li>\t\t\t\t\t\r\n");
      out.write("\t            </ul>-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--single end here-->\r\n");
      out.write("<!--footer strat here-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"footer-main\">\r\n");
      out.write("\t\t\t<div class=\"ftr-grids-block\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Accessories</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Hand bags</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Clothing</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Brands</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Watches</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.html\">Your Account</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Store Locator</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"pressroom.html\">Press Room</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"terms.html\">Website Terms</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><select class=\"country\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"select your location\">Select Country</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"saab\">Australia</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"fiat\">Singapore</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"audi\">London</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"shortcodes.html\">Short Codes</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid-icon\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"u-tub\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"instro\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"twitter\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fb\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"print\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t<input class=\"email-ftr\" type=\"text\" value=\"Newsletter\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Newsletter';}\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Submit\"> \r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t    <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"copy-rights\">\r\n");
      out.write("\t\t     <p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></p>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--footer end here-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/productDetail.jsp(74,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("index");
    // /WEB-INF/productDetail.jsp(74,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/productDetail.jsp(75,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setVar("findType");
    // /WEB-INF/productDetail.jsp(75,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/product/findTypeProduct");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/productDetail.jsp(111,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setVar("showCart");
    // /WEB-INF/productDetail.jsp(111,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/tmpcart");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/productDetail.jsp(114,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setVar("userCenter");
    // /WEB-INF/productDetail.jsp(114,5) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/user/UserCenter.html");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }
}
