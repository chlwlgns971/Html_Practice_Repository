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
import kr.or.ddit.prod.vo.ProdVO;

/**
 * Servlet implementation class ProdList
 */
@WebServlet("/ProdList.do")
public class ProdList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1.클라이언트 전송시 전달 데이터 받기 - gu
		String lgu = request.getParameter("lgu");
		//2.service객체 얻어오기
		ProdService service = ProdServiceImpl.getInstance();
		//3.service메소드 호출
		List<ProdVO> list = service.selectByLgu(lgu);
		//4.결과값을 request에 저장
		request.setAttribute("listValue", list);
		
		//5.view페이지로 이동 - prod/prodList.jsp
  
		//	RequestDispatcher disp = request.getRequestDispatcher("prod/prodList.jsp");
		
		// 데이터 없음 처리 안하는애
	//	RequestDispatcher disp = request.getRequestDispatcher("0802ajaxprod/prodList2.jsp");
		// 데이터 없음 처리 하는 애
		RequestDispatcher disp = request.getRequestDispatcher("0802ajaxprod/prodList.jsp");
		
		disp.forward(request, response);
	}

}
