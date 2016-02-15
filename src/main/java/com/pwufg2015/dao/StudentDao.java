package com.pwufg2015.dao;


import com.pwufg2015.dao.contracts.StudentDaoContract;
import com.pwufg2015.entities.Student;

public class StudentDao extends GenericDao<Student> implements StudentDaoContract {

    protected StudentDao(Class<Student> typeEntity) {
        super(typeEntity);
    }

}
