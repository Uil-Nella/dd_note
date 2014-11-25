package org.dd.note.common.user.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserInfoRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public void addUser(String name, String password) {

	}

}
