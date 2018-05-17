package com.wf.user.model;

public class InviteUser {

    private String inviteCodeOfProxy;
    private String invitedUser;
    private String UserSelf;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getInviteCodeOfProxy() {

        return inviteCodeOfProxy;
    }

    public void setInviteCodeOfProxy(String inviteCodeOfProxy) {
        this.inviteCodeOfProxy = inviteCodeOfProxy;
    }

    public String getInvitedUser() {
        return invitedUser;
    }

    public void setInvitedUser(String invitedUser) {
        this.invitedUser = invitedUser;
    }

    public String getUserSelf() {
        return UserSelf;
    }

    public void setUserSelf(String userSelf) {
        UserSelf = userSelf;
    }
}
