/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2017-08-06 00:10:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/career/bell%20Info/final%20project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/flights-car-reservation/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar", Long.valueOf(1500682600166L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1500682496543L));
    _jspx_dependants.put("jar:file:/D:/career/bell%20Info/final%20project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/flights-car-reservation/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1500565206000L));
    _jspx_dependants.put("jar:file:/D:/career/bell%20Info/final%20project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/flights-car-reservation/WEB-INF/lib/spring-webmvc-4.3.10.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1500565206000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("/* font-family: 'Open Sans', sans-serif; font-family: 'Roboto', sans-serif; */\r\n");
      out.write("body{    background: url(../images/body-bg.jpg) no-repeat center center;\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    } \r\n");
      out.write("*:focus{outline:none}\r\n");
      out.write("a:hover{text-decoration:none}\r\n");
      out.write(".wraper{width:100%;float:left;}\r\n");
      out.write(".header{width:100%;float:left;background:#fff;padding:10px 0;    box-shadow: 0 0 5px #000;}\r\n");
      out.write(".tabing{width:100%; float:left;}\r\n");
      out.write(".tabing ul{margin:0px; padding:0px;list-style:none;width:20%;    float: left;}\r\n");
      out.write(".tabing ul li{    float: left;\r\n");
      out.write("    text-align: left;background: rgba(10,22,37,.8);\r\n");
      out.write("    width: 100%;margin-bottom:1px;\r\n");
      out.write("}\r\n");
      out.write(".tabing ul li a{display: block;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    -webkit-transform: translateZ(0);\r\n");
      out.write("    transform: translateZ(0);\r\n");
      out.write("    box-shadow: 0 0 1px rgba(0, 0, 0, 0);\r\n");
      out.write("    -webkit-backface-visibility: hidden;\r\n");
      out.write("    backface-visibility: hidden;\r\n");
      out.write("    -moz-osx-font-smoothing: grayscale;\r\n");
      out.write("    -webkit-transition-duration: 0.3s;\r\n");
      out.write("    transition-duration: 0.3s;\r\n");
      out.write("    -webkit-transition-property: transform;\r\n");
      out.write("    transition-property: transform;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    -webkit-tap-highlight-color: rgba(0,0,0,0);\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("    text-align: center;}\r\n");
      out.write(".tabing ul li a.active {}\r\n");
      out.write(".tabing ul li a span {    display: block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-size: 28px;}\r\n");
      out.write(".tab1{float: left;width: 100%;color: #fff;text-align: left;font-size: 20px;line-height: 25px;display: none;text-transform: capitalize;background: rgba(10,22,37,.8);color:#000;}\r\n");
      out.write(".tab-content {float:left;    width:80%;}\r\n");
      out.write(".tab-content .triptype label{    font: 400 14px/20px \"Roboto\";\r\n");
      out.write("    width: auto;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    \r\n");
      out.write("    margin: 2px 10px;\r\n");
      out.write("    padding-bottom: 6px;cursor:pointer;}\r\n");
      out.write("\t.tab-content .triptype label.active{ \r\n");
      out.write("    border-bottom: 2px solid #ff6600;\r\n");
      out.write("    }\r\n");
      out.write(".tab-content .input-group label{font: 400 15px/28px \"Roboto\";margin: 0;width: 60px;text-align: left;}\r\n");
      out.write(".triptype{width: 100%;\r\n");
      out.write("    float: left;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin: 17px 0;}\r\n");
      out.write(".triptype input[type=\"radio\"]{    font-size: 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    left: -9999px;}\r\n");
      out.write(".ctrl i{    position: absolute;\r\n");
      out.write("    top: 9px;\r\n");
      out.write("    left: 24px;\r\n");
      out.write("    color: #ccc;\r\n");
      out.write("    font-size: 23px;}\r\n");
      out.write(".ctrl .form-control{    border: none;\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    padding: 8px 8px 8px 40px;\r\n");
      out.write("    line-height: 25px;}\r\n");
      out.write(".tab1.active{display:block}\r\n");
      out.write(".select-wrap{    width: 100%;\r\n");
      out.write("    float: left;\r\n");
      out.write("    padding: 0 15px;}\r\n");
      out.write(".select-wrap .adult-box{width:48%; float:left;margin-right:16px;}\r\n");
      out.write(".select-wrap.prefered-airline .adult-box{width:100%; float:left;margin-right:16px;margin-top:20px;}\r\n");
      out.write(".select-wrap .airport-box{width:100%; float:left;margin-right:16px;}\r\n");
      out.write(".select-wrap .adult-box:last-child{margin-right:0px;}\r\n");
      out.write(".select-wrap .adult-box select{    width: 100%;\r\n");
      out.write("    padding: 10px 6px 10px 5px;\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("    font: 400 12px/14px \"Roboto\";\r\n");
      out.write("    margin-top: 2px;\r\n");
      out.write("    border: none;}\r\n");
      out.write(".select-wrap span {display:block  ;  font: 400 14px/15px \"Roboto\";    margin:0px 0 0 0;  text-align: left;width:100%;color:#fff;}\r\n");
      out.write("\t.srch{    border: none;\r\n");
      out.write("    background: #ff6600;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 6px 15px;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    font: 400 20px/26px \"Roboto\";\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    text-transform: uppercase;margin-bottom:15px;}\r\n");
      out.write("\t/*calender*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".align{\r\n");
      out.write("\r\n");
      out.write("color:white;\r\n");
      out.write("     font-size:15px;\r\n");
      out.write("}\r\n");
      out.write(".bt{\r\n");
      out.write("\r\n");
      out.write("text-align:center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\">Reservations</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("    \t <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/contact\">Contact</a></li>\r\n");
      out.write("      <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/register\"><span class=\"glyphicon glyphicon-user\"></span> Register</a></li>\r\n");
      out.write("   <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container col-sm-offset-4\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-8 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tabing\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"1\" class=\"tab1 active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/search\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"triptype\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"rndTrip\"><input type=\"radio\" name=\"Round\" value=\"RoundTrip\" > Round Trip</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"oneTrip active\"><input type=\"radio\" name=\"Round\" value=\"OneWay\" checked> OneWay</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-wrap prefered-airline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"adult-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Please select the origin city</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"origin\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"JFK\">New York</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"IAD\">Washington, Dulles</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"ATL\">Altanta</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"DFW\">Dallas</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"SFO\">San Fransico</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"SEA\">Seattle</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"MIA\">Miami</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"MCI\">Kansas</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"LAS\">Las Vegas</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"ORD\">Chicago</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-wrap prefered-airline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"adult-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Please select the destination city</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"dest\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"JFK\">New York</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"IAD\">Washington, Dulles</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"ATL\">Altanta</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"DFW\">Dallas</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"SFO\">San Fransico</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"SEA\">Seattle</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"MIA\">Miami</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"MCI\">Kansas</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"LAS\">Las Vegas</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"ORD\">Chicago</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 col-xs-6 ctrl\" style=\"margin-top:20px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"align\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>Departure</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"depart\" type=\"text\" class=\"form-control\" name=\"depart\" value=\"\" placeholder=\"yyyy-mm-dd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6 col-xs-6 ctrl hide_one-trip\" style=\"margin-top:20px\"\t>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"align\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label>Return</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"airport_city_Return\" type=\"text\" disabled=\"true\" class=\"form-control\" name=\"reverse\" value=\"\" placeholder=\"yyyy-mm-dd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"select-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"adult-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Adult</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"adult\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"adult-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Child</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"child\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"srch\" value=\"Search Flights\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form> \r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t</html>\r\n");
      out.write("\t");
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
