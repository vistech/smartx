package com.vistech.core;

import org.springframework.beans.factory.annotation.Autowired;

import com.vistech.client.bean.Member;
import com.vistech.client.dao.MemberDao;

public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public void doSave(){
		Member m = new Member();
		m.setId("abcd1");
		m.setName("zhangxi1");
		
		memberDao.save(m);
	}
}
