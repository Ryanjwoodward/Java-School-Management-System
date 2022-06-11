package com.ryan.schoolmanagementsystem;

/**
 * This class is responsible for keeping track of 
 * Teachers id, name, and salary
 * @author _ryan
 *
 */
public class Teacher {

	private int teacherId;
	private String name;
	private int salary;
	private int salaryEarned;
	
	// ************************
	// Constructors
	// ************************

	/**
	 * Creates a new teacher object
	 * @param id		the teacher's id
	 * @param name		the teacher's name
	 * @param salary	the teacher's salary
	 */
	public Teacher(int id, String name, int salary) {
		
		this.teacherId = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	//*************************
	//General Methods
	//*************************
	
	/**
	 * Adds to salayEarned
	 * Adds to teachers salary by removing from the school total earned
	 * @param tSalary teacher's salary that will ne paid
	 */
	public void recceiveSalary(int tSalary) {
		
		salaryEarned += tSalary;
		School.setTotalMoneySpent(salary);
	}
	
	// ************************
	// Getters and Setters
	// ************************
	
	//No setter for Id and Name
	
	/**
	 * Getter for the Teacher's Id
	 * @return	teacher's id
	 */
	public int getId() {
		
		return this.teacherId;
	}
	
	/**
	 * Getter for the name of the teacher
	 * @return	the name of the teacher
	 */
	public String getName() {
		
		return this.name;
	}
	
	/**
	 * Getter for a teacher's salary
	 * @return	teacher's salary
	 */
	public int getSalary() {
		
		return this.salary;
	}
	
	/**
	 * Setter method to update a teacher's salary
	 * @param salary	updated salary
	 */
	public void setSalary(int salary) {
		
		this.salary = salary;
	}
	
}//Teacher Class
