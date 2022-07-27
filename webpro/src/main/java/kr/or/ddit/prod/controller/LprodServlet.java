package kr.or.ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.ProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.LprodVO;

/**
 * Servlet implementation class ProdServlet
 */
@WebServlet("/LprodServlet")
public class LprodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProdService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LprodServlet() {
        super();
        service=ProdServiceImpl.getInstance();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.한글처리
		request.setCharacterEncoding("UTF-8");
		//1.클라이언트 전송시(요청) 전달하는 데이터를 받는다.
	
		//2.service객체를 얻어온다.(ServiceImpl.getInstance)->기본생성자에서 처리함.
		
		//3.service메서드 호출- 결과값 받기
		List<LprodVO> list=service.selectLprod();
		//4.request에 결과값을 저장
		request.setAttribute("selectLprod", list);
		//결과값을 출력 - view페이지로 이동
		RequestDispatcher disp=request.getRequestDispatcher("0727MVC/Lprod.jsp");
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
