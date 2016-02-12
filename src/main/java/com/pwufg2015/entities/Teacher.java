package com.pwufg2015.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Teachers")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Teacher extends Person {

    private String status;
    private LocalDate admittanceDate;
    private LocalDate endingDate;
    private String major;
    private String degree;
    private BigDecimal salary;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getAdmittanceDate() {
        return admittanceDate;
    }

    public void setAdmittanceDate(LocalDate admittanceDate) {
        this.admittanceDate = admittanceDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
