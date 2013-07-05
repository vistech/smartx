package com.smartx.basic.web.backadmin.module.action;

import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;

public class UserAccountAction {
	public void doRegister(@FormGroup("register") MyUser user, Navigator nav) {
		nav.redirectTo("backadminLink").withTarget("index");
	}
}