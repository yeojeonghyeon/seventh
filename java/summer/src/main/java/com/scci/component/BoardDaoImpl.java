package com.scci.component;

import java.util.Arrays;
import java.util.List;

public class BoardDaoImpl implements BoardDao{
	@Override
	public List<Post> getPosts() {
		return Arrays.asList(new Post("안녕하세요.", "가입인사입니다."), new Post("오늘도 달린다.", "거북이처럼 느리게..."));
	}
}
