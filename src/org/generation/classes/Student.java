package org.generation.classes;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;
    	
  
    }//constructor
    
    public Student(String firstName, String lastName, int registration) {
		this(firstName, lastName, registration , 50, 1);
	}//constructor
    
    public void printFullName(String firstName, String lastName){
        //TODO implement
    	System.out.println("Nombre: " + firstName + " Apellido: " + lastName);
     }//printFullName

     public int isApproved(int grade){
         //TODO implement: should return true if grade >= 60
    	 if(grade >= 60) {
    		 System.out.println("aprobado");
    	 }else {
    		 System.out.println("Reprobado");    		 
    	 }
    	 //return 0;
    	 return grade >= 60 ? 1 : 0;
     }//isApproved

     public int changeYearIfApproved(int grade, int year){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
    	 if(grade >= 60) {
    		 year = year + 1;
    		 System.out.println("Congratulations");
    		 System.out.println("year: " + year);
    	 }else {
    		 System.out.println("Repetir año");    		 
    		 System.out.println("year: " + year);
    	 }
         // Make year = year + 1, and print "Congratulations" if the student has been approved
         return year;
     }//changeYearIfApproved
}
