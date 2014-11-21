package org.dd.note.cxf.user.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.dd.note.common.user.UserInfo;
import org.dd.note.common.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
@WebService(serviceName="UserWS")
public class UserWSImpl implements UserWS {

	@Autowired()
	protected UserInfoService userInfoService;
	
	public String registUser(@WebParam(name="name") String name,@WebParam(name="password") String password) {
		UserInfo user = new UserInfo();
		user.setName(name);
		user.setPassword(password);
		UserInfo dbUser = userInfoService.save(user);
		return dbUser.toString();

	}

}
