package com.pwufg2015.bean.admin;

import com.pwufg2015.business.contracts.ITeacherBo;
import com.pwufg2015.entities.Teacher;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "adminTeacherBean")
public class AdminTeacherBean {

    @ManagedProperty(name="TeacherService", value="#{TeacherService}")
    protected ITeacherBo teacherBO;

    private Teacher teacher;

}
