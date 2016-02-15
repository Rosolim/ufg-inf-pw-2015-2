package com.pwufg2015.dao.contracts;


public interface GenericDaoContract<Entity> {
    void add(Entity entity);

    void update(Entity entity);

    Entity get(long id);

    void delete(Entity entity);

}
