package com.cisc181.core;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.*;



public class PersonException extends Exception{
	private Person Person;
	
	
	public PersonException(Person person){
		this.Person = person;
		
	}
	public Person getPerson(){
		return Person;
		
	}
}
