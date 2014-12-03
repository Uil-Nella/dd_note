package org.dd.note.cxf.yyuser.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.dd.note.common.yyuser.YYUser;
import org.dd.note.common.yyuser.service.YYUserService;
import org.springframework.beans.factory.annotation.Autowired;
@WebService(serviceName="YYUserWS")
public class YYUserWSImpl implements YYUserWS {

	@Autowired()
	protected YYUserService yyUserService;
	
	public String  bindUser(@WebParam(name="userid") String userid,@WebParam(name="username") String username,@WebParam(name="password") String password) {
		YYUser user = new YYUser();
		user.setUserid(userid);
		user.setUsername(username);
		user.setPassword(password);
		YYUser dbUser = yyUserService.save(user);
		return dbUser.toString();

	}
	
	/**
	 * 判断一个员工是否已经绑定 
	 * 如果已经绑定则返回员工信息
	 * @param userid
	 * @return
	 */
	public String  findUser(@WebParam(name="userid") String userid) {
		YYUser dbUser = yyUserService.findUser(userid);
		return dbUser.toString();

	}
	
	
	
	public YYUserService getYyUserService() {
		return yyUserService;
	}

	public void setYyUserService(YYUserService yyUserService) {
		this.yyUserService = yyUserService;
	}

	
	

}
