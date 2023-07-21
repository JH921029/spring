<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>점수목록</h3>
	
	<c:forEach var="vo" items="${list}" varStatus="num">
		${num.index}<br/>
		${vo.name }<br/>
		${vo.kor }<br/>
		${vo.eng }<br/>
		<button onClick="location.href='scoreDelete?num=${num.index}'">삭제</button>
	<hr/>
	</c:forEach>
	
	<a href="scoreRegist">점수 등록하기</a>
</body>
</html>