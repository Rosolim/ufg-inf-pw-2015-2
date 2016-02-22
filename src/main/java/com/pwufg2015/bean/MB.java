package com.pwufg2015.bean;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import java.util.Map;

public class MB {

    public Flash flashContainer(){
        return FacesContext.getCurrentInstance().getExternalContext().getFlash();
    }

    public Map<String, Object> requestContainer(){
        return FacesContext.getCurrentInstance().getExternalContext().getRequestMap();
    }
}
