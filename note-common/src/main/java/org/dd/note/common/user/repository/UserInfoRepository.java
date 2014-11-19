package org.dd.note.common.user.repository;

import org.dd.note.common.repository.BaseRepository;
import org.dd.note.common.user.UserInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

public interface UserInfoRepository extends BaseRepository<UserInfo, Long>, JpaSpecificationExecutor<UserInfo>{
	 	@Modifying
	    @Query("insert into dd_userinfo u (u.name,u.password) values (?1,?2)")
	    public void addUser(String name, String password);
}
