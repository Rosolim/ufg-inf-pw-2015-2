package com.pwufg2015.business.contracts;

import com.pwufg2015.entities.Assignment;

public interface IAssignmentBo extends BusinessContract<Assignment> {

	@Override
	Assignment newObject();

	@Override
	Assignment retrieveObject(long id);
	

}
