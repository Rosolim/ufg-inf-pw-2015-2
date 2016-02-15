package com.pwufg2015.business;

import com.pwufg2015.dao.contracts.CourseDaoContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwufg2015.business.contracts.ICourseBo;
import com.pwufg2015.dao.CourseDao;
import com.pwufg2015.entities.Course;

@Service("CourseService")
public class CourseBo implements ICourseBo {

	@Autowired
	CourseDaoContract courseDao;

	@Override
	public Course newObject() {
		return new Course();
	}

	@Override
	public Course retrieveObject(long id) {
		return courseDao.get(id);
	}



}
