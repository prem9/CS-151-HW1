package com.example;

/**
 * Hello world!
 *
 */
public class Employee extends Person
{
    private int employeeId;
    private String employeeStatus;
    private int employeePay;

    Employee(String firstName, String lastName, int age, int sSN, String address, String gender, float weight)
    {
        super(firstName, lastName, age, sSN, address, gender, weight);
    }
    /**
     * @param employeeIdSet sets the employees id
     */
    public void setEmployeeId(int employeeIdSet)
    {
        employeeId = employeeIdSet;
    }
    /**
     * @return retrievest employee Id
     */
    public int getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeStatus(String employeeStatusSet)
    {
        employeeStatus = employeeStatusSet;
    }
    /**
     * @return retrievest employee Id
     */
    public String getEmployeeStatus()
    {
        return employeeStatus;
    }
    public void setEmployeePay(int employeePaySet)
    {
        employeePay = employeePaySet;
    }
    /**
     * @return retrievest employee Id
     */
    public int getEmployeePay()
    {
        return employeePay;
    }
    public int calculatePay(int hrs)
    {
        int totalpay = employeePay * hrs;
        return totalpay;
    }
    /**
     * @return prints out all the employee's info
     */
    public String toString()
    {
        String personInfo = "Employee Info: " + super.toString() + ", Employee Id " + employeeId + ", Employee Status " + employeeStatus + ", Employee Pay $" + employeePay;
        return personInfo;
    }
    /**
     * @return introduces employee
     */
    @Override
    public void introduce()
    {
        //String introducePerson = "";
        
        System.out.println(toString());
    }
    
}

