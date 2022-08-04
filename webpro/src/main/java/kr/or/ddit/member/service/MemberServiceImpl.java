package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	//dao객체가 필요 - daoImpl클래스에서 가져오기 
	private MemberDao dao;
	
	//자신의 객체 - controller에서 사용 
	private static MemberService service ;
	
	//생성자 
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getDao();
	}
		
	//자신의 객체를 생성하는 리턴 하는 메소드 
	public static MemberService  getService() {
		if(service == null) service = new MemberServiceImpl();
		
		return service;
	}
	
	
	@Override
	public List<MemberVO> selectAll() {
		List<MemberVO>  list = null;
		
		try {
			list = dao.selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public MemberVO idSearch(String id) {
		MemberVO  aaaa= null;
		
		try {
			aaaa = dao.idSearch(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return aaaa;
	}

	@Override
	public String checkById(String id) {
		String  mid = null;
		
		try {
			mid = dao.checkById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mid;
	}

}














