import javax.swing.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{
    
    private JLabel label1;
    JButton BotonBucar;
    JButton BotonUsar;
    JButton BotonCerrar;

    public Interfaz(){
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
        if(e.getSource() == BotonCerrar){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        Interfaz interfaz1 = new Interfaz();
        interfaz1.setBounds(0, 0, 400, 250);
        interfaz1.setVisible(true); 
        interfaz1.setLocationRelativeTo(null);
        interfaz1.setResizable(false);
    }
}
