package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;

import com.cisc181.eNums.eMajor;


import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	
	
	static ArrayList<Student> studentList = new ArrayList<Student>();
	static ArrayList<Course> courseList = newArrayList<Course>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	static ArrayList<Enrollment> enrollmentList = new ArrayList<Enrollment>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	
	
	public static Date newDate(int year, int month, int day){
		Calendar date = Calendar.getInstance();
		date.set(year,  month, day);
		return date.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		Course CompSi = new Course("Intro to CompSi II", 3, eMajor.COMPSI);
		Course Business = new Course("Business 309", 4, eMajor.BUSINESS);
		Course Chemistry = new Course("Organic Chemistry I", 4, eMajor.CHEM);
		courseList.add(CompSi);
		courseList.add(Business);
		courseList.add(Chemistry);
		
		Semester fall = new Semester(newDate(2016,8,24), newDate(2016,12,18));
		Semester spring = new Semester(newDate(2017,1,17), newDate(2017,6,5 ));
		sectionList.add(fall);
		sectionList.add(spring); // not sure why getting red with add here
		
		Section fallCompSi = new Section(CompSi.getCourseID(), fall.getSemesterID(), 110);
		Section fallBusiness = new Section(Business.getCourseID(), fall.getSemesterID(), 120);
		Section fallChemistry = new Section(Chemistry.getCourseID(), fall.getSemesterID(), 130);
		Section springCompSi = new Section(CompSi.getCourseID(), spring.getSemesterID(), 115);
		Section springBusiness = new Section(Business.getCourseID(), spring.getSemesterID(), 115);
		Section springChemistry = new Section(Chemistry.getCourseID(), spring.getSemesterID(), 100);
		
		sectionList.add(fallCompSi);
		sectionList.add(fallBusiness);
		sectionList.add(fallChemistry);
		sectionList.add(springCompSi);
		sectionList.add(springBusiness);
		sectionList.add(springChemistry);
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}