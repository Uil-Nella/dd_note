package org.dd.note.common.test;

import org.dd.note.common.user.UserInfo;

import com.sishuok.es.common.test.BaseIT;

public class BaseUserInfoIT extends BaseIT{
	public UserInfo createUser(){
		UserInfo user = new UserInfo();
		user.setName("lxy");
		user.setPassword("123");
		user.setEmail("222@22.cc");
		return user;
	}
}
