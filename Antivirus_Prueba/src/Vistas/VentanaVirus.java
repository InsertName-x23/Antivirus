package Vistas;

import javax.swing.*;

import Controladores.Analizador;
import Controladores.LectorArchivo;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class VentanaVirus extends JFrame implements ActionListener{
    
    private byte [] bytesArchivo = null;
    private JTextArea MostrarRuta;
    private JTextArea MostrarContenido;
    private JLabel Titulo;
    private JButton BotonBucar;
    private JButton BotonUsar;
    private JButton BotonCerrar;

    public VentanaVirus(){
        setLayout(null);
        
        Titulo = new JLabel("╔ Antivirus ╝");
        Titulo.setBounds(250, 10, 200, 30);
        add(Titulo);

        MostrarRuta = new JTextArea();
        MostrarRuta.setBounds(30, 100, 300, 30);
        MostrarRuta.setEditable(false);
        add(MostrarRuta);

        MostrarContenido = new JTextArea();
        MostrarContenido.setBounds(30, 180, 540, 270);
        MostrarContenido.setEditable(false);
        MostrarContenido.setLineWrap(true);
        MostrarContenido.setWrapStyleWord(true);
        add(MostrarContenido);

        BotonBucar = new JButton("▓ Buscar Archivo ▓");
        BotonBucar.setBounds(350, 60, 200, 30);
        add(BotonBucar);
        BotonBucar.addActionListener(this);

        BotonUsar = new JButton("▓ Analizar ▓");
        BotonUsar.setBounds(350, 100, 200, 30);
        add(BotonUsar);
        BotonUsar.addActionListener(this);

        BotonCerrar = new JButton("▓ Cerrar ▓");
        BotonCerrar.setBounds(350, 140, 200, 30);
        add(BotonCerrar);
        BotonCerrar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == BotonBucar){
            JFileChooser explorador = new JFileChooser();
            explorador.showOpenDialog(this);

            File archivo = explorador.getSelectedFile();
            MostrarRuta.setText(archivo.getPath());

            LectorArchivo myLector = new LectorArchivo(archivo);

            try {

                this.bytesArchivo = myLector.leerArchivo();

            } catch (IOException e1) {
                e1.printStackTrace();
            }

            String cadena = "";
            for(int i = 0; i < this.bytesArchivo.length; i++){

                cadena = cadena + this.bytesArchivo [i] + " ";
            }

            MostrarContenido.setText(cadena);
        }

        if(e.getSource() == BotonUsar){

            Analizador myanalizador = new Analizador(bytesArchivo);
            myanalizador.cargarVirus();
            myanalizador.detectarVirus();
        }

        if(e.getSource() == BotonCerrar){
            System.exit(0);
        }
    }
    public static void main(String[] args){
        VentanaVirus interfaz1 = new VentanaVirus();
        interfaz1.setBounds(0, 0, 600, 500);
        interfaz1.setVisible(true); 
        interfaz1.setLocationRelativeTo(null);
        interfaz1.setResizable(false);
    }
}