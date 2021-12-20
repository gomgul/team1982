<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>board.jsp</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/FortAwesome/Font-Awesome@5.14.0/css/all.min.css">
  	<link type="text/css" href="/project1982/resources/style/style.css" rel="stylesheet"/>
    <link type="text/css" href="/project1982/resources/style/header.css" rel="stylesheet"/>
</head>
<body>
        <!--메뉴바  ------------------------------------------------->
        <header class="header" >
            <!-- 로고-->
               <div>
               <a href="userMain.do" class="logo">
                   <h1>1982</h1>
               </a>
               </div>
               <!--메뉴--> 
             
               
               <!-- 오른쪽 메뉴-->
               <div class="right-menu">
                   <!--검색 -->
                   <a href="storeClose.do" class="search">
                   일자리찾기
                   </a>
                   <!--유저 -->
                   <a href="userMypage.do" class="user">
                   마이페이지
                   </a>
                   <!--카트  -->
                   <a href="userBoard.do">
                   고객센터
                       <!--카트 상품-->
                       
                   </a>
               </div>
   
           </header>

    <!-- 메인 ---------------------------------------------------------------->
        <main>
            <ul class="left_nav">
                <li class="left_nav_text"><a class="home" href="userMain.do">홈</a></li>
            </ul>

            <div class="body_container"> <!-- 페이지 컨테이너 시작-->
             
                <div class="body_container_center"> <!-- 중간 메뉴바 시작-->
                   <div class="body_container_center_title"> 고객센터</div>
                   <div class="search_input">
                   
                   <!-- 검색부분 추가 -->
                   <form action='getBoardList.do' method='get'>
                       <select name="" id="" >
                           <option value="title">제목</option>
                           <option value="content">내용</option>
                           <option value="writer">작성자</option>
                        </select>
						<input type='text' name='searchKeyword'>
						<input type='submit' value='검색'>
					</form>
                   </div>
                   
         <table border="1">
			<tr id="table_th">
				<th bgcolor="orange" width="10" >번호</th>
				<th bgcolor="orange" width="20" >제목</th>
				<th bgcolor="orange" width="15" >작성자</th>
				<th bgcolor="orange" width="15" >등록일</th>
				<th bgcolor="orange" width="10" >조회수</th>
				<!-- 추가 -->	
			</tr>
			<c:forEach items="${boardList}" var="board">
				<!-- 프라퍼티이름 변경 -->
				<tr>
					<td>${board.b_id }</td>
					<td align="left"><a href="getBoard.do?b_id=${board.b_id }">
							${board.b_title }</a></td>
					<td>${board.b_name }</td>
					<td>${board.b_date }</td>
					<td>${board.b_count }</td>
					<!-- 추가 -->
				</tr>
			</c:forEach>
		</table>
		<br> <a href="insertBoard.do">새글 등록</a>
                   
                       <div class="links">
                        <a href="#">&laquo;</a>
                            <a class="active" href="#">1</a> 
                            <a href="#">2</a> 
                            <a href="#">3</a> 
                            <a href="#">4</a> 
                        <a href="#">&raquo;</a>
                        </div>
                   </div>
                </div><!--중간 메뉴바 종료-->
               
           
            </div><!-- 페이지 컨테이너 종료--       
        
        </main>
        
        
        
        
        
        
        
        
        
        
        
 






<!-- footer --------------------------------------------------------------------->
    <footer>
        <div id="footer">
            <div class="wrap_inner">
                <div class="left_area">
                    <h4 class="rap_inner_h4">
                        일구하자 1982
                    </h4>
                    <div class="left_text">
                        <div class="left_text_margin">
                            <h5>고객센터</h5>
                            <p class="left_phone">1566-1982</p>
                            <p> 
                                <div>평일 AM 09:00 ~ PM 05:30</div>
                                <div>점심 PM 12:00 ~ PM 01:00</div>
                            </p>
                        </div>
                    </div>
                    <div class="footer_icon">
                        <div><a href="#"><i class="fab fa-facebook-f fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                        <div><a href="#"><i class="fab fa-twitter fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                        <div><a href="#"><i class="fab fa-youtube fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                        <div><a href="#"><i class="fab fa-instagram fa-2x" style="color:rgba(0,0,0,0.5)"></i></a></div>
                    </div>
                </div>


                <div class="right_area">
                    <div class="right_ul">
                        <p>이용약관 | </p>
                        <p>개인정보처리방침 | </p>
                        <p>일구하자 이용안내 | </p>
                        <p>고객요청</p>
                    </div>
                    <div class="right_address">
                        <p>
                            <span>주식회사 1982 |</span>
                            <a href="#">

                                <span>대표이사 : 한세호 |</span>
                            </a>
                                <span>사업자등록번호 : 123-12-12345</span>
                            </p>
                        <p>
                            <span>통신판매업신고 : 2021-서울가산-1982 |</span>
                            <span>WEBMASTER : 한세호</span>
                        </p>
                        <p>
                            <span>주소 : 00000 서울 금천구 벚꽃로 309 </span>
                        </p>
                        <p>
                            <span>TEL : 1566-1982</span>
                            <span>E - mail : 1982@seho.co.kr</span>
                            <span>호스팅제공자 : 코스모(주)</span>
                        </p>
                    </div>
                    <p class="right_copyright">
                        Copyright by
                        <span>일구하자 1982</span>
                        all rights reserved.
                    </p>
                </div>        
            </div>
        </div>

    </footer>

</body>
</html>