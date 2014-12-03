package org.dd.note.common.yyuser.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class YYUserRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public void addUser(String userid,String username, String password){

	}
//	public YYUser selectUser(String userid){
//		
//	}

}
