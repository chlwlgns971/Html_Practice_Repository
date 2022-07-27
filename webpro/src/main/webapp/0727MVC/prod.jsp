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
		List<ProdVO> list=(List<ProdVO>)request.getAttribute("searchByLgu");
	%>
		<table border="1">
			<tr>
				<td>상품코드</td>
				<td>상품이름</td>
				
			</tr>
	<% 
		for(int i=0; i<list.size(); i++){
			ProdVO vo=list.get(i);
	%>
			<tr>
				<td><a href="#" onclick="javascript:proc('<%=vo.getProd_id() %>');"><%=vo.getProd_id() %></a></td>
				<td><%=vo.getProd_name() %></td>
			</tr>	
	<%
		}
	%> 
		</table>
</body>
</html>