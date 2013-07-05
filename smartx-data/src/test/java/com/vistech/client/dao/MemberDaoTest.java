package com.vistech.client.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vistech.client.bean.Member;

public class MemberDaoTest extends AbstractDataAccessTests {
	@Autowired
	MemberDao memberDao;

	@Test
	public void test1() {
		Member m = new Member();
		m.setId("abcd1a1");
		m.setName("zhangxi1");

		memberDao.save(m);
	}
}