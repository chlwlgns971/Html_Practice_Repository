<%@page import="kr.or.ddit.prod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function proc1(gu){
		location.href="/webpro/ProdServlet?lgu="+gu;
	}
</script>
<style type="text/css">
	table{
		text-align: center;
	}
</style>
</head>
<body>
	<%
		//서블릿에서 저장된 데이터 꺼내기
		List<LprodVO> list=(List<LprodVO>)request.getAttribute("selectLprod");
	%>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>분류코드</td>
			<td>분류명</td>
		</tr>
		<%
			for(int i=0; i<list.size(); i++){
				LprodVO vo=list.get(i);
		%>
			<tr>
				<td><%=vo.getLprod_id() %></td>
				<td><a href="#" onclick="javascript:proc1('<%=vo.getLprod_gu() %>');"><%=vo.getLprod_gu() %></td>
				<td><%=vo.getLprod_nm() %></td>
			</tr>
			
		<%
			}
		%>
	</table>
</body>
</html>