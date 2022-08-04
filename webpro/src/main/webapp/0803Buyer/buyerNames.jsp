<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@page import="java.util.List"%>

<%
	//서블릿에서 저장된 공유데이터 꺼내기
	List<BuyerVO> list=(List<BuyerVO>)request.getAttribute("buyerList");
%>
[
	<%
		for(int i=0; i<list.size(); i++){
			BuyerVO vo=list.get(i);
			if(i>0) out.print(",");
	%>
			{
				"id" : "<%=vo.getBuyer_id() %>",
				"name" : "<%=vo.getBuyer_name() %>"
			}
	<%
		}
	%>
		
	
]