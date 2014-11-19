package org.dd.note.common.user;

import static org.junit.Assert.assertNotNull;

import org.dd.note.common.test.BaseUserInfoIT;
import org.dd.note.common.user.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserInfoIT extends BaseUserInfoIT{
	@Autowired
    protected UserInfoService userInfoService;

    @Test
    public void testSave() {
        UserInfo dbUser = userInfoService.save(createUser());
        assertNotNull(dbUser.getId());
    }
}
