package com.scci.component;

import java.util.List;

public class BoardServiceImpl implements BoardService {
	BoardDao boardDao; // boardDao bean이 주입
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	@Override
	public List<Post> getPosts() {
		return boardDao.getPosts();
	}
}
