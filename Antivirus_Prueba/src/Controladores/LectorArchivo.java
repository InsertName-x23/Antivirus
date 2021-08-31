package Controladores;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;

public class LectorArchivo {
    
    private File archivo;
    private byte [] bytesArchivo;

    public LectorArchivo(File archivo) {
        this.archivo = archivo;
    }

    public byte [] leerArchivo() throws IOException {

        bytesArchivo = Files.readAllBytes(this.archivo.toPath());
        return bytesArchivo; 
    }
}
