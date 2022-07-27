package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.LprodVO;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements ProdDao {
	private SqlMapClient smc;
	private static ProdDao dao;
	
	public ProdDaoImpl() {
		smc=new SqlMapClientFactory().getSmc();
	}
	public static ProdDao getInstance() {
		if(dao==null) dao=new ProdDaoImpl();
		return dao;
	}

	@Override
	public List<LprodVO> selectLprod() {
		List<LprodVO> list=null;
		try {
			list=smc.queryForList("prod.selectLprod");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ProdVO> selectByLgu(String lgu) {
		List<ProdVO> list=null;
		try {
			list=smc.queryForList("prod.searchByLgu",lgu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<ProdVO> selectById(String id) {
		List<ProdVO> list=null;
		try {
			list=smc.queryForList("prod.selectById",id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
