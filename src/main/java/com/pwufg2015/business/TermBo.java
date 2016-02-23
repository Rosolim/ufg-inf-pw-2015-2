package com.pwufg2015.business;

import com.pwufg2015.business.contracts.ITermBo;
import com.pwufg2015.dao.contracts.TermDaoContract;
import com.pwufg2015.entities.Term;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TermService")
@Transactional(readOnly = true)
public class TermBo implements ITermBo {

    @Autowired
    TermDaoContract termDao;

    @Override
    @Transactional(readOnly = false)
    public void newObject(Term term) {
        termDao.add(term);
    }

    @Override
    public Term retrieveObject(long id) {
        return termDao.get(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void updateObject(Term term) {
        termDao.update(term);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteObject(Term term) {
        termDao.delete(term);
    }

    @Override
    public List<Term> listAll() {
        return termDao.listAll();
    }

}
