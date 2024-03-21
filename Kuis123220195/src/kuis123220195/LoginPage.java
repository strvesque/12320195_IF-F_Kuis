/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis123220195;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener {
    JLabel header = new JLabel("Selamat Datang!");
    JLabel subheader = new JLabel("Silahkan Login Untuk Melanjutkan");
    JLabel LabelUsername = new JLabel("Username");
    JLabel LabelPassword = new JLabel("Password");
    JTextField InputUsername = new JTextField();
    JTextField InputPassword = new JTextField();
    JButton LoginButton = new JButton("Login");
    
    LoginPage(){
        setVisible(true);
        setSize(510, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(subheader);
        add(LabelUsername);
        add(InputUsername);
        add(LabelPassword);
        add(InputPassword);
        add(LoginButton);
        
        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(25, 20, 440, 24);
        subheader.setBounds(25, 50, 440, 12);
        LabelUsername.setBounds(25, 84, 440, 12);
        InputUsername.setBounds(25, 84, 440, 32);
        LabelPassword.setBounds(25, 150, 440, 12);
        InputPassword.setBounds(23, 166, 440, 32);
        LoginButton.setBounds(19, 280, 452, 36);
        LoginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = InputUsername.getText();
            String password = InputPassword.getText();
            
            if (username.isEmpty() && password.isEmpty()){
                throw new Exception("Username & Password Tidak Boleh Kosong!");
            } else if (username.isEmpty()){
                throw new Exception("Username Tidak Boleh Kosong");
            } else if (password.isEmpty()){
                throw new Exception("Password Tidak Boleh Kosong");
            }
            
            new MainPage(username);
            this.dispose();
        
        } catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }   
    }


    
}
