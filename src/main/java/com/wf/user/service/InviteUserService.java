package com.wf.user.service;

import com.wf.user.model.InviteUser;

import java.util.List;

public interface InviteUserService {

    List<InviteUser> getInviteUserOfProxy();

    List<InviteUser> getInviteUser();

    /**
     * 没有被邀请的用户
     * @return
     */
    List<InviteUser> getNotInviteUser();

    /**
     * 奖豆数为0的人数
     * @return
     */
    int colorCoinIs0();

    /**
     * 奖豆数不为0的人数
     * @return
     */
    int colorCoinIsNot0();
}
