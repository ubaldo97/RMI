/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import java.io.Serializable;

/**
 *
 * @author ruben
 */
public class Persona implements Serializable{
   protected String nombre;
   protected String apellido;
   protected String curp;

    public Persona(String nombre, String apellido, String curp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
   
   
   
}
