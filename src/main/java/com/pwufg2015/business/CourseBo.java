package com.pwufg2015.business;

import com.pwufg2015.business.contracts.ICourseBo;
import com.pwufg2015.dao.contracts.CourseDaoContract;
import com.pwufg2015.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CourseService")
public class CourseBo implements ICourseBo {

	@Autowired
	CourseDaoContract courseDao;

	@Override
	public void newObject(Course course) {

	}

	@Override
	public Course retrieveObject(long id) {
		return null;
	}

	@Override
	public void updateObject(Course course) {

	}

	@Override
	public void deleteObject(Course course) {

	}

}
