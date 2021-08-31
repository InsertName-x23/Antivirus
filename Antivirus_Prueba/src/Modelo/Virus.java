package Modelo;

public class Virus {

    private String nombreVirus;
    private byte [] secuenciaVirus;

    public Virus(String nombreVirus, byte[] secuenciaVirus) {
        this.nombreVirus = nombreVirus;
        this.secuenciaVirus = secuenciaVirus;
    }

    public byte[] getSecuenciaVirus(){
        return secuenciaVirus;
    }
}
