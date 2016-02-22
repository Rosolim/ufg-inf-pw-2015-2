package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.TeacherDaoContract;
import com.pwufg2015.entities.Teacher;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings("unchecked")
public class TeacherDao extends GenericDao<Teacher> implements TeacherDaoContract {

    protected TeacherDao() {
        super(Teacher.class);
    }

    @Override
    public List<Teacher> listAllTeachers() {

        Criteria criteria = dbSession().createCriteria(Teacher.class);

        return (List<Teacher>)criteria.list();

    }


}
