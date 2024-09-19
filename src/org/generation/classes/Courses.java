package org.generation.classes;

public class Courses {
	String courseName;
	String professorName;
	int year;
	
	public Courses(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}
	
	
	public void enroll(Student student){
	      //TODO add the student to the collection
	   }//enroll

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
	   }//unEnroll

	   public int countStudents(){
	       //TODO implement
	       return 0;
	   }//countStudents
	   
	   public int bestGrade(){
	       //TODO implement
	       return 0;
	   }//bestGrade
}
