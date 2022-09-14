package com.example;

/**
 * Hello world!
 *
 */
public class Student 
{
    private String lastName;
    private String firstName;
    private int age;
    private Float gpa;
    private String major;
    private String department;
    
    /**
     * @param setLastName sets last name
     */
    public void setLastName(String setLastName)
    {
        lastName = setLastName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setFirstName(String setFirstName)
    {
        firstName = setFirstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setAge(int setAge)
    {
        age = setAge;
    }
    public int getAge()
    {
        return age;
    }
    public void setGpa(Float d)
    {
        gpa = d;
    }
    public float getGpa()
    {
        return gpa;
    }
    public void setMajor(String setMajor)
    {
        major = setMajor;
    }
    public String getMajor()
    {
        return major;
    }
    public void setDepartment(String setDept)
    {
        department = setDept;
    }
    public String getDepartment()
    {
        return department;
    }
    
    public String toString()
    {
        String studentInfo = "Student Info: " + firstName + lastName + ", " + age + "years old, " + gpa + "gpa, " + major + ", " + department;
        return studentInfo;
    }
    public class course
    {
        public void printSchedule()
        {
            System.out.println("CS151 Tue/Thur 6-7:15");
        }
    }
}

