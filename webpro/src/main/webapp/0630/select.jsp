<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    table{
        border: 1px solid blue;
        border-spacing: 5px;
        text-align: center;
    }
    div{
        border: 5px double hotpink;
        width: 60%;
        height: 200px;
        margin: 30px auto;
        padding: 20px;
    }
    .nameColor{
        background-color: lightblue;
    }
    th{
        width: 100px;
        height: 50px;
    }
    td{
        width: 200px;
        height: 50px;
    }
</style>
</head>
<body>
    <%
    request.setCharacterEncoding("utf-8");
    String id=request.getParameter("id");
    String name=request.getParameter("name");
    String food=request.getParameter("food");
    String foods[]=request.getParameterValues("food2");
    String intro=request.getParameter("intro");

    String str="";
    for(String fd:foods){
        str +=fd+"<br>";
    }
    %>
    <table border="1">
        <tr>
            <th class="nameColor">아이디</th>
            <td><%=id%></td>
            <th class="nameColor">이름</th>
            <td><%=name%></td>
        </tr>
        <tr>
            <th class="nameColor">좋아하는음식</th>
            <td colspan="3"><%=str%></td>
        </tr>
        <tr>
            <th class="nameColor">자기소개</th>
            <td colspan="3"><%=intro%></td>
        </tr>
    </table>
    <!-- <div>
        <%=intro%>
    </div> -->
</body>
</html>