package kr.or.ddit.zip.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.zip.sevrice.IZipService;
import kr.or.ddit.zip.sevrice.IZipServiceImpl;
import kr.or.ddit.zip.vo.zipVO;


/**
 * Servlet implementation class SelectByDong
 */
@WebServlet("/selectByDong.do")
public class SelectByDong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectByDong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//클라이언트 전송 전달 데이타 받기 
		String paramDong = request.getParameter("dong");
		
		//service객체 얻기 
		IZipService  service = IZipServiceImpl.getServiceInstance();
		
		//service메소드 호출 
		List<zipVO>  list = service.selectDong(paramDong);
		
		request.setAttribute("sdjfs", list);
		
		request.getRequestDispatcher("0804join/selectDong.jsp").forward(request, response);
		
		
	}

}













