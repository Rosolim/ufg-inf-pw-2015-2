package com.pwufg2015.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Students")
@PrimaryKeyJoinColumn(name = "PERSON_ID")
public class Student extends Person {

	private String status;
	private Date admittanceDate;
	private Date endingDate;
	private Set<StudentAssignment> studentAssignment = new HashSet<>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.student", cascade = CascadeType.ALL)
	public Set<StudentAssignment> getStudentAssignment() {
		return studentAssignment;
	}

	public void setStudentAssignment(Set<StudentAssignment> studentAssignment) {
		this.studentAssignment = studentAssignment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getAdmittanceDate() {
		return admittanceDate;
	}

	public void setAdmittanceDate(Date admittanceDate) {
		this.admittanceDate = admittanceDate;
	}

	public Date getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
}
