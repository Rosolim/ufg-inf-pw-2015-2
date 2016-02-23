package com.pwufg2015.bean.admin;


import com.pwufg2015.bean.MB;
import com.pwufg2015.business.contracts.ITermBo;
import com.pwufg2015.entities.Course;
import com.pwufg2015.entities.Teacher;
import com.pwufg2015.entities.Term;
import org.javatuples.Pair;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.*;

@ManagedBean(name = "persistTermBean")
@ViewScoped
public class PersistTermBean extends MB {

    @ManagedProperty(name = "termService", value = "#{TermService}")
    private ITermBo termService;

    private Term term = new Term();
    private List<Pair<Course,Teacher>> courseList = new ArrayList<>();

    public String persistNewTerm(){

        try {

            termService.newObject(term);

        }catch (Exception ex){

            ex.printStackTrace();
            return "";

        }

        return "/admin/gerTurmas.xhtml?faces-redirect=true";


    }

    public List<Pair<Course, Teacher>> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Pair<Course, Teacher>> courseList) {
        this.courseList = courseList;
    }

    //region Getters and Setters
    public ITermBo getTermService() {
        return termService;
    }

    public void setTermService(ITermBo termService) {
        this.termService = termService;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }
    //endregion
}
