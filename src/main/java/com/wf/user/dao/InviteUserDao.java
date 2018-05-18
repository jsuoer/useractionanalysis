package com.wf.user.dao;

import com.wf.user.model.InviteUser;

import java.util.List;

public interface InviteUserDao {

    /**
     * 代理推荐的用户
     * @return
     */
    List<InviteUser> inviteUserProxy();

    /**
     * 老板推荐的用户
     */
    List<InviteUser> inviteUser();

    /**
     * 不是被推荐的用户
     * @return
     */
    List<InviteUser> userNoInvited();

    /**
     * 用户奖豆是0
     * @return
     */
    int userCoinIs0();

    /**
     * 用户奖豆不是0
     * @return
     */
    int userCoinIsNot0();

}
