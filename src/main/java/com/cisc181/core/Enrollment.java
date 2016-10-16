package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID StudentID;
	private UUID EnrollmentID;
	private UUID SectionID;
	private double Grade;
	
	private Enrollment(UUID studentID, UUID sectionID){
		super();
		StudentID = studentID;
		SectionID = sectionID;
		this.EnrollmentID = UUID.randomUUID();
		
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public double getGrade() {
		return this.Grade;
	}

	public void setGrade(double grade) {
		this.Grade = grade;
	}

}
