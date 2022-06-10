package com.ryan.schoolmanagementsystem;

/**
 * This class is responsible for keeping track of 
 * student first name, last name, id, grades, and fees paid
 * @author _ryan
 *
 */
public class Student {

	private int studentId;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	
	//************************
	//Constructors
	//************************
	
	/**
	 * Non-default constructor to create a Student Object
	 * fees for each student is $30000/yr
	 * fees paid initially is 0
	 * @param id		the students id
	 * @param name		the students name
	 * @param grade		the students grade
	 */
	public Student(int id, String name, int grade) {
		
		feesPaid = 0;
		this.studentId = id;
		this.name = name;
		this.grade = grade;
	}
	
	//************************
	//Getters and Setters
	//No setters for students name or Id
	
	/**
	 * Setter to update the grade field of a student
	 * @param grade	 the new grade of the student
	 */
	public void setGrade(int grade) {
		
		this.grade = grade;
	}
	
	/**
	 * Update the total of fees paid by the student to the school
	 * Adds the passed parameter value to the existing fees paid total
	 * @param fees 		the value to be added to total fees paid by student
	 */
	public void updateFeesPaid(int fees) {
		
		this.feesPaid += fees;
	}
	
}//Student Class
