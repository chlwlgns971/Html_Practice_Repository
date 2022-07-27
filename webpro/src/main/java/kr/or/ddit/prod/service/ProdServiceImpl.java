package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.dao.ProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.LprodVO;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements ProdService  {
	private static ProdService service;
	private ProdDao dao;

	public ProdServiceImpl() {
		dao=ProdDaoImpl.getInstance();
	}
	public static ProdService getInstance() {
		if(service==null) service=new ProdServiceImpl();
		return service;
	}

	@Override
	public List<LprodVO> selectLprod() {
		return dao.selectLprod();
	}

	@Override
	public List<ProdVO> selectByLgu(String lgu) {
		return dao.selectByLgu(lgu);
	}
	@Override
	public List<ProdVO> selectById(String id) {
		return dao.selectById(id);
	}

}
