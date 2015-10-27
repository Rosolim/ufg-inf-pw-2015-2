package com.business.contracts;

public interface BusinessContract<Entity> {
    void add(Entity entity);

    void update(Entity entity);

    Entity get(long id);
}
