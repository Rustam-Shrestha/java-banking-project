/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingprojectinjavanew;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


/**
 *
 * @author admin
 */



//importing the panel where our content will be displayed
import javax.swing.JFrame;
//imporing all the swing classes to be used
import javax.swing.*;
import java.awt.*;
//importing swing event handling
import java.awt.AWTEvent;
//importing the action event that will perfrom action in an event
import java.awt.event.ActionEvent;
//importing acton listener 
import java.awt.event.ActionListener;
class GUIFragsLogin {

    public GUIFragsLogin() {
        //creating a lable panel with application form heading
        JFrame container = new JFrame("User Application Form");


        
        // label for email
        JLabel email_label = new JLabel("Email");
        //bounds and sixe
        email_label.setBounds(60, 180, 170, 30);
        //adding comonent
        container.add(email_label);
        // textbox of email
        JTextField email_textfield = new JTextField();
        email_textfield.setBounds(165, 180, 170, 30);
        container.add(email_textfield);
      
        
        
        // label for password
        JLabel pass_label = new JLabel("Password");
        //bounds and sixe
        pass_label.setBounds(60, 230, 170, 30);
        //adding comonent
        container.add(pass_label);
        // textbox of email
        JPasswordField pass_textfield = new JPasswordField();
        pass_textfield.setBounds(165, 230, 170, 30);
        container.add(pass_textfield);

        
        JButton btn = new JButton("Login");
        btn.setBounds(165, 280, 80, 30);
        container.add(btn);
        
        

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String passEmail = email_textfield.getText();
                String passPassword = new String(pass_textfield.getPassword());
                CredChecker.getCred(passEmail, passPassword);

            }
        };

        // Attach the ActionListener to the button
        btn.addActionListener(actionListener);

        
        
        //specifying jframe properties
        container.setSize(400, 400);
        container.setLayout(null);
        container.setVisible(true);
        
    }
}




public class Login {

    public static void main(String[] args) {
        GUIFragsLogin frag = new GUIFragsLogin();
    }

}