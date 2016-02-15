package com.pwufg2015.business;

import com.pwufg2015.business.contracts.ITeacherBo;
import com.pwufg2015.dao.contracts.TeacherDaoContract;
import com.pwufg2015.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TeacherService")
public class TeacherBo implements ITeacherBo {

    @Autowired
    TeacherDaoContract teacherDao;

    @Override
    public Teacher newObject() {
        return null;
    }

    @Override
    public Teacher retrieveObject(long id) {
        return null;
    }
}
