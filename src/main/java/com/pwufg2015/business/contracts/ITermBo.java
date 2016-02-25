package com.pwufg2015.business.contracts;

import com.pwufg2015.Utils.Pair;
import com.pwufg2015.entities.Course;
import com.pwufg2015.entities.Teacher;
import com.pwufg2015.entities.Term;

import java.util.List;

public interface ITermBo extends BusinessContract<Term> {

    void newObject(Term term , List<Pair<Course,Teacher>> courses);

}
