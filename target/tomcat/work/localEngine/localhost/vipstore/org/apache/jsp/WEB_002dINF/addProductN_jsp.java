package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProductN_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.release();
    _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005faction.release();
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ch\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("        <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("        <title>后台管理</title>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function() {\r\n");
      out.write("                $(\".meun-item\").click(function() {\r\n");
      out.write("                    $(\".meun-item\").removeClass(\"meun-item-active\");\r\n");
      out.write("                    $(this).addClass(\"meun-item-active\");\r\n");
      out.write("                    var itmeObj = $(\".meun-item\").find(\"img\");\r\n");
      out.write("                    itmeObj.each(function() {\r\n");
      out.write("                        var items = $(this).attr(\"src\");\r\n");
      out.write("                        items = items.replace(\"_grey.png\", \".png\");\r\n");
      out.write("                        items = items.replace(\".png\", \"_grey.png\")\r\n");
      out.write("                        $(this).attr(\"src\", items);\r\n");
      out.write("                    });\r\n");
      out.write("                    var attrObj = $(this).find(\"img\").attr(\"src\");\r\n");
      out.write("                    ;\r\n");
      out.write("                    attrObj = attrObj.replace(\"_grey.png\", \".png\");\r\n");
      out.write("                    $(this).find(\"img\").attr(\"src\", attrObj);\r\n");
      out.write("                });\r\n");
      out.write("                $(\"#topAD\").click(function() {\r\n");
      out.write("                    $(\"#topA\").toggleClass(\" glyphicon-triangle-right\");\r\n");
      out.write("                    $(\"#topA\").toggleClass(\" glyphicon-triangle-bottom\");\r\n");
      out.write("                });\r\n");
      out.write("                $(\"#topBD\").click(function() {\r\n");
      out.write("                    $(\"#topB\").toggleClass(\" glyphicon-triangle-right\");\r\n");
      out.write("                    $(\"#topB\").toggleClass(\" glyphicon-triangle-bottom\");\r\n");
      out.write("                });\r\n");
      out.write("                $(\"#topCD\").click(function() {\r\n");
      out.write("                    $(\"#topC\").toggleClass(\" glyphicon-triangle-right\");\r\n");
      out.write("                    $(\"#topC\").toggleClass(\" glyphicon-triangle-bottom\");\r\n");
      out.write("                });\r\n");
      out.write("                $(\".toggle-btn\").click(function() {\r\n");
      out.write("                    $(\"#leftMeun\").toggleClass(\"show\");\r\n");
      out.write("                    $(\"#rightContent\").toggleClass(\"pd0px\");\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"js/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/slide.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/flat-ui.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/jquery.nouislider.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrap\">\r\n");
      out.write("            <!-- 左侧菜单栏目块 -->\r\n");
      out.write("            <div class=\"leftMeun\" id=\"leftMeun\">\r\n");
      out.write("                <div id=\"logoDiv\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"meun-title\">账号管理</div>\r\n");
      out.write("                 <div class=\"meun-item\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/userManager\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_user_grey.png\">用户管理</a></div>\r\n");
      out.write("\t\t\t\t<div class=\"meun-item\" ><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/allowUser\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_user_grey.png\">通过用户申请</a></div>\r\n");
      out.write("                <div class=\"meun-title\">商品管理</div>\r\n");
      out.write("                <div class=\"meun-item meun-item-active\" href=\"#stud\" aria-controls=\"stud\" role=\"tab\" data-toggle=\"tab\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_card_grey.png\">商品信息</div>\r\n");
      out.write("\t\t\t\t<div class=\"meun-title\">资讯管理</div>\r\n");
      out.write("\t\t\t\t<div class=\"meun-item\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/showNews\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_card_grey.png\">资讯信息</a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 右侧具体内容栏目 -->\r\n");
      out.write("        <div id=\"rightContent\">\r\n");
      out.write("                <a class=\"toggle-btn\" id=\"nimei\">\r\n");
      out.write("                    <i class=\"glyphicon glyphicon-align-justify\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- Tab panes -->\r\n");
      out.write("        <div class=\"tab-content\">                            \t\t\t\r\n");
      out.write("\t\t\t<!--通过用户模块-->\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <!--商品信息管理模块-->\r\n");
      out.write("            <!--商品信息管理模块-->\r\n");
      out.write("            <div role=\"tabpanel\" class=\"tab-pane\" id=\"stud\">\r\n");
      out.write("\t\t\t\t<div class=\"check-div\">\r\n");
      out.write("                            <button class=\"btn btn-yellow btn-xs\" data-toggle=\"modal\" data-target=\"#addChar1\">添加商品</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                <div class=\"data-div\">\r\n");
      out.write("                    <div class=\"row tableHeader\">\r\n");
      out.write("                        <div class=\"col-xs-2 \">\r\n");
      out.write("                            \t商品图片\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-1 \">\r\n");
      out.write("                           \t 商品名\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-2\">\r\n");
      out.write("                           \t 单价\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-2\">\r\n");
      out.write("                            \t种类\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-2 \">\r\n");
      out.write("                           \t 产地\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-2\">\r\n");
      out.write("                            \t库存\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-1\">\r\n");
      out.write("                          \t 操作\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tablebody\">\r\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/addProductN.jsp(118,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("Products");
      // /WEB-INF/addProductN.jsp(118,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/addProductN.jsp(118,20) '${Products}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${Products}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <div class=\"row\">\r\n");
            out.write("                            <div class=\"col-xs-2 \">\r\n");
            out.write("                                <img src=\"");
            out.print(request.getContextPath() );
            out.write("/images/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" width=\"80\" height=\"50\"></a>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"col-xs-1\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"col-xs-2\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"col-xs-2\">\r\n");
            out.write("                               ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"col-xs-2\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productOrigin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <div class=\"col-xs-2\">\r\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productStock}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("                            </div>\r\n");
            out.write("                            ");
            if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_c_005furl_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("\r\n");
            out.write("                            <div class=\"col-xs-1\">\r\n");
            out.write("                            \t<a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productDelete }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" onclick=\"if (!(confirm('你确定要删除这项商品的信息吗?'))) return false\">删除|</a>\t\t\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productModify }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">修改</a>\r\n");
            out.write("\t\t\r\n");
            out.write("                            </div>\r\n");
            out.write("                        </div>\r\n");
            out.write("                        ");
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
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>                             \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </footer>\r\n");
      out.write("\r\n");
      out.write("                <!--弹出删除警告窗口-->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal fade\" id=\"deleteObey\" role=\"dialog\" aria-labelledby=\"gridSystemModalLabel\">\r\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                <h4 class=\"modal-title\" id=\"gridSystemModalLabel\">提示</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"container-fluid\">\r\n");
      out.write("                                    确定要删除该违约记录？删除后不可恢复！\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-xs btn-white\" data-dismiss=\"modal\">取 消</button>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-xs btn-danger\">保 存</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.modal-content -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.modal-dialog -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.modal -->\r\n");
      out.write("\t\t\t\t                <!--增加商品弹出窗口-->\r\n");
      out.write("                <div class=\"modal fade\" id=\"addChar1\" role=\"dialog\" aria-labelledby=\"gridSystemModalLabel\">\r\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                <h4 class=\"modal-title\" id=\"gridSystemModalLabel\">添加商品</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"container-fluid\">\r\n");
      out.write("                                   ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>                         \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.modal-content -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.modal-dialog -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                <!--弹出删除违约记录警告窗口-->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal fade\" id=\"deleteObey\" role=\"dialog\" aria-labelledby=\"gridSystemModalLabel\">\r\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                <h4 class=\"modal-title\" id=\"gridSystemModalLabel\">提示</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"container-fluid\">\r\n");
      out.write("                                    确定要删除？删除后不可恢复！\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-xs btn-white\" data-dismiss=\"modal\">取 消</button>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-xs btn-danger\">保 存</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.modal-content -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.modal-dialog -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.modal -->\r\n");
      out.write("\t\t\t\t                <!--增加权限弹出窗口-->\r\n");
      out.write("                <div class=\"modal fade\" id=\"addChar\" role=\"dialog\" aria-labelledby=\"gridSystemModalLabel\">\r\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                <h4 class=\"modal-title\" id=\"gridSystemModalLabel\">添加资讯</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <div class=\"container-fluid\">\r\n");
      out.write("                                    <form class=\"form-horizontal\">\r\n");
      out.write("                                        <div class=\"form-group \">\r\n");
      out.write("                                            <label for=\"sName\" class=\"col-xs-3 control-label\">标题：</label>\r\n");
      out.write("                                            <div class=\"col-xs-6 \">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control input-sm duiqi\" id=\"sName\" placeholder=\"\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <label for=\"sLink\" class=\"col-xs-3 control-label\">内容：</label>\r\n");
      out.write("                                            <div class=\"col-xs-6 \">\r\n");
      out.write("                                                <textarea class=\"form-control input-sm duiqi\"></textarea>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-xs btn-white\" data-dismiss=\"modal\">取 消</button>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-xs btn-green\">保 存</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.modal-content -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.modal-dialog -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.nouislider.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("                                                //min/max slider\r\n");
      out.write("                                                function huadong(my, unit, def, max) {\r\n");
      out.write("                                                    $(my).noUiSlider({\r\n");
      out.write("                                                        range: [0, max],\r\n");
      out.write("                                                        start: [def],\r\n");
      out.write("                                                        handles: 1,\r\n");
      out.write("                                                        connect: 'upper',\r\n");
      out.write("                                                        slide: function() {\r\n");
      out.write("                                                            var val = Math.floor($(this).val());\r\n");
      out.write("                                                            $(this).find(\".noUi-handle\").text(\r\n");
      out.write("                                                                    val + unit\r\n");
      out.write("                                                                    );\r\n");
      out.write("                                                            console.log($(this).find(\".noUi-handle\").parent().parent().html());\r\n");
      out.write("                                                        },\r\n");
      out.write("                                                        set: function() {\r\n");
      out.write("                                                            var val = Math.floor($(this).val());\r\n");
      out.write("                                                            $(this).find(\".noUi-handle\").text(\r\n");
      out.write("                                                                    val + unit\r\n");
      out.write("                                                                    );\r\n");
      out.write("                                                        }\r\n");
      out.write("                                                    });\r\n");
      out.write("                                                    $(my).val(def, true);\r\n");
      out.write("                                                }\r\n");
      out.write("                                                huadong('.slider-minmax1', \"分钟\", \"5\", 30);\r\n");
      out.write("                                                huadong('.slider-minmax2', \"分钟\", \"6\", 15);\r\n");
      out.write("                                                huadong('.slider-minmax3', \"分钟\", \"10\", 60);\r\n");
      out.write("                                                huadong('.slider-minmax4', \"次\", \"2\", 10);\r\n");
      out.write("                                                huadong('.slider-minmax5', \"天\", \"3\", 7);\r\n");
      out.write("                                                huadong('.slider-minmax6', \"天\", \"8\", 10);\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/addProductN.jsp(138,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("productDelete");
    // /WEB-INF/addProductN.jsp(138,28) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/product/deleteProduct");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]++;
        _jspx_th_c_005furl_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005furl_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fparam_005f0(_jspx_th_c_005furl_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005furl_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]--;
      }
    }
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005furl_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_005fparam_005f0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005furl_005f0);
    // /WEB-INF/addProductN.jsp(139,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f0.setName("productId");
    // /WEB-INF/addProductN.jsp(139,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fparam_005f0 = _jspx_th_c_005fparam_005f0.doStartTag();
    if (_jspx_th_c_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/addProductN.jsp(141,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setVar("productModify");
    // /WEB-INF/addProductN.jsp(141,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/product/productModify");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_eval_c_005furl_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005furl_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]++;
        _jspx_th_c_005furl_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005furl_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fparam_005f1(_jspx_th_c_005furl_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005furl_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005furl_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]--;
      }
    }
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_005fparam_005f1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005furl_005f1);
    // /WEB-INF/addProductN.jsp(142,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f1.setName("productId");
    // /WEB-INF/addProductN.jsp(142,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Products.productId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fparam_005f1 = _jspx_th_c_005fparam_005f1.doStartTag();
    if (_jspx_th_c_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/addProductN.jsp(190,35) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("productModelHandle");
    // /WEB-INF/addProductN.jsp(190,35) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("POST");
    // /WEB-INF/addProductN.jsp(190,35) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t  \t\t\t<p>商品名称：<input type=\"text\" class=\"style1\" name=\"commodityName\" id=\"commodityName\"/></p><br>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>商品价格：<input type=\"text\" class=\"style1\" name=\"commodityPrice\" id=\"commodityPrice\"/></p><br>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>商品种类：\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"style2\" name=\"commodityType\" value=\"1\" id=\"commodityType\"/>水果&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"style2\" name=\"commodityType\" value=\"2\" id=\"commodityType\"/>蔬菜&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"style2\" name=\"commodityType\" value=\"3\" id=\"commodityType\"/>生鲜&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"style2\" name=\"commodityType\" value=\"4\" id=\"commodityType\"/>其他&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</p><br>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>商品描述：<input type=\"text\" class=\"style1\" name=\"commodityDescription\" id=\"commodityDescription\"/></p><br>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>商品数量：<input type=\"text\" class=\"style1\" name=\"commodityNumber\" id=\"commodityNumber\"/></p><br>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>商品产地：<input type=\"text\" class=\"style1\" name=\"commodityOrigin\" id=\"commodityOrigin\"/></p><br>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<p>商品图片：<input type=\"file\" class=\"style1\" required name=\"pic\" id=\"exampleInputFile\"/></p>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"style1\" value=\"Save\" class=\"save\" />\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fenctype_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
