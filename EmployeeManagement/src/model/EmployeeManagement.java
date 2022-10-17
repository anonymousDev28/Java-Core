/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class EmployeeManagement {
    private EmployeeModel employeeModel;
    private Employee e;
    private ArrayList<Employee> employees;
    public EmployeeManagement() {
        employees = new ArrayList<>();
        // them du lieu mau
        employees.add(new Employee("NV001", "Quang", "2000/05/03", "Male", 5000));
        employees.add(new Employee("NV002", "Quang dz", "2000/05/03", "Male", 50000));
        employees.add(new Employee("NV003", "Ha", "1970/08/09", "Female", 2000));
        employees.add(new Employee("NV004", "Mai", "1980/08/09", "Female", 500));
        employeeModel = new EmployeeModel();
    }

    public void setEmployees(ArrayList<Employee> employees){
        this.employees = employees;
    }
    // in ra thong tin tat ca cac nhan vien
    public void displayEmployee(){
        System.out.println(employees);
    }
    // them n nhan vien moi vao list
    public void addEmployees(Scanner sc) {
        System.out.println("Enter number of employee you wanna add:");
        int numEs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numEs; i++) {
            System.out.println("Employee No "+(i+1));
            employees.add(employeeModel.addEmployee(sc));
        }
    }
    // tim kiem nhan vien bang ID    
    public void searchEmployeeById(Scanner sc){
        System.out.println("Enter id you want to find: ");
        String id = sc.nextLine();
        while(!id.substring(0, 2).equals("NV")){
            System.out.println("Enter with format NVxxx");
            id = sc.nextLine();
        }
        boolean flag = true;
        System.out.println("result for id: "+id);
        for (Employee employee : employees) {
            if(employee.getId().equals(id)){
                flag = false;
                employeeModel.output(employee);
            }
        }
        if(flag){
            System.out.println("We didnt have id: +"+id); 
        }
    }
    // tim kiem nhan vien bang ten
    public void searchEmployeeByName(Scanner sc){
        System.out.println("Enter name wanna find :");
        String name = sc.nextLine();
        System.out.println("Result for "+name+" : ");
        boolean flag = true;
        for (Employee employee : employees) {
            if(employee.getName().equals(name)){
                flag = false;
                employeeModel.output(employee);
            }
        }
        if(flag){
            System.out.println("We dont have employee :"+name);
        }
    }
    //thong ke nhan vien theo gioi tinh
    public void sexStatistics(){
        int countMale = 0;
        for (Employee employee : employees) {
            if(employee.getSex().equals("Male")){
                countMale++;
            }
        }
        System.out.println("Male Employee: "+countMale);
        System.out.println("Female Employee: "+(employees.size()-countMale));
    }
    // thong ke nhung nhan vien lon hon 30 tuoi
    public void employeeOver30(){
        System.out.println("List employee over 30 years old");
        for (Employee employee : employees) {
            if(LocalDate.now().getYear() - employee.getBirthDay().getYear()>30){
                employeeModel.output(employee);
            }
        }
    }
    // dua ra man hinh nhung nhan vien co sinh nhat trong thang nhap vao
    public void birthDayInputMonth(Scanner sc){
        System.out.println("Nhap vao thang muon tim nhan vien co sinh nhat: ");
        int month = sc.nextInt();
        System.out.println("List Employee have birth day in "+month);
        for (Employee employee : employees) {
            if(employee.getBirthDay().getMonthValue() == month){
                employeeModel.output(employee);
            }
        }
    }
    // top 3 nhan vien co luong cao nhat
    public void top3EmployeeMostSalary(){
        System.out.println("Top 3 employee :");
        //em dung selection sort
        // sap xep tang dan
        for (int i = 0; i < employees.size()-1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if(employees.get(i).getSalary()>employees.get(j).getSalary()){
                    Collections.swap(employees, i, j);
                }
            }
        }
        // roi lay ra 3 nhan vien cuoi cung
        for (int i = employees.size()-1; i > employees.size()-3; i--) {
            employeeModel.output(employees.get(i));
        }
    }
}
