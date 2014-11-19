package org.dd.note.common.user.service;

import org.dd.note.common.repository.BaseRepository;
import org.dd.note.common.service.BaseService;
import org.dd.note.common.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@DependsOn("userInfoRepository")
@Service()
public class UserInfoService extends BaseService<UserInfo, Long> {

	@Autowired
	@Qualifier("userInfoRepository")
	@Override
	public void setBaseRepository(BaseRepository<UserInfo, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}
}
