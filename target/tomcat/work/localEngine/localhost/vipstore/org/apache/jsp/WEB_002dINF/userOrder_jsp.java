package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>我的订单</title>\r\n");
      out.write("\r\n");
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
      out.write("/css/oyyx.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
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
      out.write("<!--start-ckeckout-->\r\n");
      out.write("\t<div class=\"ckeckout\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"ckeckout-top\">\r\n");
      out.write("\t\t\t<div class=\" cart-items heading\">\r\n");
      out.write("\t\t\t <h1>我的订单</h1>\r\n");
      out.write("\t\t\t  ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/userOrder.jsp(138,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("order");
      // /WEB-INF/userOrder.jsp(138,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/userOrder.jsp(138,5) '${userOrders.orders}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userOrders.orders}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/userOrder.jsp(138,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("ord");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<ul class=\"unit\">\r\n");
            out.write("\t\t\t\t\t");
            if (_jspx_meth_c_005furl_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t<li><span>用户名：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</span></li>\r\n");
            out.write("\t\t\t\t\t<li><span>订单号：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</span></li>\r\n");
            out.write("\t\t\t\t\t<li><span>订单日期：");
            if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("</span></li>\r\n");
            out.write("\t\t\t\t\t<li><span>地址：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.address }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</span></li>\r\n");
            out.write("\t\t\t\t\t<li><span>总价：");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.cost}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</span></li>\r\n");
            out.write("\t\t\t\t\t<li><span><a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${delete }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("?orderId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">删除</a></span></li>\r\n");
            out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
            out.write("\t\t\t\t</ul>\r\n");
            out.write("\t\t\t\t<form>\r\n");
            out.write("              <table border=\"0\" class=\"order_tab\" style=\"width:938px; margin-bottom:100px\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
            out.write("\t\t\t  <tr>\r\n");
            out.write("\t\t\t  <th width=\"135\"  height=\"60\"  align=\"center\" class=\"unit text-center\">商品名</th>\r\n");
            out.write("\t\t\t  <th width=\"135\"  height=\"60\"  align=\"center\" class=\"unit text-center\">商品图片</th>\r\n");
            out.write("\t\t\t  <th width=\"135\"  height=\"60\"  align=\"center\" class=\"unit text-center\">数量</th>\r\n");
            out.write("\t\t\t  <th width=\"135\"  height=\"60\"  align=\"center\" class=\"unit text-center\">单价</th>\r\n");
            out.write("\t\t\t  <th width=\"135\"  height=\"60\"  align=\"center\" class=\"unit text-center\">总价</th>\r\n");
            out.write("\t\t\t  </tr>\r\n");
            out.write("              <tbody>\r\n");
            out.write("              ");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
            _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
            // /WEB-INF/userOrder.jsp(159,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setVar("orderDetails");
            // /WEB-INF/userOrder.jsp(159,14) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/userOrder.jsp(159,14) '${order.orderDetails}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${order.orderDetails}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
            // /WEB-INF/userOrder.jsp(159,14) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_c_005fforEach_005f1.setVarStatus("ord");
            int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
              if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t  <tr>\r\n");
                  out.write("                <td width=\"135\"  height=\"60\"  align=\"center\" >");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetails.product.productName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write(" </td>\r\n");
                  out.write("                <td width=\"135\"  height=\"60\"  align=\"center\"><img src=\"");
                  out.print(request.getContextPath() );
                  out.write("/images/");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetails.product.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\" width=\"80\" height=\"50\"></td>\r\n");
                  out.write("                <td width=\"135\"  height=\"60\"  align=\"center\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetails.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("</td>\r\n");
                  out.write("                <td width=\"135\"  height=\"60\"  align=\"center\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetails.product.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("</td>\r\n");
                  out.write("                <td width=\"135\"  height=\"60\"  align=\"center\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${orderDetails.cost }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write(" </td>\r\n");
                  out.write("              </tr>\r\n");
                  out.write("              ");
                  int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_005fforEach_005f1.doFinally();
              _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
            }
            out.write(" \r\n");
            out.write("            </tbody>\r\n");
            out.write("            </table>\r\n");
            out.write("                </form>\r\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write(" \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("<!--end-ckeckout-->\r\n");
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
      out.write("</html>");
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
    // /WEB-INF/userOrder.jsp(61,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("index");
    // /WEB-INF/userOrder.jsp(61,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/userOrder.jsp(62,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setVar("findType");
    // /WEB-INF/userOrder.jsp(62,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/userOrder.jsp(98,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setVar("showCart");
    // /WEB-INF/userOrder.jsp(98,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/userOrder.jsp(101,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setVar("userCenter");
    // /WEB-INF/userOrder.jsp(101,5) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/user/UserCenter.html");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/userOrder.jsp(140,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setVar("delete");
    // /WEB-INF/userOrder.jsp(140,5) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/order/delete.html");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/userOrder.jsp(143,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setType("both");
    // /WEB-INF/userOrder.jsp(143,20) name = dateStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setDateStyle("medium");
    // /WEB-INF/userOrder.jsp(143,20) name = timeStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setTimeStyle("medium");
    // /WEB-INF/userOrder.jsp(143,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.createTime}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005ftimeStyle_005fdateStyle_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }
}
