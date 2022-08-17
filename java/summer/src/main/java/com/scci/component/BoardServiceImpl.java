package com.scci.component;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoardServiceImpl implements BoardService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	BoardDao boardDao; // boardDao bean이 주입
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	@Override
	public List<Post> getPosts() {
		logger.debug("BoardServiceImpl's getPosts called!! level:debug");
		logger.info("BoardServiceImpl's getPosts called!! level:info");
		logger.warn("BoardServiceImpl's getPosts called!! level:warn");
		logger.error("BoardServiceImpl's getPosts called!! level:error");
		return boardDao.getPosts();
	}
}
