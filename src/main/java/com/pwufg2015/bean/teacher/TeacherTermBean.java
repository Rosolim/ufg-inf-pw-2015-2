package com.pwufg2015.bean.teacher;

import com.pwufg2015.business.contracts.ITermBo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "teacherTermBean")
public class TeacherTermBean {

    @ManagedProperty(name="TermService", value="#{TermService}")
    protected ITermBo termBO;


}
