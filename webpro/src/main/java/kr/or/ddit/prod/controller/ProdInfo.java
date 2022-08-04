package kr.or.ddit.prod.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.ProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.LprodVO;
import kr.or.ddit.prod.vo.ProdVO;

/**
 * Servlet implementation class ProdInfo
 */
@WebServlet("/ProdInfo.do")
public class ProdInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.클라이언트 전송시 전달 데이터 가져오기 - id
		String paraId = request.getParameter("id");
		
		//2.service객체 가져오기
		ProdService service = ProdServiceImpl.getInstance();
		//3.service메소드 호출하기 - 결과값 가져오기
		ProdVO vo = (ProdVO) service.selectById(paraId);
		//4.결과값을 request에 저장하기
		request.setAttribute("voValue", vo);
		//5.view페이지로 이동 prod/prodInfo.jsp
		RequestDispatcher disp = request.getRequestDispatcher("prod/prodInfo.jsp");
		
		disp.forward(request, response);
		
		
	}

}
