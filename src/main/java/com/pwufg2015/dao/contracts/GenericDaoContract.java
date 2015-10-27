package com.dao.contracts;

/**
 * Created by cerradoweb on 01/09/15.
 */
public interface GenericDaoContract<Entity> {
    void add(Entity entity);

    void update(Entity entity);

    Entity get(long id);
}
