package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.UserDaoContract;
import com.pwufg2015.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends GenericDao<User> implements UserDaoContract {

    protected UserDao() {
        super(User.class);
    }

}

