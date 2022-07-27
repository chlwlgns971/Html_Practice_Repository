<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function proc1(id){
		location.href="/webpro/IDSearch?id="+id;
	}
</script>
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
	//서블릿에서 저장된 데이터 꺼내기
	List<MemberVO> list=(List<MemberVO>)request.getAttribute("searchAllList");
	
%>
<table border="1">
	<tr>
		<td>아이디</td>
		<td>이름</td>	
	</tr>
	<%
		for(int i=0; i<list.size(); i++){
			MemberVO vo=list.get(i);
	%>
	<tr>
		<td><a href="#" onclick="javascript:proc1('<%= vo.getMEM_ID()%>');"><%= vo.getMEM_ID()%></a></td>
		<td><%= vo.getMEM_NAME()%></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>