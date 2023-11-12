package com.example.temucovet;
public class Contacto {
    int id;
    String nombreperro;
    String raza;
    String nombredueno;
    String telefono;
    String historiaclinico;

    public Contacto(){

    }
    public Contacto(String nombreperro, String raza, String nombredueno, String telefono, String historiaclinico) {
        this.nombreperro = nombreperro;
        this.raza = raza;
        this.nombredueno = nombredueno;
        this.telefono = telefono;
        this.historiaclinico = historiaclinico;
    }
    public Contacto(int id, String nombreperro, String raza, String nombredueno, String telefono, String historiaclinico) {
        this.id = id;
        this.nombreperro = nombreperro;
        this.raza = raza;
        this.nombredueno = nombredueno;
        this.telefono = telefono;
        this.historiaclinico = historiaclinico;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreperro() {
        return nombreperro;
    }

    public void setNombreperro(String nombreperro) {
        this.nombreperro = nombreperro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombredueno() {
        return nombredueno;
    }

    public void setNombredueno(String nombredueno) {
        this.nombredueno = nombredueno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHistoriaclinico() {
        return historiaclinico;
    }

    public void setHistoriaclinico(String historiaclinico) {
        this.historiaclinico = historiaclinico;
    }

}
