<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   h1{
      color : red;
   }
   table{
      border: 2px solid blue;
   }
   td{
      width: 300px;
      height: 50px;
      text-align: center;
   }
</style>
</head>
<body>
   <h1> JSP : Java Server Pages </h1>
   <p>자바언어를 이용하여 클라이언트의 요청시 전송데이터를 받아서 처리한다.</p>
   <p>자바 언어를 처리 하기 위해서 &lt;% %> 기호사이에 자바를 기술한다.</p>
   <p>처리된 자바변수를 출력 할 때는 &lt;%=   %>기호를 사용한다.</p>
   
   <%
      // 클라이언트가 전송하면 전송데이터를 받아서 처리하는 부분
      // request라는 내장객체를 이용하여 받는다
      String userId=request.getParameter("id");
      String userPass=request.getParameter("pass");
   %>
   <table border="1">
      <tr>
         <td>아이디</td>
         <td>비밀번호</td>
      </tr>
      <tr>
         <td><%= userId %></td>
         <td><%= userPass %></td>
      </tr>
   </table>
   
</body>
</html>