package kr.or.ddit.member.controller;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.service.MemberService;
import kr.or.ddit.service.MemberServiceImpl;

public class MemberController {
	private MemberService service;
	
	public MemberController() {
		service=MemberServiceImpl.getInstance();
	}
	public static void main(String[] args) {
		new MemberController().searchAll();
	}
	public void searchAll() {
		List<MemberVO> list=null;
		list=service.searchAll();
		for(MemberVO vo : list) {
			String MEM_ID=vo.getMEM_ID();
			String MEM_PASS=vo.getMEM_PASS();
			String MEM_NAME=vo.getMEM_NAME();
			String MEM_BIR=vo.getMEM_BIR();
			String MEM_ZIP=vo.getMEM_ZIP();
			String MEM_ADD1=vo.getMEM_ADD1();
			String MEM_ADD2=vo.getMEM_ADD2();
			String MEM_HP=vo.getMEM_HP();
			String MEM_MAIL=vo.getMEM_MAIL();
			
			System.out.println(MEM_ID+"\t"+MEM_PASS+"\t"+MEM_NAME+"\t"+MEM_BIR+"\t"+MEM_ZIP+"\t"+MEM_ADD1+"\t"+MEM_ADD2+"\t"+MEM_HP+"\t"+MEM_MAIL+"\t");
		}
	}

}
