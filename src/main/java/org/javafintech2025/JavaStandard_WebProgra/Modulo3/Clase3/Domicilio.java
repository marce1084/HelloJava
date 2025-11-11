package org.javafintech2025.JavaStandard_WebProgra.Modulo3.Clase3;

public class Domicilio {

    private String domicilio;
    private int nro;
    private String localidad;

    public Domicilio(String domicilio, int nro, String localidad) {
        this.domicilio = domicilio;
        this.nro = nro;
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getNro() {
        return nro;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
