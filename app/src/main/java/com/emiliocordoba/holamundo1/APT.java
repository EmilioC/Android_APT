package com.emiliocordoba.holamundo1;

/**
 * Created by cordo on 03/09/2017.
 */

public class APT {

    private String cliente;
    private String zona;
    private String fecha;
    private String descripcionApt;
    private String correccionApt;
    private String tipoAPT;
    private String categoriaApt;

    public APT(String cliente, String zona, String fecha, String descripcionApt, String correccionApt, String tipoAPT, String categoriaApt) {
        this.cliente = cliente;
        this.zona = zona;
        this.fecha = fecha;
        this.descripcionApt = descripcionApt;
        this.correccionApt = correccionApt;
        this.tipoAPT = tipoAPT;
        this.categoriaApt = categoriaApt;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionApt() {
        return descripcionApt;
    }

    public void setDescripcionApt(String descripcionApt) {
        this.descripcionApt = descripcionApt;
    }

    public String getCorreccionApt() {
        return correccionApt;
    }

    public void setCorreccionApt(String correccionApt) {
        this.correccionApt = correccionApt;
    }

    public String getTipoAPT() {
        return tipoAPT;
    }

    public void setTipoAPT(String tipoAPT) {
        this.tipoAPT = tipoAPT;
    }

    public String getCategoriaApt() {
        return categoriaApt;
    }

    public void setCategoriaApt(String categoriaApt) {
        this.categoriaApt = categoriaApt;
    }
}
