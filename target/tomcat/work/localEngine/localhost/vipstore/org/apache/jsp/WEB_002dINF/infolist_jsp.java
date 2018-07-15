package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class infolist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-1.11.0.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/oyyx.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Shoplist Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--Google Fonts-->\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Hind:400,500,300,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/easing.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //end-smoth-scrolling -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/simpleCart.min.js\"> </script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--header strat here-->\n");
      out.write("<div class=\"header\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"header-main\">\n");
      out.write("\t\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t\t<div class=\"content white\">\n");
      out.write("\t              <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t\t\t\t\t    <div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t        </button>\n");
      out.write("\t\t\t\t\t        <div class=\"navbar-brand logo\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/vipstore/\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo1.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <!--/.navbar-header-->\n");
      out.write("\t\t\t\t\t <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t        <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t        ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t        ");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\t\t\t\t\t\t\t     \n");
      out.write("\t\t\t\t\t        \t   <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">首页</a></li>\n");
      out.write("\t\t\t\t\t\t             <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=水果\">水果</a>\n");
      out.write("\t\t\t\t\t\t        </li>\n");
      out.write("\t\t\t\t\t\t            <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=蔬菜\">蔬菜</a>\n");
      out.write("\t\t\t\t\t\t        </li>\n");
      out.write("\t\t\t\t\t\t         <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=生鲜\">肉类</a>\n");
      out.write("\t\t\t\t\t\t        </li>\n");
      out.write("\t\t\t\t\t\t        <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ findType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Type=其他\">其它</a>\n");
      out.write("\t\t\t\t\t\t        </li>\n");
      out.write("\t\t\t\t\t\t        <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/infolist\">资讯</a></li>\n");
      out.write("\t\t\t\t\t\t       \n");
      out.write("\t\t\t\t\t        </ul>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <!--/.navbar-collapse-->\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t<!--/.navbar-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t<div class=\"search-text\">\n");
      out.write("\t\t\t\t\t    <input class=\"serch\" type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/tmpcart\">\n");
      out.write("\t\t\t\t\t\t<h3>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/cart.png\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"total\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/tmpcart\" class=\"simpleCart_empty\">购物车</a></p>\n");
      out.write("\t\t\t\t\t</div>    \n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"head-signin\">\n");
      out.write("                    <h5><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userCenter }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><i class=\"hd-dign\"></i></a></h5>\n");
      out.write("                     <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t        \t<a href=\"userdetail\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t            <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t            <ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/changeUserInfo\">修改信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/repassword.html\">修改密码</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/checkInvitedUsers.html\">推荐会员</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/order/userOrder.html\">个人订单</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/user/UserCenter.html\">个人中心</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/user/logout\">注销</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t          \n");
      out.write("\t\t\t\t\t\t\t\t\t            </ul>\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t\t\t          \n");
      out.write("\t\t\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t            </ul>\n");
      out.write("\t\t\t\t\t\t        </li>\n");
      out.write("                     <div class=\"clearfix\"> </div>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t <div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!--header end here-->\n");
      out.write("<!--banner strat here-->\n");
      out.write("\t<div class=\"ckeckout\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"ckeckout-top\">\n");
      out.write("\t\t\t<div class=\"cart-items heading\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<form>\n");
      out.write("              <table border=\"5\" class=\"order_tab\" style=\"width:938px; margin-bottom:200px ;\" cellspacing=\"0\" cellpadding=\"0\"  \n");
      out.write("              >\n");
      out.write("\t\t\t \n");
      out.write("              <tbody>\n");
      out.write("                <tr  bgcolor=\"#EA572D\" height=\"60\"  align=\"center\" class=\"text-center\">\n");
      out.write("                <td colspan=\"4\">\n");
      out.write("                <font size=\"+3\" color=\"#FFFFFF\">公&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;告\n");
      out.write("                </font>\n");
      out.write("                </td>\n");
      out.write("                </tr>\t\t\t \n");
      out.write("\t\t\t \n");
      out.write("\t\t\t ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/infolist.jsp(152,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/infolist.jsp(152,4) '${newsList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${newsList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/infolist.jsp(152,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("news");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t \t<tr>\n");
            out.write("\t\t\t \t<td><a href=\"");
            out.print(request.getContextPath() );
            out.write("/infodetail?newsId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.newsId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a></td>\n");
            out.write("               <td><p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</p></td>\n");
            out.write("              <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.createTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\n");
            out.write("              </tr>\n");
            out.write("              <tr><td colspan=\"2\"></td></tr><!-------------------这一行留空免得字太挤--------------------->\n");
            out.write("\t\t\t ");
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
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\n");
      out.write("            </tbody></table>\n");
      out.write("                </form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\t\t\t\n");
      out.write("<!--end-ckeckout-->\n");
      out.write("<!--footer strat here-->\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"footer-main\">\n");
      out.write("\t\t\t<div class=\"ftr-grids-block\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Hand bags</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Brands</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Watches</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.html\">Your Account</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"product.html\">Store Locator</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"pressroom.html\">Press Room</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"terms.html\">Website Terms</a></li>\n");
      out.write("\t\t\t\t\t\t<li><select class=\"country\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"select your location\">Select Country</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"saab\">Australia</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"fiat\">Singapore</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"audi\">London</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"shortcodes.html\">Short Codes</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid-icon\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"u-tub\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"instro\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"twitter\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fb\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"print\"> </span></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<input class=\"email-ftr\" type=\"text\" value=\"Newsletter\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Newsletter';}\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Submit\"> \n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t    <div class=\"clearfix\"> </div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"copy-rights\">\n");
      out.write("\t\t     <p>Copyright &copy; 2016.Company name All rights reserved.More Templates <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></p>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!--footer end here-->\n");
      out.write("</body>\n");
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
    // /WEB-INF/infolist.jsp(59,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("index");
    // /WEB-INF/infolist.jsp(59,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/infolist.jsp(60,15) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setVar("findType");
    // /WEB-INF/infolist.jsp(60,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/infolist.jsp(96,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setVar("showCart");
    // /WEB-INF/infolist.jsp(96,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/infolist.jsp(99,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setVar("userCenter");
    // /WEB-INF/infolist.jsp(99,5) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
