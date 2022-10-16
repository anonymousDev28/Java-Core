/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.User;
import model.UserModel;
import view.LoginView;

/**
 *
 * @author Tommy
 */
public class LoginController {
    private LoginView loginView;
    private UserModel userModel;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.userModel = new UserModel();
    }

    class LoginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
        }
        
    }
    
    
}
