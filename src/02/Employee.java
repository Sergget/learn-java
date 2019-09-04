import java.io.*;
public class Employee{
    String name;
    int age;
    String designation;
    double salary;
    //Employee constructor
    public Employee(String name){
        this.name=name;
    }
    //set age
    public void empAge(int empAge){
        age=empAge;
    }
    //set designation
    public void empDesignation(String empDesign){
        designation = empDesign;
    }
    //set salary
    public void empSalary(double empSalary){
        salary=empSalary;
    }
    //print info
    public void printEmployee(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("designation: "+designation);
        System.out.println("salary: "+salary);
    }
}