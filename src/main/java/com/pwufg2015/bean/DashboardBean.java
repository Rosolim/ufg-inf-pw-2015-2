package com.pwufg2015.bean;

import com.pwufg2015.business.contracts.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "dashboardBean")
public class DashboardBean {

    @ManagedProperty(name="TermService", value="#{TermService}")
    protected ITermBo termBO;

    @ManagedProperty(name="CourseService", value="#{CourseService}")
    protected ICourseBo courseBo;

    @ManagedProperty(name="TeacherService", value="#{TeacherService}")
    protected ITeacherBo teacherBo;

    @ManagedProperty(name="StudentService", value="#{StudentService}")
    protected IStudentBo studentBo;

    @ManagedProperty(name="AssignmentService", value="#{AssignmentService}")
    protected IAssignmentBo assignmentBo;




}
