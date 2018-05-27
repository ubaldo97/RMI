/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public interface RMIOpciones extends Remote {
     public void registrarP(String a,String b,String c) throws RemoteException;
     public void registrarD(String a,String b,String c,int n, ArrayList arr) throws RemoteException;
     public ArrayList<Persona> buscarP(String nom) throws RemoteException;
     public ArrayList<Docente> buscarD(String nom) throws RemoteException;
}
