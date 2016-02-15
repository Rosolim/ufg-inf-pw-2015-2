package com.pwufg2015.business.contracts;

import com.pwufg2015.entities.Term;

public interface ITermBo extends BusinessContract<Term> {
    @Override
    Term newObject();

    @Override
    Term retrieveObject(long id);
}
