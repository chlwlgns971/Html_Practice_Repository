package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.LprodVO;
import kr.or.ddit.prod.vo.ProdVO;

public interface ProdService {
	public List<LprodVO> selectLprod();
	
	public List<ProdVO> selectByLgu(String lgu);
	
	public List<ProdVO> selectById(String id);
}
