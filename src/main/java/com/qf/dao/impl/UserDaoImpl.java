package com.qf.dao.impl;

import com.qf.bean.User;
import com.qf.dao.UserDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public List findall() {
        return sqlSessionTemplate.selectList("com.qf.dao.UserDao.findall");
    }
}
