package com.pwufg2015.business.contracts;

import com.pwufg2015.entities.User;

public interface IUserBo extends BusinessContract<User> {

    @Override
    User newObject();

    @Override
    User retrieveObject(long id);

}
