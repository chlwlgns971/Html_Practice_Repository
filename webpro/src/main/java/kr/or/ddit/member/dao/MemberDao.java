package kr.or.ddit.member.dao;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface MemberDao {
	public List<MemberVO> searchAll();
}
