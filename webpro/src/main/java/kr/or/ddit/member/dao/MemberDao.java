package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.vo.MemberVO;

public interface MemberDao {
	public List<MemberVO> selectAll() throws SQLException;
	
	public MemberVO idSearch(String id) throws SQLException;
	
	public String checkById(String id) throws SQLException;
}
