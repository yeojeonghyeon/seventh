package com.scci.component;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Override
	public List<Member> getMembers() {
		return Arrays.asList(new Member("이순신", "gold", "1543-03-01"), new Member("오라방", "silver", "2021-02-04"));
	}
}
