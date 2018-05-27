/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class ObjetoRemoto extends UnicastRemoteObject implements RMIOpciones {
    protected ArrayList<Persona> lista;
    protected ArrayList<Docente> lista2;
    int cont = 0;
    int cont2=0;
    
    public ObjetoRemoto()throws RemoteException{
        super();
        lista = new ArrayList();
        lista2 = new ArrayList();
    }  

    @Override
    public void registrarP(String a, String b, String c) throws RemoteException {
        if((!a.equals(""))&& (!b.equals(""))&& (!c.equals(""))){
            if(lista.size()==0){
        Persona p = new Persona(a,b,c); 
        lista.add(p);
        JOptionPane.showMessageDialog(null, "Registro Exitoso!");
            }else{
                for(int i=0;i<lista.size();i++){
                    if((lista.get(i).getCurp()).equals(c)){
                        cont++;
                    }                 
                }
                if(cont>0){
                     JOptionPane.showMessageDialog(null, "CURP ya existe intente de nuevo!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                    Persona p = new Persona(a,b,c); 
                    lista.add(p);
                    JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public void registrarD(String a, String b, String c,int n, ArrayList arr) throws RemoteException {
             if((!a.equals(""))&& (!b.equals(""))&& (!c.equals(""))&& (n != 0)&& (arr.size()>0)){
            if(lista2.size()==0){
                Docente d = new Docente(a,b,c,n,arr); 
                lista2.add(d);
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
            }else{
                for(int i=0;i<lista2.size();i++){
                    if(((lista2.get(i).getCurp()).equals(c)) || (lista2.get(i).getnEmpleado()==n)){
                        cont2++;
                    }                 
                }
                if(cont2>0){
                       JOptionPane.showMessageDialog(null, "CURP ya existe intente de nuevo!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                     Docente d = new Docente(a,b,c,n,arr); 
                     lista2.add(d);
                    JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos los campos son requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    
    }

    @Override
    public ArrayList<Docente> buscarD(String nom) throws RemoteException {
         
        ArrayList<Docente> doc = new ArrayList();
        for(int i=0;i<lista2.size();i++){
            if(lista2.get(i).nombre.equalsIgnoreCase(nom)){
                doc.add(lista2.get(i));
            }
        }
        return doc;
        
    }

    @Override
    public ArrayList<Persona> buscarP(String nom) throws RemoteException {
        
        ArrayList<Persona> per = new ArrayList();
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).nombre.equalsIgnoreCase(nom)){
                per.add(lista.get(i));
            }
        }
        return per;
        
    }


}
