package Controladores;

import Modelo.Virus;

public class Analizador {
    
    private byte [] bytesArchivo;
    private Virus [] listaVirus; 

    public Analizador(byte[] bytesArchivo){

        this.bytesArchivo = bytesArchivo;
    }

    public void cargarVirus(){
        
        // Todo en esta clase sirve para la funcion del boton analizador de archivos, que es el que busca si hay virus en el archivo seleccionado
        
        Virus Usama = new Virus("USAMA", new byte []{15, 30, 15, 49});
        Virus Antrax = new Virus("ANTRAX", new byte []{72, 72, 15, 29});
        Virus Ebola = new Virus("EBOLA", new byte []{29, 32, 53, 29});
        Virus H1N1 = new Virus("H1N1", new byte []{72, 32, 32, 20});
        Virus Covid19 = new Virus("COVID19", new byte []{30, 25, 20, 19});

        listaVirus = new Virus [5];

        listaVirus [0] = Usama;
        listaVirus [1] = Antrax;
        listaVirus [2] = Ebola;
        listaVirus [3] = H1N1;
        listaVirus [4] = Covid19;
    }

    public void detectarVirus(){

        //Esta parte sirve para detectar los virus, utilizando "ifs" en los digitos del archivo
        
        for(int i = 0; i < bytesArchivo.length; i++){

            if(bytesArchivo [i] == listaVirus[0].getSecuenciaVirus()[0]){
                
                if(bytesArchivo [i+1] == listaVirus[0].getSecuenciaVirus()[1]){
                   
                    if(bytesArchivo [i+2] == listaVirus[0].getSecuenciaVirus()[2]){

                        if(bytesArchivo [i+3] == listaVirus[0].getSecuenciaVirus()[3]){

                            System.out.print("USAMA Encontrado");
                        }
                    }
                }
            }

            if(bytesArchivo [i] == listaVirus[1].getSecuenciaVirus()[0]){
                
                if(bytesArchivo [i+1] == listaVirus[1].getSecuenciaVirus()[1]){
                   
                    if(bytesArchivo [i+2] == listaVirus[1].getSecuenciaVirus()[2]){

                        if(bytesArchivo [i+3] == listaVirus[1].getSecuenciaVirus()[3]){

                            System.out.print("ANTRAX Encontrado");
                        }
                    }
                }
            }

            if(bytesArchivo [i] == listaVirus[2].getSecuenciaVirus()[0]){
                
                if(bytesArchivo [i+1] == listaVirus[2].getSecuenciaVirus()[1]){
                   
                    if(bytesArchivo [i+2] == listaVirus[2].getSecuenciaVirus()[2]){

                        if(bytesArchivo [i+3] == listaVirus[2].getSecuenciaVirus()[3]){

                            System.out.print("EBOLA Encontrado");
                        }
                    }
                }
            }

            if(bytesArchivo [i] == listaVirus[3].getSecuenciaVirus()[0]){
                
                if(bytesArchivo [i+1] == listaVirus[3].getSecuenciaVirus()[1]){
                   
                    if(bytesArchivo [i+2] == listaVirus[3].getSecuenciaVirus()[2]){

                        if(bytesArchivo [i+3] == listaVirus[3].getSecuenciaVirus()[3]){

                            System.out.print("H1N1 Encontrado");
                        }
                    }
                }
            }

            if(bytesArchivo [i] == listaVirus[4].getSecuenciaVirus()[0]){
                
                if(bytesArchivo [i+1] == listaVirus[4].getSecuenciaVirus()[1]){
                   
                    if(bytesArchivo [i+2] == listaVirus[4].getSecuenciaVirus()[2]){

                        if(bytesArchivo [i+3] == listaVirus[4].getSecuenciaVirus()[3]){

                            System.out.print("COVID19 Encontrado");
                        }
                    }
                }
            }
        }
    }
}
