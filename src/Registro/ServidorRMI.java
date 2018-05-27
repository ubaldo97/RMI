/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class ServidorRMI {
    public static void main(String args[]){
        try {
            ObjetoRemoto obj = new ObjetoRemoto();
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.bind("Objeto Remoto", obj);
            System.out.println("Servidor activo...");
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
