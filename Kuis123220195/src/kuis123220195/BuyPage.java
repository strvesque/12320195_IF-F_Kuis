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
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class BuyPage extends JFrame implements ActionListener{
    JLabel headerpembelian = new JLabel("Halaman Pembelian");
    JLabel Labelkategori = new JLabel("Kategori");
    JLabel kategori = new JLabel();
    JLabel Labelharga = new JLabel("Harga");
    JLabel harga = new JLabel();
    JLabel Labeljumlah = new JLabel("Jumlah");
    JTextField Inputjumlah = new JTextField();
    JButton kembaliButton = new JButton("Kembali");
    JButton beliButton = new JButton("Beli");
    JLabel headertotal = new JLabel("Total Pembelian");
    JLabel LabelHarga = new JLabel("Harga Satuan");
    JLabel hargasatuan = new JLabel();
    JLabel LabelJumlah = new JLabel("Jumlah");
    JLabel jumlah = new JLabel();
    JLabel Labeltotalharga = new JLabel("Total Harga");
    JLabel totalharga = new JLabel();
    
    BuyPage(){
        setVisible(true);
        setSize(510, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(headerpembelian);
        add(Labelkategori);
        add(kategori);
        add(LabelHarga);
        add(harga);
        add(Labeljumlah);
        add(Inputjumlah);
        add(kembaliButton);
        add(beliButton);
        add(headertotal);
        add(LabelHarga);
        add(hargasatuan);
        add(LabelJumlah);
        add(jumlah);
        add(Labeltotalharga);
        add(totalharga);
        
        headerpembelian.setFont(headerpembelian.getFont().deriveFont(20.0f));
        headerpembelian.setBounds(25, 20, 440, 24);
        Labelkategori.setBounds(25, 54, 120, 12);
        kategori.setBounds(165, 54, 180, 12);
        Labelharga.setBounds(25, 84, 120, 12);
        harga.setBounds(165, 84, 180, 12);
        Labeljumlah.setBounds(25, 120, 120, 12);
        Inputjumlah.setBounds(165, 120, 180, 20);
        kembaliButton.setBounds(25, 150, 120, 20);
        beliButton.setBounds(180, 150, 120, 20);
        headertotal.setFont(headertotal.getFont().deriveFont(20.0f));
        headertotal.setBounds(25, 180, 440, 24);
        LabelHarga.setBounds(25, 210, 120, 12);
        hargasatuan.setBounds(165, 210, 180, 12);
        LabelJumlah.setBounds(25, 240, 120, 12);
        jumlah.setBounds(165, 240, 180, 12);
        Labeltotalharga.setBounds(25, 270, 120, 12);
        totalharga.setBounds(165, 270, 180, 12);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
