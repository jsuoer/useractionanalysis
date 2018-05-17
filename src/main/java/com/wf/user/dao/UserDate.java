package com.wf.user.dao;

import com.wf.user.model.DateUser;

import java.util.List;

public interface UserDate {

    /**
     * 获取前十天的用户注册数目
     */
    List<DateUser> last10DayRegisterUser();

}
