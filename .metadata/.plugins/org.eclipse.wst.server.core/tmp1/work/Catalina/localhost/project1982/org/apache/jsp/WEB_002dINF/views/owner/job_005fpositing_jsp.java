/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2021-12-17 08:59:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.owner;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class job_005fpositing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>job_positing.jsp</title>              <button>수정 </button>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/gh/FortAwesome/Font-Awesome@5.14.0/css/all.min.css\">\r\n");
      out.write("\t<link type=\"text/css\" href=\"/project1982/resources/style/style.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link type=\"text/css\" href=\"/project1982/resources/style/header.css\" rel=\"stylesheet\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        <!--메뉴바  ------------------------------------------------->\r\n");
      out.write("        <header class=\"header\" >\r\n");
      out.write("            <!-- 로고-->\r\n");
      out.write("               <div>\r\n");
      out.write("               <a href=\"../main.do\" class=\"logo\">\r\n");
      out.write("                   <h1>1982</h1>\r\n");
      out.write("               </a>\r\n");
      out.write("               </div>\r\n");
      out.write("               <!--메뉴--> \r\n");
      out.write("             \r\n");
      out.write("               \r\n");
      out.write("               <!-- 오른쪽 메뉴-->\r\n");
      out.write("               <div class=\"right-menu\">\r\n");
      out.write("                   <!--검색 -->\r\n");
      out.write("                   <a href=\"../user/storeClose.do\" class=\"search\">\r\n");
      out.write("                   일자리찾기\r\n");
      out.write("                   </a>\r\n");
      out.write("                   <a href=\"job_positing.do\" class=\"search\">\r\n");
      out.write("                    구인공고\r\n");
      out.write("                   </a>\r\n");
      out.write("                   <!--유저 -->\r\n");
      out.write("                   <a href=\"../user/userMypage.do\" class=\"user\">\r\n");
      out.write("                   마이페이지\r\n");
      out.write("                   </a>\r\n");
      out.write("                   <!--카트  -->\r\n");
      out.write("                   <a href=\"../board.do\">\r\n");
      out.write("                   고객센터\r\n");
      out.write("                       <!--카트 상품-->\r\n");
      out.write("                       \r\n");
      out.write("                   </a>\r\n");
      out.write("               </div>\r\n");
      out.write("   \r\n");
      out.write("           </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- 메인 ---------------------------------------------------------------->\r\n");
      out.write("        <main>\r\n");
      out.write("            <ul class=\"left_nav\">\r\n");
      out.write("                <li class=\"left_nav_text\"><a class=\"home\" href=\"#\">홈</a></li>\r\n");
      out.write("                <li class=\"left_nav_text\"><a href=\"#\">새소식</a></li>\r\n");
      out.write("                <li class=\"left_nav_text\"><a href=\"#\">상품</a></li>\r\n");
      out.write("                <li class=\"left_nav_text\"><a href=\"#\">회사</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"body_container\"> <!-- 페이지 컨테이너 시작-->\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"body_container_center\"> <!-- 중간 메뉴바 시작-->\r\n");
      out.write("                    <div>구인공고</div>\r\n");
      out.write("                    <div>나의 매장 : \r\n");
      out.write("                        <select name=\"\" id=\"\">\r\n");
      out.write("                            <option value=\"\">가산1호점</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>근무 날짜 :\r\n");
      out.write("                        <select name=\"\" id=\"\">\r\n");
      out.write("                            <option value=\"\">2021</option>\r\n");
      out.write("                            <option value=\"\">2022</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"\" id=\"\">\r\n");
      out.write("                            <option value=\"\">1</option>\r\n");
      out.write("                            <option value=\"\">2</option>\r\n");
      out.write("                            <option value=\"\">3</option>\r\n");
      out.write("                            <option value=\"\">4</option>\r\n");
      out.write("                            <option value=\"\">5</option>\r\n");
      out.write("                            <option value=\"\">6</option>\r\n");
      out.write("                            <option value=\"\">7</option>\r\n");
      out.write("                            <option value=\"\">8</option>\r\n");
      out.write("                            <option value=\"\">9</option>\r\n");
      out.write("                            <option value=\"\">10</option>\r\n");
      out.write("                            <option value=\"\">11</option>\r\n");
      out.write("                            <option value=\"\">12</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"\" id=\"\">\r\n");
      out.write("                            <option value=\"\">1</option>\r\n");
      out.write("                            <option value=\"\">2</option>\r\n");
      out.write("                            <option value=\"\">3</option>\r\n");
      out.write("                            <option value=\"\">4</option>\r\n");
      out.write("                            <option value=\"\">5</option>\r\n");
      out.write("                            <option value=\"\">6</option>\r\n");
      out.write("                            <option value=\"\">7</option>\r\n");
      out.write("                            <option value=\"\">8</option>\r\n");
      out.write("                            <option value=\"\">9</option>\r\n");
      out.write("                            <option value=\"\">10</option>\r\n");
      out.write("                            <option value=\"\">11</option>\r\n");
      out.write("                            <option value=\"\">12</option>\r\n");
      out.write("                            <option value=\"\">13</option>\r\n");
      out.write("                            <option value=\"\">14</option>\r\n");
      out.write("                            <option value=\"\">15</option>\r\n");
      out.write("                            <option value=\"\">16</option>\r\n");
      out.write("                            <option value=\"\">17</option>\r\n");
      out.write("                            <option value=\"\">18</option>\r\n");
      out.write("                            <option value=\"\">19</option>\r\n");
      out.write("                            <option value=\"\">20</option>\r\n");
      out.write("                            <option value=\"\">21</option>\r\n");
      out.write("                            <option value=\"\">22</option>\r\n");
      out.write("                            <option value=\"\">23</option>\r\n");
      out.write("                            <option value=\"\">24</option>\r\n");
      out.write("                            <option value=\"\">25</option>\r\n");
      out.write("                            <option value=\"\">26</option>\r\n");
      out.write("                            <option value=\"\">27</option>\r\n");
      out.write("                            <option value=\"\">28</option>\r\n");
      out.write("                            <option value=\"\">29</option>\r\n");
      out.write("                            <option value=\"\">30</option>\r\n");
      out.write("                            <option value=\"\">31</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>급여 :\r\n");
      out.write("                        <input type=\"text\" placeholder=\"* 상세하게 적어주세요\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>우대사항 :\r\n");
      out.write("                        <input type=\"text\" placeholder=\" 내용을 입력해주세요\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>필요인원 :\r\n");
      out.write("                        <input type=\"text\" placeholder=\" 내용을 입력해주세요\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>상세내용 :\r\n");
      out.write("                        <textarea name=\"\" id=\"\" cols=\"30\" rows=\"10\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <button>긴급</button> <button>일일</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"divTable minimalistBlack\">\r\n");
      out.write("                        <div class=\"divTableHeading\">\r\n");
      out.write("                            <div class=\"divTableRow\">\r\n");
      out.write("                                <div class=\"divTableHead\">번호</div>\r\n");
      out.write("                                <div class=\"divTableHead\">긴급 / 일일</div>\r\n");
      out.write("                                <div class=\"divTableHead\">매장 이름</div>\r\n");
      out.write("                                <div class=\"divTableHead\">날짜</div>\r\n");
      out.write("                                <div class=\"divTableHead\">근무 시간</div>\r\n");
      out.write("                                <div class=\"divTableHead\">필요 인원</div>    \r\n");
      out.write("                                <div class=\"divTableHead\">공고취소</div> \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                            <div class=\"divTableBody\">\r\n");
      out.write("                            <div class=\"divTableRow\">\r\n");
      out.write("                            <div class=\"divTableCell\">cell1_1</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell2_1</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell3_1</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell4_1</div>\r\n");
      out.write("                            <div class=\"divTableCell\">근무태만</div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>영구 정지</button></div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>취소</button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"divTableRow\">\r\n");
      out.write("                            <div class=\"divTableCell\">cell1_2</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell2_2</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell3_2</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell4_2</div>\r\n");
      out.write("                            <div class=\"divTableCell\">지가사장인줄암</div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>영구 정지</button></div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>취소</button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"divTableRow\">\r\n");
      out.write("                            <div class=\"divTableCell\">cell1_3</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell2_3</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell3_3</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell4_3</div>\r\n");
      out.write("                            <div class=\"divTableCell\">잠수</div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>영구 정지</button></div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>취소</button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"divTableRow\">\r\n");
      out.write("                            <div class=\"divTableCell\">cell1_4</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell2_4</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell3_4</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell4_4</div>\r\n");
      out.write("                            <div class=\"divTableCell\">싹퉁바가지</div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>영구 정지</button></div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>취소</button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"divTableRow\">\r\n");
      out.write("                            <div class=\"divTableCell\">cell1_5</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell2_5</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell3_5</div>\r\n");
      out.write("                            <div class=\"divTableCell\">cell4_5</div>\r\n");
      out.write("                            <div class=\"divTableCell\">범죄</div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>영구 정지</button></div>\r\n");
      out.write("                            <div class=\"divTableCell\"><button>취소</button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            </div>\r\n");
      out.write("                           \r\n");
      out.write("                            </div>\r\n");
      out.write("           \r\n");
      out.write("                </div><!--중간 메뉴바 종료-->\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("            </div><!-- 페이지 컨테이너 종료--       \r\n");
      out.write("        \r\n");
      out.write("        </main>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- footer --------------------------------------------------------------------->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            <div class=\"wrap_inner\">\r\n");
      out.write("                <div class=\"left_area\">\r\n");
      out.write("                    <h4 class=\"rap_inner_h4\">\r\n");
      out.write("                        일구하자 1982\r\n");
      out.write("                    </h4>\r\n");
      out.write("                    <div class=\"left_text\">\r\n");
      out.write("                        <div class=\"left_text_margin\">\r\n");
      out.write("                            <h5>고객센터</h5>\r\n");
      out.write("                            <p class=\"left_phone\">1566-1982</p>\r\n");
      out.write("                            <p> \r\n");
      out.write("                                <div>평일 AM 09:00 ~ PM 05:30</div>\r\n");
      out.write("                                <div>점심 PM 12:00 ~ PM 01:00</div>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"footer_icon\">\r\n");
      out.write("                        <div><a href=\"#\"><i class=\"fab fa-facebook-f fa-2x\" style=\"color:rgba(0,0,0,0.5)\"></i></a></div>\r\n");
      out.write("                        <div><a href=\"#\"><i class=\"fab fa-twitter fa-2x\" style=\"color:rgba(0,0,0,0.5)\"></i></a></div>\r\n");
      out.write("                        <div><a href=\"#\"><i class=\"fab fa-youtube fa-2x\" style=\"color:rgba(0,0,0,0.5)\"></i></a></div>\r\n");
      out.write("                        <div><a href=\"#\"><i class=\"fab fa-instagram fa-2x\" style=\"color:rgba(0,0,0,0.5)\"></i></a></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"right_area\">\r\n");
      out.write("                    <div class=\"right_ul\">\r\n");
      out.write("                        <p>이용약관 | </p>\r\n");
      out.write("                        <p>개인정보처리방침 | </p>\r\n");
      out.write("                        <p>일구하자 이용안내 | </p>\r\n");
      out.write("                        <p>고객요청</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"right_address\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <span>주식회사 1982 |</span>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("\r\n");
      out.write("                                <span>대표이사 : 한세호 |</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                                <span>사업자등록번호 : 123-12-12345</span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <span>통신판매업신고 : 2021-서울가산-1982 |</span>\r\n");
      out.write("                            <span>WEBMASTER : 한세호</span>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <span>주소 : 00000 서울 금천구 벚꽃로 309 </span>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <span>TEL : 1566-1982</span>\r\n");
      out.write("                            <span>E - mail : 1982@seho.co.kr</span>\r\n");
      out.write("                            <span>호스팅제공자 : 코스모(주)</span>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"right_copyright\">\r\n");
      out.write("                        Copyright by\r\n");
      out.write("                        <span>일구하자 1982</span>\r\n");
      out.write("                        all rights reserved.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>        \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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