package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.UserDaoContract;
import com.pwufg2015.entities.User;

public class UserDao extends GenericDao<User> implements UserDaoContract {

    protected UserDao(Class<User> typeEntity) {
        super(typeEntity);
    }

}

