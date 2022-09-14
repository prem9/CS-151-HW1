package com.example;

/**
 * Hello world!
 *
 */
public class EmployeeTest
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee("Joe", "Smith", 30, 21352345, "123 berryessa Ave", "male", (float) 165.0);
        emp1.setEmployeeId(123456);
        emp1.setEmployeePay(60);
        emp1.setEmployeeStatus("contractor");
        emp1.introduce();
    }

}