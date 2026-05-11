package edu.sisinf.estante.modelo;

import java.util.List;

public class Tabla {
    private String nombre;
    private String esquema;
    private List<Columna> columnas;

    //Constructor sin argumentos requerido por Jackson
    public Tabla() {}

    //Constructor con todos los campos
    public Tabla(String nombre, String esquema, List<Columna> columnas) {
        this.nombre = nombre;
        this.esquema = esquema;
        this.columnas = columnas;
    }

    //Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEsquema() { return esquema; }
    public void setEsquema(String esquema) { this.esquema = esquema; }

    public List<Columna> getColumnas() { return columnas; }
    public void setColumnas(List<Columna> columnas) { this.columnas = columnas; }
}
