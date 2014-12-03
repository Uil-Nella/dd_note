package org.dd.note.common.yyuser.repository;

import org.dd.note.common.repository.BaseRepository;
import org.dd.note.common.user.UserInfo;
import org.dd.note.common.yyuser.YYUser;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface YYUserRepository extends BaseRepository<YYUser, Long>, JpaSpecificationExecutor<UserInfo>{
	 	@Modifying
	    @Query("insert into yy_user u (u.userid,u.username,u.password) values (?1,?2,?3)")
	    public void addUser(String userid,String username, String password);
//	 	@Query("select * from  yy_user where userid=?1")
//	 	public YYUser selectUser(String userid);
}
