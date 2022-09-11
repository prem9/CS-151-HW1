package com.example;

/**
 * Person Class initializes the person
 *
 * @author  Prem Agarwal
 * @version 1.0
 * @since   8/25/22
 */
public class Person 
{
    String lastName;
    String firstName;
    int age;
    int sSN;
    String address;
    String gender;
    float weight;
    /**
     * @param setLastName the last name which sets the lastName of Person
     */
    public void setLastName(String setLastName)
    {
        lastName = setLastName;
    }
    /**
     * @return the last name of the Person it is set to
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * @param setFirstName sets the first name of the Person
     */
    public void setFirstName(String setFirstName)
    {
        firstName = setFirstName;
    }
    /**
     * @return firstName of the person
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * @param setAge sets the age of the person
     */
    public void setAge(int setAge)
    {
        age = setAge;
    }
    /**
     * @return gives the age of the person
     */
    public int getAge()
    {
        return age;
    }
    /**
     * @param d sets the SSN of the person
     */
    public void setSSN(int d)
    {
        sSN = d;
    }
    /**
     * @return retrives the ssn of the person
     */
    public int getsSN()
    {
        return sSN;
    }
    /**
     * @param addressString sets the address of the  person
     */
    public void setAddress(String addressString)
    {
        address = addressString;
    }
    /**
     * @return retrieves person's address
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * @param genderSet sets gender of the person
     */
    public void setGender(String genderSet)
    {
        gender = genderSet;
    }
    /**
     * @return retreives gender of the person
     */
    public String getGender()
    {
        return gender;
    }
    /**
     * @param weightSet sets the weight of the person
     */
    public void setWeight(Float weightSet)
    {
        weight = weightSet;
    }
    /**
     * @return returns weight of the person
     */
    public float getWeight()
    {
        return weight;
    }
    /**
     *  @return person info as well as student info of the person
     */
    public String toString()
    {
        String personInfo = "Student Info: " + firstName + lastName + ", " + age + "years old, " + gpa + "gpa, " + major + ", " + department;
        return personInfo;
    }
    /**
     * @return introduces the person
     */
    public String introduce() //incomplete
    {
        String introducePerson = firstName;
        return introducePerson;
    }
    public class course
    {
        /** 
        * prints student schedule
        */
        public void printSchedule()
        {
            System.out.println("CS151 Tue/Thur 6-7:15");
        }
    }
}

