package com.biz.memo.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.memo.dao.MemberDao;
import com.biz.memo.model.MemberVO;

@Service
public class MemberService {

	@Autowired
	SqlSession sqlSession;
	
	MemberDao mDao;
	
	@Autowired
	public void getMapper() {
		mDao=sqlSession.getMapper(MemberDao.class);
	}

	public MemberVO login(MemberVO memberVO) {

		String m_userid= memberVO.getM_userid();
		String m_password=memberVO.getM_password();
		//memberVO=mDao.findByUserId(memberVO.getM_userid());
		
		//if(memberVO.getM_password().equals(m_password)) {
			// login 성공
	//	}
		
		// id와 비번을 모두 select 문으로 조회해서
		// 회원 정보 가져오기
		// 만약 id와 비번이 일치하면 정상적인 vo를 리턴
		// 그렇지 않으면 null값을 리턴
		memberVO =mDao.login(memberVO);
		
		return memberVO;
	}
}
