package com.pwufg2015.business.contracts;

import java.util.List;

public interface BusinessContract<Entity> {

    void newObject(Entity entity);
    Entity retrieveObject(long id);
    void updateObject(Entity entity);
    void deleteObject(Entity entity);
    List<Entity> listAll();

}
