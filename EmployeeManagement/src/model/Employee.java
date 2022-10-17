/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Tommy
 */
public class Employee {
    
    private String id;
    private String name;
    private LocalDate birthDay;
    private String sex;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name,String birthDayStr, String sex, double salary) {
        this.id = id;
        this.name = name;
        LocalDate birthDayLC = LocalDate.parse(birthDayStr, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        this.birthDay = birthDayLC;
        this.sex = sex;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name=" + name + ", birthDay=" + birthDay + ", sex=" + sex + ", salary=" + salary + "}\n";
    }
    
    
}
