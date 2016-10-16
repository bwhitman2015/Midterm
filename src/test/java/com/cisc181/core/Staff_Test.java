package com.cisc181.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

import com.cisc181.eNums.eTitle;


import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	static ArrayList<Staff> staffMembers = new ArrayList<Staff>();
	
	public static Date newDate(int year, int month, int day){
		Calendar date = Calendar.getInstance();
		date.set(year,month, day);
		return date.getTime();
		
		
	}
	@Test
	public void StaffSalaryAvTest(){
		double sum = 0;
		for (Staff staff : staffMembers) {
			sum = (sum + staff.getSalary());
			
		}
		double avgSalary = sum/staffMembers.size();
		assertEquals(avgSalary, 2525);
		
	}

	@BeforeClass
	public static void setup() throws PersonException {
		staffMembers.add(new Staff("Sophie", "Summer", "Ling", newDate(1972, 5,15), "314 North College Pl", "(123)-234-2345", "jLing@udel.edu", "1 to 5", 1, 1200, newDate(1996,6,15), eTitle.MRS));
		staffMembers.add(new Staff("Matt", "Thomas", "Fang", newDate(1970,1,12),"420 Rainbow Road", "(908)-456-7890", "mFang@udel.edu", "1:30 to 6:30", 2, 7000, newDate(1997,9,9), eTitle.MR));
		staffMembers.add(new Staff("John", null, "Doverman", newDate(1969,5,25), "330 Ranch Ave", "(302)-443-5555", "jDover@udel.edu", "3 to 5", 3, 2000, newDate(2001,7,15), eTitle.MS));
		staffMembers.add(new Staff("Joshua", null, "Llamar", newDate(1972,3,28), "74 BirdUp Blvd", "(908)-789-9988", "jLlamar@udel.edu", "10 to 4", 4, 4000, newDate(2005,7,23), eTitle.MR));
		staffMembers.add(new Staff("Brad", "Bob", "Joe", newDate(1992,11,23), "84 Comp Sci Dr", "(302)-343-1678", "bBobJoe@udel.edu", "1 to 5", 5, 5000, newDate(2004, 9,2), eTitle.MR));
	}
	
		
	}
	
	@Test
	public void DOBTest() throws PersonException{
		Staff staff = new Staff("Sophie", "Summer", "Ling", newDate(1982, 55,15),"314 North College Pl", "(123)-234-2345", "jLing@udel.edu", "1 to 5", 1 , 1200, newDate(1992,6,15), eTitle.MRS);
		
	}	
	@Test
	public void PhoneNbrTest() throws PersonException{
		Staff staff = new Staff("Sophie", "Summer", "Ling", newDate(1972, 5, 15), "314 North College Pl", "123-2222-5555", "jLing@udel.edu", "1 to 5", 1, 1200, newDate(1996, 6,15), eTitle.MRS);
		
		
		
		
	
}
