package com.ryan.schoolmanagementsystem;

import java.util.ArrayList;

/**
 * This class is responsible for keeping track of 
 * Teacher objects, Student objects- both within ArrayList
 * @author _ryan
 *
 */
public class School {
	
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	
	/**
	 * Creates a new School Object
	 * @param teachers	ArrayList of Teachers
	 * @param students	ArrayList of Students
	 */
	public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}
	
	//*********************
	//Getters and Setters
	//*********************
	
	/**
	 * Getter for the ArrayList of teachers, the teachers, in the school
	 * @return the Arraylist teachers of the school
	 */
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}


	/**
	 * This 'setter' method is actually used to add teacher to the 
	 * teachers ArrayList attribute 
	 * @param teacher  the teacher added to the school
	 */
	public void addTeacher(Teacher teacher) {
		
		this.teachers.add(teacher);
	}

	/**
	 * Getter for the ArrayList of students, the students in the school
	 * @return the ArrayList students of the school
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}

	/**
	 * This 'setter' method is actually used to add a student to the 
	 * student ArrayList class attribute
	 * @param student	the student add to the school
	 */
	public void addStudent(Student student) {
		
		this.students.add(student);
	}


	/**
	 * Getter for the total money the school has earned
	 * @return the toal money earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Setter to update the total money earned by a school
	 * @param totalMoneyEarned
	 */
	public void setTotalMoneyEarned(int totalMoneyEarned) {
		this.totalMoneyEarned += totalMoneyEarned;
	}

	/**
	 * Getter for the total money spent by the school
	 * @return	the total amount spent
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * Setter to update the total amount of money spent by the school
	 * In this program the only expense is teacher's salaries
	 * @param totalMoneySpent	by the school
	 */
	public void setTotalMoneySpent(int moneySpent) {
		
		this.totalMoneyEarned -= moneySpent;
	}
	
	
	
	
	
}//School Class
