package com.pwufg2015.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TermCourses")
@AssociationOverrides({
        @AssociationOverride(name = "pk.term",
                joinColumns = @JoinColumn(name = "TERM_ID")),
        @AssociationOverride(name = "pk.course",
                joinColumns = @JoinColumn(name = "COURSE_ID")) })
public class TermCourses {

    @Embeddable
    public class TermCoursesId implements java.io.Serializable {

        private Term term;
        private Course course;

        @ManyToOne
        public Term getTerm() {
            return term;
        }

        public void setTerm(Term term) {
            this.term = term;
        }

        @ManyToOne
        public Course getCourse() {
            return course;
        }

        public void setCourse(Course course) {
            this.course = course;
        }
    }

    private TermCoursesId pk = new TermCoursesId();
    private Set<Assignment> assignments = new HashSet<>(0);

    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinTable(
            name = "Course_Assignments",
            joinColumns = {@JoinColumn(name = "term_id"),
                           @JoinColumn(name = "course_id")},
            inverseJoinColumns = @JoinColumn(name = "assignment_id")
    )
    public Set<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(Set<Assignment> assignments) {
        this.assignments = assignments;
    }

    @EmbeddedId
    public TermCoursesId getPk() {
        return pk;
    }

    public void setPk(TermCoursesId pk) {
        this.pk = pk;
    }

    @Transient
    public Course getCourse(){
        return getPk().getCourse();
    }

    public void setCourse(Course course){
        getPk().setCourse(course);
    }

    @Transient
    public Term getTerm(){
        return getPk().getTerm();
    }

    public void setTerm(Term term){
        getPk().setTerm(term);
    }
}
