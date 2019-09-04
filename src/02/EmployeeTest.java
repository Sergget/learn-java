// import java.io.*;
public class EmployeeTest{
    public static void main(String[] args) {
        Employee empOne=new Employee("noob1");
        Employee empTwo=new Employee("noob2");

        empOne.empAge(26);
        empOne.empDesignation("Senior developer");
        empOne.empSalary(20000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Junior developer");
        empTwo.empSalary(5000);
        empTwo.printEmployee();
    }
}