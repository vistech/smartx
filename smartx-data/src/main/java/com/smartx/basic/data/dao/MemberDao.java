package com.smartx.basic.data.dao;

import org.springframework.data.repository.CrudRepository;

import com.smartx.basic.data.bean.Member;

public interface MemberDao extends CrudRepository<Member, String> {

}
