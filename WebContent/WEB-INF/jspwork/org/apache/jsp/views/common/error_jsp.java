/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-02-25 01:42:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.Member;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1582594892966L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');

	String message = (String)request.getAttribute("msg");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

	Member loginUser = (Member)session.getAttribute("loginUser");

	String msg = (String)session.getAttribute("msg");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground:url('");
      out.print( request.getContextPath() );
      out.write("/resources/images/city1.png') no-repeat;\r\n");
      out.write("\t\tbackground-size: cover;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/* 로그인 폼 관련 스타일 */\r\n");
      out.write("\t#loginForm, #userInfo {float:right}\r\n");
      out.write("\t.btns>button {border-radius:5px;}\r\n");
      out.write("\t#enrollBtn, #mypageBtn {background-color:purple; color:white;}\r\n");
      out.write("\t#loginBtn, #logoutBtn {background-color:purple; color:white;}\r\n");
      out.write("\r\n");
      out.write("\t/* 메뉴바 영역 관련 스타일 */\r\n");
      out.write("\t.navWrap{background-color: darkblue; width:100%; height:50px;}\r\n");
      out.write("\t.nav{width:600px; margin-right:auto; margin-left:auto; align:center;} /*중앙배열*/\r\n");
      out.write("\t.menu{color:white; font-size:20px; font-weight:bold; display:table-cell;\r\n");
      out.write("\t\twidth:150px; text-align:center; height:50px; vertical-align:middle;}\r\n");
      out.write("\t.menu:hover{\r\n");
      out.write("\t\tcursor:pointer; background-color:black; color:yellow;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\t// var msg = \"회원 가입 성공!\" , \"성공적으로 회원정보를 수정했습니다!\"\r\n");
      out.write("\tvar msg = \"");
      out.print( msg );
      out.write("\";\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tif(msg != \"null\"){\r\n");
      out.write("\t\t\talert(msg);\r\n");
      out.write("\t\t\t//세션에 담긴 메세지 한번만 출력하고 삭제하기\r\n");
      out.write("\t\t\t");
 session.removeAttribute("msg"); 
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tfunction loginValidate(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#userId\").val().trim().length==0){\r\n");
      out.write("\t\t\talert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#userPwd\").val().trim().length==0){\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력하세요\");\r\n");
      out.write("\t\t\t$(\"#userPwd\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 align=\"center\"> Welcome JSP World!! </h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 로그인 폼 영역 -->\r\n");
      out.write("\t<div class=\"loginArea\">\r\n");
      out.write("\t");
 if(loginUser == null){ 
      out.write("\r\n");
      out.write("\t\t<form id=\"loginForm\" action=\"");
      out.print( request.getContextPath() );
      out.write("/login.me\"\r\n");
      out.write("\t\t\t\t\t\t\t method=\"post\" onsubmit=\"return loginValidate();\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th><label for=\"userId\">아이디: </label></th>\r\n");
      out.write("\t\t\t\t\t<td><input id=\"userId\" type=\"text\" name=\"userId\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th><label for=\"userPwd\">비밀번호: </label></th>\r\n");
      out.write("\t\t\t\t\t<td><input id=\"userPwd\" type=\"password\" name=\"userPwd\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t<button id=\"enrollBtn\" type=\"button\" onclick=\"enrollPage();\">회원가입</button>\r\n");
      out.write("\t\t\t\t<!-- button은 type지정 안하면 submit이 디폴트임 / 회원가입해주려면 type=\"button\"지정필수 -->\r\n");
      out.write("\t\t\t\t<button id=\"loginBtn\" type=\"submit\">로그인</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
}else { 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"userInfo\">\r\n");
      out.write("\t\t\t<label>");
      out.print( loginUser.getUserName() );
      out.write("님의 방문을 환영합니다</label><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t<button id=\"mypageBtn\" onclick=\"myPage();\">마이페이지</button>\r\n");
      out.write("\t\t\t\t<button id=\"logoutBtn\" onclick=\"logout();\">로그아웃</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction logout(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/logout.me\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction myPage(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/myPage.me\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<br clear=\"both\"> <!-- 위의 요소 아래 배치 -->\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 메뉴바 영역 -->\r\n");
      out.write("\t<div class=\"navWrap\">\r\n");
      out.write("\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"\">HOME</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"\">공지사항</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"\">일반게시판</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"\">사진게시판</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<h1 align=\"center\" style=\"color:white\">");
      out.print( message );
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
