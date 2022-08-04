package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;

public class MemberDaoImpl  implements MemberDao{

	//필요한거- SqlMapClient 
	private SqlMapClient service;
	
	//자신의 객체 
	private static MemberDao dao;
	
	//생성자 
	private  MemberDaoImpl() {
		service = SqlMapClientFactory.getSmc();
	}
	
	//자신의 객체를 생성하고 리턴 - service에서 사용 하는 것 
	public static MemberDao getDao() {
		if(dao == null)  dao = new  MemberDaoImpl();
		return dao;
	}
	
	@Override
	public List<MemberVO> selectAll() throws SQLException {
		
		//List<MemberVO>  list = null;
		//list = client.queryForList("");
		//return list ;
		
		return service.queryForList("member.selectAll");
	}

	@Override
	public MemberVO idSearch(String id) throws SQLException {
		// TODO Auto-generated method stub
		
		MemberVO   memId = null;
		
		memId = (MemberVO)service.queryForObject("member.idSearch", id);
		
		return memId;
	}

	@Override
	public String checkById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (String) service.queryForObject("member.checkById", id);
		
	}

}







