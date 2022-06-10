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
	}
	
	// ************************
	// Getters and Setters
	// ************************
	
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
	
}//Teacher Class
