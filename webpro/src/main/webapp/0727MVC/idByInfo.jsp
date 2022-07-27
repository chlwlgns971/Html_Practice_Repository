<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border:1px solid blue;
	}
	td{
		width: 100px;
		height: 50px;	
	}
</style>
</head>
<body>
	<%
		//서블릿에서 저장한 공유 데이터
		MemberVO vo=(MemberVO)request.getAttribute("searchId");
		if(vo!=null){
	%>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><%=vo.getMEM_ID() %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=vo.getMEM_NAME() %></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><%=vo.getMEM_HP() %></td>
		</tr>
		<tr>
			<td>메일</td>
			<td><%=vo.getMEM_MAIL() %></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=vo.getMEM_ADD1() %></td>
		</tr>
	</table>	
	<%
		}
	%> 
</body>
</html>