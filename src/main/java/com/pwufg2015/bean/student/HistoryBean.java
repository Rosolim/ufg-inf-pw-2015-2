package com.pwufg2015.bean.student;

import com.pwufg2015.business.AssignmentBo;
import com.pwufg2015.entities.Assignment;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.HashSet;
import java.util.Set;

@ViewScoped
@ManagedBean(name = "historyBean")
public class HistoryBean {

    @ManagedProperty(name="AssignmentService", value="#{AssignmentService}")
    protected AssignmentBo assignmentBo;

    private Set<Assignment> assignments = new HashSet<>(0);


}
