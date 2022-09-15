package com.example;

/**
 * Hello world!
 *
 */
public class Employee extends Person
{
    private int employeeId;
    private String employeeStatus;
    private String employeePay;

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
    public void setEmployeePay(String employeePaySet)
    {
        employeePay = employeePaySet;
    }
    /**
     * @return retrievest employee Id
     */
    public String getEmployeePay()
    {
        return employeePay;
    }
    public double calculatePay(String time)
    {
       
        double salary = Double.parseDouble(employeePay.replaceAll("[^0-9]", ""));
        double totalPay = 0;
        double timeInt = Double.parseDouble(time.replaceAll("[^0-9]", ""));
        
        if (employeePay.contains("hr"))
        {
            totalPay = salary * timeInt;
        }
        else if (employeePay.contains("yr"))
        {
            totalPay = (salary * timeInt)/52;
            
        }
        totalPay = totalPay * 100;
        totalPay = Math.round(totalPay);
        totalPay = totalPay/100;
        return totalPay;
    }
    /**
     * @return prints out all the employee's info
     */
    
    public String toString()
    {
        String personInfo =  super.toString() + ", Employee Id: " + employeeId + ", Employee Status: " + employeeStatus + ", Employee Salary: " + employeePay;
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

