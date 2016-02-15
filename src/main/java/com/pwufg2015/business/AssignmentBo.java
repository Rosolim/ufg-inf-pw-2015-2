package com.pwufg2015.business;

import com.pwufg2015.dao.contracts.AssignmentDaoContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwufg2015.business.contracts.IAssignmentBo;
import com.pwufg2015.dao.AssignmentDao;
import com.pwufg2015.entities.Assignment;

@Service("AssignmentService")
public class AssignmentBo implements IAssignmentBo {

	@Autowired
	AssignmentDaoContract assignment;
	
	@Override
	public Assignment newObject() {		
		return new Assignment();
	}

	@Override
	public Assignment retrieveObject(long id) {
		return assignment.get(id);
	}

	
	
}
