/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class EmployeeModel {
    public Employee addEmployee(Scanner sc){
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        while(!id.substring(0, 2).equals("NV")){
            System.out.println("Enter with format NVxxx");
            id = sc.nextLine();
        }
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter birthDay: ");
        String birthDayStr = sc.nextLine();
        System.out.println("Enter sex: ");
        String sex = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        Employee employee = new Employee(id,name, birthDayStr, sex, salary);
        return employee;
    }
    public void output(Employee e){
        System.out.printf("|Employee|%-10s|%-10s|%-10s|%-10s|%-10.1f|\n"
                            ,e.getId(),e.getName(),e.getBirthDay(),e.getSex(),e.getSalary());
    }
}
