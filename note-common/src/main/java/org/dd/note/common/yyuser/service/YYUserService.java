package org.dd.note.common.yyuser.service;

import java.util.List;

import org.dd.note.common.repository.BaseRepository;
import org.dd.note.common.service.BaseService;
import org.dd.note.common.yyuser.YYUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@DependsOn("YYUserRepository")
@Service("yyUserService")
public class YYUserService extends BaseService<YYUser, Long> {

	@Autowired
	@Qualifier("YYUserRepository")
	@Override
	public void setBaseRepository(BaseRepository<YYUser, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}
	/**
	 * 查找对应用户
	 * @param userid
	 * @return
	 */
	public YYUser findUser(String userid){
		List<YYUser> userlist = baseRepository.findAll();
		for(YYUser u:userlist){
			if(userid.equalsIgnoreCase(u.getUserid())){
				return u;
			}
		}
		return null;
	}
}
