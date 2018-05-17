package com.wf.user.dao;

import com.wf.user.model.InviteUser;

import java.util.List;

public interface InviteUserDao {

    /**
     * 代理推荐的用户
     * @return
     */
    List<InviteUser> inviteUserProxy();
}
