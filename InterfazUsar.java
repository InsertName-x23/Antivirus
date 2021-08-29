import javax.swing.*;
import java.awt.event.*;

public class InterfazUsar extends JFrame implements ActionListener{

    private JLabel labelTitulo;
    private JLabel labelUsar;
    JButton BotonAtras; 

    public InterfazUsar(){
        setLayout(null);

        labelTitulo = new JLabel("¿Como usar?");
        labelTitulo.setBounds(155, 5, 200, 30);
        add(labelTitulo);

        labelUsar = new JLabel("Seleccione un archivo en Buscar Archivo");
        labelUsar.setBounds(90, 50, 400, 30);
        add(labelUsar);

        BotonAtras = new JButton("Atras");
        BotonAtras.setBounds(100, 120, 200, 30);
        add(BotonAtras);
        BotonAtras.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == BotonAtras){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        InterfazUsar interfaz2 = new InterfazUsar();
        interfaz2.setBounds(0, 0, 400, 250);
        interfaz2.setVisible(true); 
        interfaz2.setLocationRelativeTo(null);
        interfaz2.setResizable(false);
    }
}