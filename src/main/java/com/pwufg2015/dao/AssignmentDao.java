package com.pwufg2015.dao;


import com.pwufg2015.dao.contracts.AssignmentDaoContract;
import com.pwufg2015.entities.Assignment;

public class AssignmentDao extends GenericDao<Assignment> implements AssignmentDaoContract {

    protected AssignmentDao(Class<Assignment> typeEntity) {
        super(typeEntity);
    }

}
