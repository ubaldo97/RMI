/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraSimple;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class ClienteRMI {
    public static void main(String arg[]){
        try{
            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
            RMIOperaciones rmio;
            rmio = (RMIOperaciones)reg.lookup("Objeto Remoto");
            System.out.println("Suma: 12 y 34 = "+ rmio.dividir(12, 34));          
        }catch(RemoteException re){
            re.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
}
