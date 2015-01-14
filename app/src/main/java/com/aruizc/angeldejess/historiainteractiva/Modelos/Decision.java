package com.aruizc.angeldejess.historiainteractiva.Modelos;

/**
 * Created by AngeldeJesús on 07/01/2015.
 */
public class Decision {
    private String Texto;
    private int SiguientePagina;

    public  Decision(String texto,int sigPagina){
        Texto = texto;
        SiguientePagina = sigPagina;

    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public int getSiguientePagina() {
        return SiguientePagina;
    }

    public void setSiguientePagina(int siguientePagina) {
        SiguientePagina = siguientePagina;
    }
}
