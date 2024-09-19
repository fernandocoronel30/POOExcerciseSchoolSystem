package org.generation;

import org.generation.classes.Student;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student("Fatima", "Cruz", 2010, 1, 1);
		System.out.println(student1);
		
		student1.printFullName("", "");
		student1.isApproved(50);
		student1.changeYearIfApproved(50, 1);
		
		student1.printFullName("Leonel", "Cruz");
		student1.isApproved(70);
		student1.changeYearIfApproved(60, 2);
		
	}//main
}//class Main
