package com.pwufg2015.bean.student;

import com.pwufg2015.business.contracts.ITermBo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "studentTermBean")
public class StudentTermBean {

    @ManagedProperty(name="TermService", value="#{TermService}")
    protected ITermBo termBO;


}
