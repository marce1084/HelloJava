package org.javafintech2025.JavaStandard_WebProgra.Modulo2.ClasesObjetos;

public class Documento {

    private String TipoDocumento;
    private String NumeroDocumento;

    // Constructor por defecto
    public Documento(){ }

    // Constructor con parametros
    public Documento(String tipoDocumento, String numeroDocumento){
        this.TipoDocumento = tipoDocumento;
        this.NumeroDocumento = numeroDocumento;
    }

    String mostrarAtributos(){
        return "tipoDocumento = " + TipoDocumento + ", numeroDocumento = " + NumeroDocumento;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        NumeroDocumento = numeroDocumento;
    }
}
