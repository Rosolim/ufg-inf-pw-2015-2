package com.pwufg2015.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Students")
@PrimaryKeyJoinColumn(name="PERSON_ID")
public class Student extends Person {

    private String status;
    private LocalDate admittanceDate;
    private LocalDate endingDate;

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
}
