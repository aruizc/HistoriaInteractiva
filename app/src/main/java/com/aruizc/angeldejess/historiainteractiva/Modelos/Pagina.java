package com.aruizc.angeldejess.historiainteractiva.Modelos;

/**
 * Created by AngeldeJesús on 07/01/2015.
 */
public class Pagina {
    private int IdImagen;
    private String Texto;
    private Decision Decision1;
    private Decision Decision2;
    private boolean esFinal = false;

    public boolean getIsFinal() {
        return esFinal;
    }

    public void setEsFinal(boolean esFinal) {
        this.esFinal = esFinal;
    }

    public Pagina(int idImagen,String texto,Decision decision1, Decision decision2 ){
        IdImagen = idImagen;
        Texto = texto;
        Decision1 = decision1;
        Decision2 = decision2;
    }

    public  Pagina(int idImagen, String texto){
        IdImagen = idImagen;
        Texto = texto;
        esFinal = true;
    }

    public Pagina(int indice){

    }

    public int getIdImagen() {
        return IdImagen;
    }

    public void setIdImagen(int idImagen) {
        IdImagen = idImagen;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public Decision getDecision1() {
        return Decision1;
    }

    public void setDecision1(Decision decision1) {
        Decision1 = decision1;
    }

    public Decision getDecision2() {
        return Decision2;
    }

    public void setDecision2(Decision decision2) {
        Decision2 = decision2;
    }




}
