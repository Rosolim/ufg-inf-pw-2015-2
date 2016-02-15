package com.pwufg2015.business;

import com.pwufg2015.business.contracts.ITermBo;
import com.pwufg2015.dao.contracts.TermDaoContract;
import com.pwufg2015.entities.Term;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TermService")
public class TermBo implements ITermBo {

    @Autowired
    TermDaoContract termDao;

    @Override
    public Term newObject() {
        return null;
    }

    @Override
    public Term retrieveObject(long id) {
        return null;
    }
}
