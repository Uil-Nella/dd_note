package org.dd.note.cxf.yyuser.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService	
public interface YYUserWS {
	String bindUser(@WebParam(name="userid") String userid,@WebParam(name="username") String username,@WebParam(name="password") String password);
	String  findUser(@WebParam(name="userid") String userid);
	String updateUser(@WebParam(name="userid") String userid,@WebParam(name="username") String username,@WebParam(name="password") String password);
}
