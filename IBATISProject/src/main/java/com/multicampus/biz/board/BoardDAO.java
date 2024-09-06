package com.multicampus.biz.board;

import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.multicampus.biz.util.SqlMapClientFactoryBean;

public class BoardDAO {
	
	// SqlMapClient 객체가 바로 iBATIS 컨테이너다.
	private SqlMapClient ibatis;
	
	public BoardDAO() {
		// SqlMapClient는 SqlMapClientFactoryBean으로부터 획득한다.
		ibatis = SqlMapClientFactoryBean.getSqlMapClientInstance();
	}

	public void insertBoard(BoardVO vo) throws Exception{
		ibatis.insert("insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) throws Exception{
		ibatis.update("updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) throws Exception{
		ibatis.delete("deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) throws Exception{
		return (BoardVO) ibatis.queryForObject("getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) throws Exception{
		return ibatis.queryForList("getBoardList", vo);
	}
	
	public void updateCnt(BoardVO vo) throws Exception{
		ibatis.update("updateCnt", vo);
	}
	
	public List<BoardVO> boardSearchTitle(BoardVO vo) throws Exception{
		return ibatis.queryForList("boardSearchTitle", vo);
	}
	
	public List<BoardVO> boardSearchContent(BoardVO vo) throws Exception{
		return ibatis.queryForList("boardSearchContent", vo);
	}
}
