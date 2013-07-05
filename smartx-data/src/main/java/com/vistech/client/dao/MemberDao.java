package com.vistech.client.dao;

import org.springframework.data.repository.CrudRepository;

import com.vistech.client.bean.Member;

public interface MemberDao extends CrudRepository<Member, String> {

}
