package com.pwufg2015.business;

import com.pwufg2015.business.contracts.IStudentBo;
import com.pwufg2015.dao.StudentDao;
import com.pwufg2015.dao.contracts.StudentDaoContract;
import com.pwufg2015.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StudentService")
public class StudentBo implements IStudentBo {

    @Autowired
    StudentDaoContract studentDao;

    @Override
    public Student newObject() {
        return null;
    }

    @Override
    public Student retrieveObject(long id) {
        return null;
    }

}
