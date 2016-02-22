package com.pwufg2015.business;

import com.pwufg2015.business.contracts.ITeacherBo;
import com.pwufg2015.dao.contracts.TeacherDaoContract;
import com.pwufg2015.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TeacherService")
@Transactional(readOnly = true)
public class TeacherBo implements ITeacherBo {

    @Autowired
    TeacherDaoContract teacherDao;

    @Override
    @Transactional(readOnly = false)
    public void newObject(Teacher teacher) {
        teacherDao.add(teacher);
    }

    @Override
    public Teacher retrieveObject(long id) {
        return teacherDao.get(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void updateObject(Teacher teacher) {
        teacherDao.update(teacher);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteObject(Teacher teacher) {
        teacherDao.delete(teacher);
    }

    @Override
    public List<Teacher> listAllTeachers() {
        return teacherDao.listAllTeachers();
    }
}
