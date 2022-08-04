package kr.or.ddit.buyer.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.buyer.dao.BuyerDaoImpl;
import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.buyer.vo.BuyerVO;

public class BuyerServiceImpl implements IBuyerService {
	private IBuyerDao dao;
	private static BuyerServiceImpl service;
	
	private BuyerServiceImpl() {
		dao=BuyerDaoImpl.getInstance();
	}
	public static BuyerServiceImpl getInstance() {
		if(service==null) service=new BuyerServiceImpl();
		return service;
	}
	@Override
	public List<BuyerVO> selectName() {
		return dao.selectName();
	}

	@Override
	public BuyerVO selectByIdInfo(String id) {
		return dao.selectByIdInfo(id);
	}
	
}
