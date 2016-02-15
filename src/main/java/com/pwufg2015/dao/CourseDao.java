package com.pwufg2015.dao;

import com.pwufg2015.dao.contracts.CourseDaoContract;
import com.pwufg2015.entities.Course;

public class CourseDao extends GenericDao<Course> implements CourseDaoContract {

    protected CourseDao(Class<Course> typeEntity) {
        super(typeEntity);
    }

}
