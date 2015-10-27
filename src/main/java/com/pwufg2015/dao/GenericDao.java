package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public abstract class GenericDao<Entity extends Serializable> {

    private final Class<Entity> typeEntity;
    @Autowired
    private SessionFactory sessionFactory;

    protected GenericDao(Class<Entity> typeEntity) {
        this.typeEntity = typeEntity;
    }

    public void add(Entity entity) {
        getSessionFactory().getCurrentSession().save(entity);
    }

    public void update(Entity entity) {
        getSessionFactory().getCurrentSession().update(entity);
    }

    public Entity get(long id) {
        return getSessionFactory().getCurrentSession().get(typeEntity, id);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
