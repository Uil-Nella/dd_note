package org.dd.note.cxf.user.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService	
public interface UserWS {
	String registUser(@WebParam(name="name") String name,@WebParam(name="password") String password);
}
