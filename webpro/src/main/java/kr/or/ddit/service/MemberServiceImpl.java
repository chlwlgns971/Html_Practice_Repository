package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDao dao;
	private static MemberService service;

	public MemberServiceImpl() {
		dao=MemberDaoImpl.getInstance();
	}
	public static MemberService getInstance() {
		if(service==null) service=new MemberServiceImpl();
		return service;
	}
	@Override
	public List<MemberVO> searchAll() {
		return dao.searchAll();
	}
	@Override
	public MemberVO IdSearch(String id) {
		return dao.IdSearch(id);
	}

}
