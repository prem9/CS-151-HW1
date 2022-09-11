package com.example;

/**
 * Hello world!
 *
 */
public class Employee 
{
    String lastName;
    String firstName;
    int age;
    int sSN;
    String address;
    String gender;
    float weight;
    
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
    public void setSSN(int d)
    {
        sSN = d;
    }
    public int getsSN()
    {
        return sSN;
    }
    public void setAddress(String addressString)
    {
        address = addressString;
    }
    public String getAddress()
    {
        return address;
    }
    public void setGender(String genderSet)
    {
        gender = genderSet;
    }
    public String getGender()
    {
        return gender;
    }
    
    public void setWeight(Float weightSet)
    {
        weight = weightSet;
    }
    public float getWeight()
    {
        return weight;
    }
    public String toString()
    {
        String personInfo = "Student Info: " + firstName + lastName + ", " + age + "years old, " + gpa + "gpa, " + major + ", " + department;
        return personInfo;
    }
    public String introduce()
    {
        String introducePerson = 
        return null;
    }
    public class course
    {
        public void printSchedule()
        {
            System.out.println("CS151 Tue/Thur 6-7:15");
        }
    }
}

