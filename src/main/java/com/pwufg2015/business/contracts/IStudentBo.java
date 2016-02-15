package com.pwufg2015.business.contracts;

import com.pwufg2015.entities.Student;

public interface IStudentBo extends BusinessContract<Student>{

    @Override
    Student newObject();

    @Override
    Student retrieveObject(long id);

}
