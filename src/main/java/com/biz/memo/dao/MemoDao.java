package com.biz.memo.dao;

import java.util.List;

import com.biz.memo.model.MemoVO;

public interface MemoDao {
	
	public List<MemoVO> selectAll();
	public int insert(MemoVO memoVO);
	public MemoVO findBySeq(Long mo_seq);
	public int update(MemoVO memoVO);
	public int delete(Long mo_seq);
}
