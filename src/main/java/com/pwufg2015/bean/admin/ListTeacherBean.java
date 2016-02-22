package com.pwufg2015.bean.admin;

import com.pwufg2015.bean.MB;
import com.pwufg2015.business.contracts.ITeacherBo;
import com.pwufg2015.entities.Teacher;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "listTeacherBean")
@ViewScoped
public class ListTeacherBean extends MB {

    @ManagedProperty(name = "teacherService", value = "#{TeacherService}")
    private ITeacherBo teacherService;

    private transient DataModel<Teacher> model;

    private Teacher teacher = new Teacher();
    private List<Teacher> teachers = new ArrayList<>();


    public String editTeacher() {

        flashContainer().put("car", teacher);
        return "/admin/editProfessor.xhtml";

    }

    public void deleteTeacher(){

        try {

         teacherService.deleteObject(teacher);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public DataModel<Teacher> getModel() {

        if (model == null) {
            model = new ListDataModel<>(teachers);
        }

        return model;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setModel(DataModel<Teacher> model) {
        this.model = model;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ITeacherBo getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(ITeacherBo teacherService) {
        this.teacherService = teacherService;
    }
}
