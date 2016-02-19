package com.pwufg2015.business;

import com.pwufg2015.business.contracts.IUserBo;
import com.pwufg2015.dao.contracts.UserDaoContract;
import com.pwufg2015.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserBo implements IUserBo {

    @Autowired
    UserDaoContract userDao;

    @Override
    public User newObject() {
        return null;
    }

    @Override
    public User retrieveObject(long id) {
        return null;
    }

    @Override
    public User getByLogin(String login) {
        return userDao.getByLogin(login);
    }
}
