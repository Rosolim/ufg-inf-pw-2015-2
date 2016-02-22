package com.pwufg2015.bean.admin;

import com.pwufg2015.bean.MB;
import com.pwufg2015.business.contracts.ITeacherBo;
import com.pwufg2015.entities.Teacher;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "editTeacherBean")
@RequestScoped
public class EditTeacherBean extends MB {

    @ManagedProperty(name = "teacherService", value = "#{TeacherService}")
    private ITeacherBo teacherService;


    private Teacher teacher = new Teacher();

    @PostConstruct
    public void init(){

        teacher = (Teacher) flashContainer().get("teacher");

    }

    public void editTeacher(){

        try{

            teacherService.updateObject(teacher);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    //region Getters and Setters
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ITeacherBo getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(ITeacherBo teacherService) {
        this.teacherService = teacherService;
    }
    //endregion
}
