package com.pwufg2015.business.contracts;

import com.pwufg2015.entities.Teacher;

public interface ITeacherBo extends BusinessContract<Teacher> {

    @Override
    Teacher newObject();

    @Override
    Teacher retrieveObject(long id);

}
