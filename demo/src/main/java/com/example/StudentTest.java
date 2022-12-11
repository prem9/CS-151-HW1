package com.example;

/**
 * student tester
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class StudentTest 
{
    
    
   public static void main(String[] args) {
    // John Smith, 20 year old, 3.6 gpa, Computer Science major, School of Computer 
    // Science department
    // initializes student
    Student student = new Student();
    student.setAge(20);
    student.setDepartment("School of Computer Science department");
    student.setFirstName("John");
    student.setGpa((float) 3.6);
    student.setLastName("Smith");
    student.setMajor("Computer Science Department");
    // prints student
    System.out.println(student.toString());
    // prints scheduleh
    
    Student.course course=student.new course();
    course.printSchedule();
   }
}

