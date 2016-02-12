package com.pwufg2015.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Courses")
public class Course {

    private Long courseId;
    private String courseName;
    private Set<TermCourses> termCourses = new HashSet<>(0);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COURSE_ID")
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.course", cascade=CascadeType.ALL)
    public Set<TermCourses> getTermCourses() {
        return termCourses;
    }

    public void setTermCourses(Set<TermCourses> termCourses) {
        this.termCourses = termCourses;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
