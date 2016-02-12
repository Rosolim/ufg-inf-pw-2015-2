package com.pwufg2015.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Terms")
public class Term {

    private Long termId;
    private String termName;
    private LocalDate startDate;
    private LocalDate endDate;

    private Set<TermCourses> termCourses = new HashSet<>(0);


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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}