package com.wf.user.service.impl;

import com.wf.user.dao.UserDate;
import com.wf.user.model.DateUser;
import com.wf.user.service.UserOfDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 与用户的时间相关的服务
 */
@Service
public class UserOfDateImpl implements UserOfDate {

    @Autowired
    private UserDate userDate;

    /**
     * 获取前十天的用户注册信息
     * @return
     */
    @Override
    public List<DateUser> getLast10Dayregister() {
        List<DateUser> last10DayRegisterUser = userDate.last10DayRegisterUser();
        return last10DayRegisterUser;
    }
}
