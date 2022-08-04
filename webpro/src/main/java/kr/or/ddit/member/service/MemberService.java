package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> selectAll();

	public MemberVO idSearch(String id);

	public String checkById(String id);
}
