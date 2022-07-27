package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> searchAll();
	
	public MemberVO IdSearch(String id);
}
