package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.TermDaoContract;
import com.pwufg2015.entities.Term;

public class TermDao extends GenericDao<Term> implements TermDaoContract {

    protected TermDao(Class<Term> typeEntity) {
        super(typeEntity);
    }

}
