package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;

public class MemberDaoImpl implements MemberDao {
	private static MemberDao dao;
	private SqlMapClient smc;

	public MemberDaoImpl() {
		smc=SqlMapClientFactory.getSmc();
	}
	public static MemberDao getInstance() {
		if(dao==null) dao=new MemberDaoImpl();
		return dao;
	}
	@Override
	public List<MemberVO> searchAll() {
		List<MemberVO> list=null;
		try {
			list=smc.queryForList("member.searchAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
}
