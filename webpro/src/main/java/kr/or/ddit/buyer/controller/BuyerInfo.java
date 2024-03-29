package kr.or.ddit.buyer.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;


@WebServlet("/buyerInfo.do")
public class BuyerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//클라이언트 전송시 전달 데이터 받기-id
		String id=request.getParameter("id");
		//Service객체 얻기
		IBuyerService service=BuyerServiceImpl.getInstance();
		//service메서드 호출하기-결과값 받기
		BuyerVO vo=service.selectByIdInfo(id);
		//request.저장
		request.setAttribute("buyerInfo", vo);
		//view페이지로 forward
		request.getRequestDispatcher("0803Buyer/buyerInfo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
