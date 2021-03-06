package com.pwufg2015.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TermCourses")
@AssociationOverrides({
        @AssociationOverride(name = "pk.term",
                joinColumns = @JoinColumn(name = "TERM_ID")),
        @AssociationOverride(name = "pk.course",
                joinColumns = @JoinColumn(name = "COURSE_ID")) })
public class TermCourses implements Serializable {

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
    private Teacher teacher;
    
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
    
    @OneToOne(fetch = FetchType.LAZY)
    public Teacher getTeacher(){
    	return teacher;
    }
    public void setTeacher(Teacher t){
    	this.teacher = t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TermCourses)) return false;
        TermCourses that = (TermCourses) o;
        return Objects.equals(pk, that.pk) &&
                Objects.equals(teacher, that.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk, teacher);
    }
}
