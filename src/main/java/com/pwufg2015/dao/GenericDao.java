package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.GenericDaoContract;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Repository
@Transactional
public abstract class GenericDao<Entity extends Serializable> implements GenericDaoContract<Entity> {

    private final Class<Entity> typeEntity;

    @Autowired
    private SessionFactory sessionFactory;

    protected GenericDao(Class<Entity> typeEntity) {
        this.typeEntity = typeEntity;
    }

    public Session dbSession(){
        return getSessionFactory().getCurrentSession();
    }

    @Override
    public void add(Entity entity) {
        dbSession().save(entity);
    }

    @Override
    public void update(Entity entity) {
        dbSession().update(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public Entity get(long id) {
        return dbSession().get(typeEntity, id);
    }

    @Override
    public void delete(Entity entity) {
        dbSession().delete(entity);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
