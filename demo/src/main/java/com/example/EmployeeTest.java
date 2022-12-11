package com.example;

/**
 * Employee Test class tests employee
 * @author  Prem Agarwal
 * @version 1.0
 * @since   9/22/22
 */
public class EmployeeTest
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee("Joe", "Smith", 30, 21352345, "123 berryessa Ave", "male", (float) 165.0);
        emp1.setEmployeeId(123456);
        emp1.setEmployeeStatus("contractor");
        emp1.setEmployeePay("$60/hr");
        emp1.introduce();
        emp1.toString();
        System.out.println("Total Pay for 30 hrs: $" + emp1.calculatePay("30 hrs") + "\n");

        Employee emp2 = new Employee("Lisa", "Gray", 27, 43436257, "435 Main Str", "female", (float) 123.0);
        emp2.setEmployeeId(24523);
        emp2.setEmployeeStatus("full-time");
        emp2.setEmployeePay("$110,000/yr");
        emp2.introduce();
        emp2.toString();
        System.out.println("Total Pay for 2 weeks: $" + emp2.calculatePay("2 weeks") + "\n");
        
        Employee emp3 = new Employee("Timothy", "Briggs", 28, 14525745, "324 Joe Str", "male", (float) 178.0);
        emp3.setEmployeeId(445367);
        emp3.setEmployeeStatus("full-time");
        emp3.setEmployeePay("$80,000/yr");
        emp3.introduce();
        emp3.toString();
        System.out.println("Total Pay for 4 weeks: $" + emp3.calculatePay("4 weeks") + "\n");

        Employee emp4 = new Employee("George", "Wallace", 54, 6523475, "425 Yosemite Str", "male", (float) 235.0);
        emp4.setEmployeeId(3564573);
        emp4.setEmployeeStatus("part-time");
        emp4.setEmployeePay("$20/hr");
        emp4.introduce();
        emp4.toString();
        System.out.println("Total Pay for 25 hours: $" + emp4.calculatePay("25 hours") + "\n");

        Employee emp5 = new Employee("Amy", "Student", 34, 62656254, "2345 San Str", "Female", (float) 145.0);
        emp5.setEmployeeId(6546754);
        emp5.setEmployeeStatus("contractor");
        emp5.setEmployeePay("$45/hr");
        emp5.introduce();
        emp5.toString();
        System.out.println("Total Pay for 45 hours: $" + emp5.calculatePay("45 hours") + "\n");
    }

}