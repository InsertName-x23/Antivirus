package PaquetePrueba;
import javax.swing.*;

import java.io.File;

import java.awt.event.*;
import java.io.File;

public class Prueba1 extends JFrame implements ActionListener{
    
    private JLabel label1;
    JButton BotonBucar;
    JButton BotonUsar;
    JButton BotonCerrar;

    public Prueba1(){
        setLayout(null);
        
        label1 = new JLabel("╔ Antivirus ╝");
        label1.setBounds(155, 20, 200, 30);
        add(label1);

        BotonBucar = new JButton("▓ Buscar Archivo ▓");
        BotonBucar.setBounds(95, 60, 200, 30);
        add(BotonBucar);
        BotonBucar.addActionListener(this);

        BotonUsar = new JButton("▓ Como usar ▓");
        BotonUsar.setBounds(95, 100, 200, 30);
        add(BotonUsar);
        BotonUsar.addActionListener(this);

        BotonCerrar = new JButton("▓ Cerrar ▓");
        BotonCerrar.setBounds(95, 140, 200, 30);
        add(BotonCerrar);
        BotonCerrar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == BotonUsar){
            Prueba2 abrir = new Prueba2();
            abrir.setVisible(true);
        }
        if(e.getSource() == BotonCerrar){
            System.exit(0);
        }
        if(e.getSource() == BotonBucar){
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++)         {

            if (listOfFiles[i].isFile())             {
                files = listOfFiles[i].getName();
                System.out.println(files);
                }
            }    
        }
    }
    public static void main(String[] args){
        Prueba1 interfaz1 = new Prueba1();
        interfaz1.setBounds(0, 0, 400, 250);
        interfaz1.setVisible(true); 
        interfaz1.setLocationRelativeTo(null);
        interfaz1.setResizable(false);
    }
}