package com.vistech.webx.backadmin.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.vistech.webx.backadmin.module.action.MyUser;

public class UserAccount {

	public void execute(Context context) {
		MyUser user = new MyUser();
		user.setUserId("linxi246");
		user.setPassword("123456");
		user.setPasswordConfirm("123456");
		context.put("user", user);
	}
}