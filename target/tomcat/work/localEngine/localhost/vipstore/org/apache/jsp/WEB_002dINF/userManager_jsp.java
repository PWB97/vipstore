package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"ch\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("        <meta name=\"format-detection\" content=\"telephone=no\">\n");
      out.write("        <title>后台管理</title>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function() {\n");
      out.write("                $(\".meun-item\").click(function() {\n");
      out.write("                    $(\".meun-item\").removeClass(\"meun-item-active\");\n");
      out.write("                    $(this).addClass(\"meun-item-active\");\n");
      out.write("                    var itmeObj = $(\".meun-item\").find(\"img\");\n");
      out.write("                    itmeObj.each(function() {\n");
      out.write("                        var items = $(this).attr(\"src\");\n");
      out.write("                        items = items.replace(\"_grey.png\", \".png\");\n");
      out.write("                        items = items.replace(\".png\", \"_grey.png\")\n");
      out.write("                        $(this).attr(\"src\", items);\n");
      out.write("                    });\n");
      out.write("                    var attrObj = $(this).find(\"img\").attr(\"src\");\n");
      out.write("                    ;\n");
      out.write("                    attrObj = attrObj.replace(\"_grey.png\", \".png\");\n");
      out.write("                    $(this).find(\"img\").attr(\"src\", attrObj);\n");
      out.write("                });\n");
      out.write("                $(\"#topAD\").click(function() {\n");
      out.write("                    $(\"#topA\").toggleClass(\" glyphicon-triangle-right\");\n");
      out.write("                    $(\"#topA\").toggleClass(\" glyphicon-triangle-bottom\");\n");
      out.write("                });\n");
      out.write("                $(\"#topBD\").click(function() {\n");
      out.write("                    $(\"#topB\").toggleClass(\" glyphicon-triangle-right\");\n");
      out.write("                    $(\"#topB\").toggleClass(\" glyphicon-triangle-bottom\");\n");
      out.write("                });\n");
      out.write("                $(\"#topCD\").click(function() {\n");
      out.write("                    $(\"#topC\").toggleClass(\" glyphicon-triangle-right\");\n");
      out.write("                    $(\"#topC\").toggleClass(\" glyphicon-triangle-bottom\");\n");
      out.write("                });\n");
      out.write("                $(\".toggle-btn\").click(function() {\n");
      out.write("                    $(\"#leftMeun\").toggleClass(\"show\");\n");
      out.write("                    $(\"#rightContent\").toggleClass(\"pd0px\");\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/html5shiv.min.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/common.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/slide.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/flat-ui.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/jquery.nouislider.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <!-- 左侧菜单栏目块 -->\n");
      out.write("            <div class=\"leftMeun\" id=\"leftMeun\">\n");
      out.write("                <div id=\"logoDiv\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"meun-title\">账号管理</div>\n");
      out.write("                <div class=\"meun-item meun-item-active\" href=\"#user\" aria-controls=\"user\" role=\"tab\" data-toggle=\"tab\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_user_grey.png\">用户管理</div>\n");
      out.write("\t\t\t\t<div class=\"meun-item\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/user/allowUser\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_user_grey.png\">通过用户申请</a></div>\n");
      out.write("                <div class=\"meun-title\">商品管理</div>\n");
      out.write("                <div class=\"meun-item\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/product/showProduct\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_card_grey.png\">商品信息</a></div>\n");
      out.write("\t\t\t\t<div class=\"meun-title\">资讯管理</div>\n");
      out.write("\t\t\t\t<div class=\"meun-item\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/showNews\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/icon_card_grey.png\">资讯信息</a></div>\n");
      out.write("            </div>\n");
      out.write("            <!-- 右侧具体内容栏目 -->\n");
      out.write("        <div id=\"rightContent\">\n");
      out.write("                <a class=\"toggle-btn\" id=\"nimei\">\n");
      out.write("                    <i class=\"glyphicon glyphicon-align-justify\"></i>\n");
      out.write("                </a>\n");
      out.write("                <!-- Tab panes -->\n");
      out.write("        <div class=\"tab-content\">\n");
      out.write("                    \n");
      out.write("            <!--用户管理模块-->\n");
      out.write("            <div role=\"tabpanel\" class=\"tab-pane\" id=\"user\">\n");
      out.write("                <div class=\"data-div\">\n");
      out.write("                    <div class=\"row tableHeader\">\n");
      out.write("                        <div class=\"col-xs-1 \">\n");
      out.write("                            用户名\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-1\">\n");
      out.write("                            真实姓名\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-1\">\n");
      out.write("                            电话\n");
      out.write("                        </div>\n");
      out.write("                       <div class=\"col-xs-1\">\n");
      out.write("                            性别\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-1\">\n");
      out.write("                            地址\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-1\">\n");
      out.write("                            状态\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-2\">\n");
      out.write("                            操作\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/userManager.jsp(110,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/userManager.jsp(110,20) '${users}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${users}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/userManager.jsp(110,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("user");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    \t <div class=\"tablebody\">\n");
            out.write("                        <div class=\"row\">\n");
            out.write("                            <div class=\"col-xs-1 \">\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                            <div class=\"col-xs-1\">\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                            <div class=\"col-xs-1\">\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                            <div class=\"col-xs-1\">\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                            <div class=\"col-xs-1\">\n");
            out.write("                                ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                            <div class=\"col-xs-1\">\n");
            out.write("                               \t");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\n");
            out.write("                            </div>\n");
            out.write("                            <div class=\"col-xs-2\">\n");
            out.write("                                <a class=\"btn btn-danger btn-xs\" href=\"");
            out.print(request.getContextPath() );
            out.write("/user/userManager/delete?userId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">删除</a>\n");
            out.write("                            </div>\n");
            out.write("                        </div>\n");
            out.write("\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t");
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
      out.write("                   \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!--页码块-->\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("                        <li>\n");
      out.write("                            <select>\n");
      out.write("                                <option>1</option>\n");
      out.write("                                <option>2</option>\n");
      out.write("                                <option>3</option>\n");
      out.write("                                <option>4</option>\n");
      out.write("                                <option>5</option>\n");
      out.write("                                <option>6</option>\n");
      out.write("                                <option>7</option>\n");
      out.write("                                <option>8</option>\n");
      out.write("                                <option>9</option>\n");
      out.write("                                <option>10</option>\n");
      out.write("                            </select>\n");
      out.write("                            页\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"gray\">\n");
      out.write("                            共20页\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"glyphicon glyphicon-menu-left\">\n");
      out.write("                            </i>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <i class=\"glyphicon glyphicon-menu-right\">\n");
      out.write("                            </i>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--弹出删除用户警告窗口-->\n");
      out.write("                <div class=\"modal fade\" id=\"deleteUser\" role=\"dialog\" aria-labelledby=\"gridSystemModalLabel\">\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                                <h4 class=\"modal-title\" id=\"gridSystemModalLabel\">提示</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <div class=\"container-fluid\">\n");
      out.write("                                    确定要删除该用户？删除后不可恢复！\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-xs btn-white\" data-dismiss=\"modal\">取 消</button>\n");
      out.write("                                <button type=\"button\" class=\"btn  btn-xs btn-danger\">保 存</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.modal-content -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.modal-dialog -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.modal -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.nouislider.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("                                                //min/max slider\n");
      out.write("                                                function huadong(my, unit, def, max) {\n");
      out.write("                                                    $(my).noUiSlider({\n");
      out.write("                                                        range: [0, max],\n");
      out.write("                                                        start: [def],\n");
      out.write("                                                        handles: 1,\n");
      out.write("                                                        connect: 'upper',\n");
      out.write("                                                        slide: function() {\n");
      out.write("                                                            var val = Math.floor($(this).val());\n");
      out.write("                                                            $(this).find(\".noUi-handle\").text(\n");
      out.write("                                                                    val + unit\n");
      out.write("                                                                    );\n");
      out.write("                                                            console.log($(this).find(\".noUi-handle\").parent().parent().html());\n");
      out.write("                                                        },\n");
      out.write("                                                        set: function() {\n");
      out.write("                                                            var val = Math.floor($(this).val());\n");
      out.write("                                                            $(this).find(\".noUi-handle\").text(\n");
      out.write("                                                                    val + unit\n");
      out.write("                                                                    );\n");
      out.write("                                                        }\n");
      out.write("                                                    });\n");
      out.write("                                                    $(my).val(def, true);\n");
      out.write("                                                }\n");
      out.write("                                                huadong('.slider-minmax1', \"分钟\", \"5\", 30);\n");
      out.write("                                                huadong('.slider-minmax2', \"分钟\", \"6\", 15);\n");
      out.write("                                                huadong('.slider-minmax3', \"分钟\", \"10\", 60);\n");
      out.write("                                                huadong('.slider-minmax4', \"次\", \"2\", 10);\n");
      out.write("                                                huadong('.slider-minmax5', \"天\", \"3\", 7);\n");
      out.write("                                                huadong('.slider-minmax6', \"天\", \"8\", 10);\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
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
}
