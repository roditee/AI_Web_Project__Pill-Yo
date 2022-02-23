<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>마이 페이지 메뉴</title>
		<link rel="stylesheet" href="/css/layout/myPage.css" />
		<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
		<script src="<c:url value='/js/drugShapeSearchForm.js'/>"></script>
	</head>
	<body>
		
	
			
			<div id="myPageMenuBox">
			<ul id="myPageItemBox">
				<li><a href="<c:url value='/updateMemberForm'/>">개인정보 수정</a></li>
				<li><a href="">나의 건강정보</a></li>
				<li><a href="">구매내역</a></li>
				<li><a href="javascript:deleteCheck();">회원탈퇴</a></li>
				<li><a href="">로그아웃</a></li>
			</ul>
			</div>
			
			<script type="text/javascript">
				function deleteCheck(){
					var answer = confirm("정말로 회원을 탈퇴하시겠습니까?");
					if(answer == true){
						location.href="<c:url value='/deleteUser/${sessionScope.sid}' />";
					}
				}
			</script>
		
						
	</body>
</html>