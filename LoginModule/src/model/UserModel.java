/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tommy
 */

public class UserModel {
    public boolean validateEmail(String emailStr) {
           Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(emailStr);
           return matcher.find();
       }
    public User addUser(Scanner sc){
        System.out.println("User Name: ");
        String userName = sc.nextLine();
        System.out.println("Password: ");
        String passWord = sc.nextLine();
        System.out.println("Email register: ");
        String email = sc.nextLine();
        while (!validateEmail(email)){
            System.out.println("Wrong email form !");
            email = sc.nextLine();
        }
        User user = new User(userName, passWord, email);
        return user;
    }
    public boolean checkUser(ArrayList<User> users,String username,String password) {
        for(User user: users ){
            if(user.getUserName().equals(username) && user.getPassWord().equals(password)){
                return true;
            }
        }
        return false;
    }
    public boolean checkUserNameSignUp(ArrayList<User> users,String username) {     
        for (User user : users) {
            if(user.getUserName().equals(username)){
                return false;
            }
        }
        return true;
    }
    public boolean checkEmailSignUp(ArrayList<User> users,String email) {     
        for (User user : users) {
            if(user.getEmail().equals(email)){
                return false;
            }
        }
        return true;
    }
    public boolean checkUser(User user){
        return "admin".equals(user.getUserName())&&"admin".equals(user.getPassWord());
    }
    public boolean checkEmail(ArrayList<User> users,String email){
         for(User user: users ){
            if(user.getEmail().equals(email)){
                return true;
            } else {
            }
        }
        return false;
    }
    
}
