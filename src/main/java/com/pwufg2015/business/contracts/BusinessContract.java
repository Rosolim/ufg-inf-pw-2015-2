package com.pwufg2015.business.contracts;

public interface BusinessContract<Entity> {

    Entity newObject();
    Entity retrieveObject(long id);

}
