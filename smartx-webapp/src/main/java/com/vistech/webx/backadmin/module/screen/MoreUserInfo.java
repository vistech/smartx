package com.vistech.webx.backadmin.module.screen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.citrus.turbine.Context;
import com.vistech.webx.backadmin.module.action.MyUser;

public class MoreUserInfo {

	public void execute(Context context) {
		List<MyUser> userList = new ArrayList<MyUser>();
		
		MyUser user = new MyUser();
		user.setId("a");
		user.setUserId("linxi246");
		user.setPassword("123456");
		user.setPasswordConfirm("123456");
		user.setBirthday(new Date());
		userList.add(user);
		
		
//		user = new MyUser();
//		user.setId("b");
//		user.setUserId("linxi247");
//		user.setPassword("123456");
//		user.setPasswordConfirm("123456");
//		userList.add(user);
//		
//		user = new MyUser();
//		user.setId("c");
//		user.setUserId("linxi248");
//		user.setPassword("123456");
//		user.setPasswordConfirm("123456");
//		userList.add(user);
		
		context.put("users", userList);
		
		
	}
}