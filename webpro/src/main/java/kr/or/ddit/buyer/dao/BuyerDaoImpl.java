package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class BuyerDaoImpl implements IBuyerDao {
	private SqlMapClient smc;
	private static BuyerDaoImpl dao;
	
	private BuyerDaoImpl() {
		smc=SqlMapClientFactory.getSmc();
	}
	public static BuyerDaoImpl getInstance() {
		if(dao==null) dao=new BuyerDaoImpl();
		return dao;
	}
	@Override
	public List<BuyerVO> selectName() {
		List<BuyerVO> list=null;
		try {
			list=smc.queryForList("buyer.selectNames");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BuyerVO selectByIdInfo(String id) {
		BuyerVO vo=null;
		try {
			vo=(BuyerVO) smc.queryForObject("buyer.selectByIdInfo",id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

}
