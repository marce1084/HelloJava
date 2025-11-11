package org.javafintech2025.JavaStandard_WebProgra.Modulo2.Desafio.Ejercicio2;

public class Documento {
    private String tipoDocumento;
    private String numeroDocumento;

    public Documento() {

    }

    public Documento(String tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    // Metodo para mostrar los datos completos de la persona
    public String getDatos(){
        return "Documento [tipo: " + tipoDocumento + ", numero: " + numeroDocumento + "]";
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
