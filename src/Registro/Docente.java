/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public class Docente extends Persona implements Serializable{
    protected int nEmpleado;
    protected ArrayList<String> materias;
    
    public Docente(String nombre, String apellido, String curp,int num,ArrayList m) {
        super(nombre, apellido, curp);
        nEmpleado = num;
        materias = m;
        
    }

    public int getnEmpleado() {
        return nEmpleado;
    }

    public void setnEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }
    
    
    
}
