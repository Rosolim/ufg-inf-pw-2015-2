package com.pwufg2015.bean.admin;


import com.pwufg2015.business.contracts.ICourseBo;
import com.pwufg2015.business.contracts.ITeacherBo;
import com.pwufg2015.business.contracts.ITermBo;
import com.pwufg2015.entities.Course;
import com.pwufg2015.entities.Teacher;
import com.pwufg2015.entities.Term;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.HashSet;
import java.util.Set;

@ViewScoped
@ManagedBean(name = "adminTermBean")
public class AdminTermBean {

    @ManagedProperty(name="TermService", value="#{TermService}")
    protected ITermBo termBO;

    @ManagedProperty(name="CourseService", value="#{CourseService}")
    protected ICourseBo courseBo;

    @ManagedProperty(name="TeacherService", value="#{TeacherService}")
    protected ITeacherBo teacherBo;

    private Term term;
    private Set<Course> courses = new HashSet<>(0);
    private Set<Teacher> teachers = new HashSet<>(0);




}
