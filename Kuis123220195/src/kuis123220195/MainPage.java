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

/**
 *
 * @author Lab Informatika
 */
public class MainPage extends JFrame implements ActionListener{
    JLabel header = new JLabel();
    JLabel subheader = new JLabel("Silahkan Pilih Menu di Bawah Untuk Membeli Majalah");
    JButton MAnakButton = new JButton("Majalah Anak");
    JButton MRemajaButton = new JButton("Majalah Remaja");
    JButton MDewasaButton = new JButton("Majalah Dewasa");
    
    MainPage(String username){
        setVisible(true);
        setSize(510, 480);
        setTitle("Main Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(subheader);
        add(MAnakButton);
        add(MRemajaButton);
        add(MDewasaButton);
        
        header.setText("Welcome," + username);
        header.setFont(header.getFont().deriveFont(20.0f));
        header.setBounds(25, 20, 440, 24);
        subheader.setBounds(25, 50, 440, 16);
        MAnakButton.setBounds(19, 84, 452, 36);
        MRemajaButton.setBounds(19, 132, 452, 36);
        MDewasaButton.setBounds(19, 180, 452, 36);
        
        MAnakButton.addActionListener(this);
        MRemajaButton.addActionListener(this);
        MDewasaButton.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String anak = ("Majalan Anak");
            String remaja = ("Majalah Remaja");
            String dewasa = ("Majalah Dewasa");
            
            if (username.isEmpty() && password.isEmpty()){
                throw new Exception("Username & Password Tidak Boleh Kosong!");
            } else if (username.isEmpty()){
                throw new Exception("Username Tidak Boleh Kosong");
            } else if (password.isEmpty()){
                throw new Exception("Password Tidak Boleh Kosong");
            }
            
            new BuyPage(username);
            this.dispose();
        
        } catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
}
