package com.pwufg2015.business.contracts;

import com.pwufg2015.entities.Course;

public interface ICourseBo extends BusinessContract<Course>{

	@Override
	Course newObject();

	@Override
	Course retrieveObject(long id);

	
	
}