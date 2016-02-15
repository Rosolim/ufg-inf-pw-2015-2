package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.GenericDaoContract;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public abstract class GenericDao<Entity extends Serializable> implements GenericDaoContract<Entity> {

    private final Class<Entity> typeEntity;

    @Autowired
    private SessionFactory sessionFactory;

    protected GenericDao(Class<Entity> typeEntity) {
        this.typeEntity = typeEntity;
    }

    @Override
    public void add(Entity entity) {
        getSessionFactory().getCurrentSession().save(entity);
    }

    @Override
    public void update(Entity entity) {
        getSessionFactory().getCurrentSession().update(entity);
    }

    @Override
    public Entity get(long id) {
        return getSessionFactory().getCurrentSession().get(typeEntity, id);
    }

    @Override
    public void delete(Entity entity) {
        getSessionFactory().getCurrentSession().delete(entity);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
