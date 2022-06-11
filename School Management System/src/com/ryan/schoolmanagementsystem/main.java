package com.ryan.schoolmanagementsystem;

import java.util.List;
import java.util.ArrayList;

/**
 * This class is responsible for running the School System
 * @author _ryan
 *
 */
public class main {

	public static void main(String[] args) {

		//Create some Teachers
		Teacher Stefan = new Teacher(1, "Stefan",1000);
		Teacher Jordan = new Teacher(2, "Jordan", 1200);
		Teacher Ayn = new Teacher(3, "Ayn", 1230);
		
		ArrayList<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Stefan);
		teacherList.add(Jordan);
		teacherList.add(Ayn);
		
		//Create some Students
		Student ryan = new Student(1, "ryan", 6);
		Student jeanLuc	= new Student(2, "Jean Luc", 8);
		Student magnolia = new Student(3, "Magnolia", 1);
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(ryan);
		studentList.add(jeanLuc);
		studentList.add(magnolia);
		
		//Create School Object
		School acerbus = new School(teacherList, studentList);
		
		
		ryan.updateFeesPaid(5000);
		//display the school money earned
		System.out.print(acerbus.getTotalMoneyEarned());
		
		System.out.println("Acerbus School Pays Salaries: ");
		Stefan.recceiveSalary(Stefan.getSalary());
		System.out.println("AS mone spent: " + Stefan.getName() + " salary: " + acerbus.getTotalMoneySpent());
	
		
	}//main method

}//main class
