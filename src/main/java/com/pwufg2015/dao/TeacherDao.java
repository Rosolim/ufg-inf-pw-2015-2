package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.TeacherDaoContract;
import com.pwufg2015.entities.Teacher;

public class TeacherDao extends GenericDao<Teacher> implements TeacherDaoContract {

    protected TeacherDao(Class<Teacher> typeEntity) {
        super(typeEntity);
    }

}
