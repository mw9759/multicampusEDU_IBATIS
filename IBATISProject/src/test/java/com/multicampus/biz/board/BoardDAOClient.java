package com.multicampus.biz.board;

import java.util.List;

public class BoardDAOClient {

	public static void main(String[] args) throws Exception {
		BoardDAO boardDAO = new BoardDAO();

		BoardVO vo = new BoardVO();
		vo.setTitle("iBATIS 제목");
		vo.setWriter("xxx");
		vo.setContent("테스트중입");
		boardDAO.insertBoard(vo);
		
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
	}

}
