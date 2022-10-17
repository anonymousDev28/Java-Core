/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import model.EmployeeManagement;
import java.util.Scanner;
import model.Employee;

/**
 *
 * @author Tommy
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        EmployeeManagement manaE = new EmployeeManagement();
        menuExecute(sc, manaE);
    }
    public static void menuChoice(){
        System.out.println("==========FILM MANAGEMENT==========");
        System.out.println("""
                           1.Them nhan vien
                           2.Thong tin tat ca nhan vien 
                           3.Tim nhan vien bang ID
                           4.Tim nhan vien bang ten
                           5.Dem so nhan vien nam nu
                           6.Liet ke cac nhan vien tren 30 tuoi
                           7.In ra danh sach nv co sinh nhat trong thang nhap vao tu ban phim
                           8.In ra top 3 nhan vien co luong cao nhat
                           0.Exit
                           """);
        System.out.println("Your Choice ?");

    }
    public static int menuSelection(Scanner sc){
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static void menuExecute(Scanner sc,EmployeeManagement eMana){
            int choice;
        do{
            menuChoice();
            choice = menuSelection(sc);
            switch(choice){
                case 0 -> System.exit(0);
                case 1 -> eMana.addEmployees(sc);
                case 2 -> eMana.displayEmployee();
                case 3 -> eMana.searchEmployeeById(sc);
                case 4 -> eMana.searchEmployeeByName(sc);
                case 5 -> eMana.sexStatistics();
                case 6 -> eMana.employeeOver30();
                case 7 -> eMana.birthDayInputMonth(sc);
                case 8 -> eMana.top3EmployeeMostSalary();                
            }
       }while(choice >= 0 && choice <= 8);
    }
    
}
