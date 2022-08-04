<%@page import="kr.or.ddit.prod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function proc(id){
		location.href="/webpro/SelectById.do?id="+id;
	}
</script>
<style type="text/css">
	table{
		border:1px solid blue;
		text-align: center;
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
		List<LprodVO> list=(List<LprodVO>)request.getAttribute("searchByLgu");
	%>
	[
	<% 
		for(int i=0; i<list.size(); i++){
			LprodVO vo=list.get(i);
	%>
		{
			"gu" : "<%=vo.getLprod_gu() %>"
		}
	<%
		}
	%> 
	]
</body>
</html>