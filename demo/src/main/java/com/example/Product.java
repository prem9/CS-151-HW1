package com.example;

/**
 * Hello world!
 *
 */
public class Product 
{
    String employeeId;
    String firstName;
    int age;
    int sSN;
    String address;
    String gender;
    float weight;
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setEmployeeId(String employeeIdSet)
    {
        employeeId = employeeIdSet;
    }
    /**
     * @return retrievest employee Id
     */
    public String getEmployeeId()
    {
        return employeeId;
    }
    /**
     * @param setFirstName sets first name of employee
     */
    public void setFirstName(String setFirstName)
    {
        firstName = setFirstName;
    }
    /**
     * @return retrieves first name of employee
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * @param setAge sets age of employee
     */
    public void setAge(int setAge)
    {
        age = setAge;
    }
    /**
     * @return retrieves age of employee
     */
    public int getAge()
    {
        return age;
    }
    /**
     * @param d sets employee ssn
     */
    public void setSSN(int d)
    {
        sSN = d;
    }
    /**
     * @return retrievse ssn of employee
     */
    public int getsSN()
    {
        return sSN;
    }
    /**
     * @param addressString sets address of employeee
     */
    public void setAddress(String addressString)
    {
        address = addressString;
    }
    /**
     * @return retrieves address of employee
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * @param genderSet sets gender of employee
     */
    public void setGender(String genderSet)
    {
        gender = genderSet;
    }
    /**
     * @return retrieves gender of the employee
     */
    public String getGender()
    {
        return gender;
    }
    /**
     * @param weightSet sets weight of the employee
     */
    public void setWeight(Float weightSet)
    {
        weight = weightSet;
    }
    /**
     * @return retrieves weight of the employee
     */
    public float getWeight()
    {
        return weight;
    }
    /**
     * @return prints out all the employee's info
     */
    public String toString()
    {
        String personInfo = "Student Info: " + firstName + lastName + ", " + age + "years old, " + gpa + "gpa, " + major + ", " + department;
        return personInfo;
    }
    /**
     * @return introduces employee
     */
    public String introduce()
    {
        String introducePerson = "";
        return null;
    }
    public class course
    {
        /**
         * prints out schedule
        */
        public void printSchedule()
        {
            System.out.println("CS151 Tue/Thur 6-7:15");
        }
    }
}

