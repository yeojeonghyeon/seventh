package com.scci.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDao memberDao;
	@Override
	public List<Member> getMembers() {
		return memberDao.getMembers();
	}
}
