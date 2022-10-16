/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;
import view.LoginView;
/**
 *
 * @author Tommy
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static List<User> users;
    public static User user;
    static{
        users = new ArrayList<>();
        user = new User("admin", "123456", "hehe@gmail.com");
        users.add(user);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LoginView loginView = new LoginView();
    }
    
}
