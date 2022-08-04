package kr.or.ddit.buyer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;


@WebServlet("/buyerNames.do")
public class BuyerNames extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//클라이언트 전송시 전달데이터 받기
		
		//service객체 얻기
		IBuyerService service=BuyerServiceImpl.getInstance();
		//service메소드 호출->결과값 받기
		List<BuyerVO> list=service.selectName();
		//결과값을 request에 저장
		request.setAttribute("buyerList", list);
		//view페이지로 forward
		request.getRequestDispatcher("0803Buyer/buyerNames.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
