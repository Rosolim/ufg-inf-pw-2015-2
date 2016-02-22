package com.pwufg2015.business.contracts;

public interface BusinessContract<Entity> {

    void newObject(Entity entity);
    Entity retrieveObject(long id);
    void updateObject(Entity entity);
    void deleteObject(Entity entity);

}
