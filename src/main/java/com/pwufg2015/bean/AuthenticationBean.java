package com.pwufg2015.bean;

import com.pwufg2015.business.contracts.IAuthBo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "authBean")
public class AuthenticationBean {

    @ManagedProperty(name="AuthService", value="#{AuthService}")
    protected IAuthBo authBo;



}
