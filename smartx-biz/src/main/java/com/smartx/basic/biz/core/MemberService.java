package com.smartx.basic.biz.core;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartx.basic.data.bean.Member;
import com.smartx.basic.data.dao.MemberDao;

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
