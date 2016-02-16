package com.pwufg2015.bean.admin;

import com.pwufg2015.business.contracts.ICourseBo;
import com.pwufg2015.business.contracts.IStudentBo;
import com.pwufg2015.business.contracts.ITermBo;
import com.pwufg2015.entities.Student;
import com.pwufg2015.entities.Term;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.HashSet;
import java.util.Set;

@ViewScoped
@ManagedBean(name = "adminStudentBean")
public class AdminStudentBean {

    @ManagedProperty(name="TermService", value="#{TermService}")
    protected ITermBo termBO;

    @ManagedProperty(name="StudentService", value="#{StudentService}")
    protected IStudentBo studentBO;

    private Student student;
    private Set<Term> term = new HashSet<>(0);


}
