package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {
	private Date StartDate;
	private Date EndDate;
	private UUID SemesterID;
	
	
	
	public Semester(){
		SemesterID = UUID.randomUUID();
		
		
	}
	
	public Semester(Date startDate, Date endDate){
		SemesterID = UUID.randomUUID();
		StartDate = startDate;
		EndDate = endDate;
		
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	
	
	
	
}
