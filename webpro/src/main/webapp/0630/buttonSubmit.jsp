<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String id=request.getParameter("id");
        String email=request.getParameter("email");
        String tel=request.getParameter("tel");
    %>
    <table border="1">
        <tr>
            <td>아이디</td>
            <td>이메일</td>
            <td>전화번호</td>
        </tr>
        <tr>
            <td><%=id%></td>
            <td><%=email%></td>
            <td><%=tel%></td>
        </tr>
    </table>
</body>
</html>