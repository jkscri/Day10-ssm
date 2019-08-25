package com.qf.service.impl;

import com.qf.bean.User;
import com.qf.dao.UserDao;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List findall() {
        return userDao.findall();
    }
}
