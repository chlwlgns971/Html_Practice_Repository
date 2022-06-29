<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    table{
        border: 1px solid green;
    }
</style>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
		String userId=request.getParameter("id");
		String userName=request.getParameter("name");
		String gender=request.getParameter("gender");
		
		String hero[]=request.getParameterValues("hero");
		String str="";
		for(String music : hero){
			//str += music + "&nbsp;&nbsp;";
			str += music + "<br>";
		}
		String file=request.getParameter("file");
		String hName=request.getParameter("IU");
	%>
	<table border="1">
		<tr>
            <td>아이디</td>
            <td><%=userId%></td>
		</tr>
        <tr>
            <td>이름</td>
            <td><%=userName%></td>
		</tr>
        <tr>
            <td>성별</td>
            <td><%=gender%></td>
		</tr>
        <tr>
            <td>음악</td>
            <td><%=str%></td>
		</tr>
		<tr>
            <td>첨부파일</td>
            <td><%=file%></td>
		</tr>
        <tr>
            <td>숨긴이름</td>
            <td><%=hName%></td>
		</tr>
	</table>
</body>
</html>