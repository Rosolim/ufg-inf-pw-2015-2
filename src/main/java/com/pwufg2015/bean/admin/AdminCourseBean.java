package com.pwufg2015.bean.admin;

import com.pwufg2015.business.contracts.ICourseBo;
import com.pwufg2015.entities.Course;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "adminCourseBean")
public class AdminCourseBean {

    @ManagedProperty(name="CourseService", value="#{CourseService}")
    protected ICourseBo courseBO;

    private Course course = new Course();

}
