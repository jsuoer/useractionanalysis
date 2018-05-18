package com.wf.user.service.impl;

import com.wf.user.dao.InviteUserDao;
import com.wf.user.model.InviteUser;
import com.wf.user.service.InviteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户被邀请状态的服务
 */
@Service
public class InviteUserServiceImpl implements InviteUserService {

    @Autowired
    private InviteUserDao inviteUserDao;


    /**
     * 获取代理用户邀请的用户
     * @return
     */
    @Override
    public List<InviteUser> getInviteUserOfProxy() {
        List<InviteUser> users = inviteUserDao.inviteUserProxy();
        return users;
    }

    /**
     * 获取老板邀请的用户
     * @return
     */
    @Override
    public List<InviteUser> getInviteUser() {
        List<InviteUser> users = inviteUserDao.inviteUser();
        return users;
    }

    @Override
    public List<InviteUser> getNotInviteUser() {
        List<InviteUser> users = inviteUserDao.userNoInvited();
        return users;
    }

    @Override
    public int colorCoinIs0() {
        int i = inviteUserDao.userCoinIs0();
        return i;
    }

    @Override
    public int colorCoinIsNot0() {
        int i = inviteUserDao.userCoinIsNot0();
        return i;
    }
}
