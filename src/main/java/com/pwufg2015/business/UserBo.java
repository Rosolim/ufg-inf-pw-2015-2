package com.pwufg2015.business;

import com.pwufg2015.business.contracts.IUserBo;
import com.pwufg2015.dao.contracts.UserDaoContract;
import com.pwufg2015.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserBo implements IUserBo {

    @Autowired
    UserDaoContract userDao;

    @Override
    public void newObject(User user) {

    }

    @Override
    public User retrieveObject(long id) {
        return null;
    }

    @Override
    public void updateObject(User user) {

    }

    @Override
    public void deleteObject(User user) {

    }

    @Override
    public List<User> listAll() {
        return null;
    }
}
