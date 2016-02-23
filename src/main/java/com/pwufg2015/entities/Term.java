package com.pwufg2015.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Terms")
public class Term implements Serializable {

    private Long termId;
    private String termName;
    private Date startDate;
    private Date endDate;

    private Set<TermCourses> termCourses = new HashSet<>(0);
    private Set<Student> termStudents = new HashSet<>(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TERM_ID")
    public Long getTermId() {
        return termId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.term", cascade=CascadeType.ALL)
    public Set<TermCourses> getTermCourses() {
        return termCourses;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Student> getTermStudents() {
        return termStudents;
    }

    public void setTermStudents(Set<Student> termStudents) {
        this.termStudents = termStudents;
    }

    public void setTermCourses(Set<TermCourses> termCourses) {
        this.termCourses = termCourses;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
