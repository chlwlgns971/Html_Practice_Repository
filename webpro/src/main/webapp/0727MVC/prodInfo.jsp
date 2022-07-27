<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@page import="java.util.List"%>
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
		List<ProdVO> list=(List<ProdVO>)request.getAttribute("searchById");
	%>
	<table border="1">
		<tr>
			<td>상품코드</td>
			<td>상품이름</td>
			<td>분류코드</td>
			<td>거래처코드</td>
			<td>cost</td>
			<td>price</td>
			<td>sale</td>
		</tr>
		<% 
		for(int i=0; i<list.size(); i++){
			ProdVO vo=list.get(i);
		%>
		<tr>
			<td><%=vo.getProd_id() %></td>
			<td><%=vo.getProd_name() %></td>
			<td><%=vo.getProd_lgu() %></td>
			<td><%=vo.getProd_buyer() %></td>
			<td><%=vo.getProd_cost() %></td>
			<td><%=vo.getProd_price() %></td>
			<td><%=vo.getProd_sale() %></td>
		</tr>	
	<%
		}
	%> 
	</table>
</body>
</html>