/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraSimple;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ruben
 */
public class ObjetoRemoto extends UnicastRemoteObject implements RMIOperaciones{
    
    public ObjetoRemoto()throws RemoteException{
        super();
    }    

    public float sumar(float a, float b) throws RemoteException{
        return (a+b);
    }
    
    public float restar(float a, float b) throws RemoteException{
        return (a-b);
    }

    public float multiplicar(float a, float b) throws RemoteException{
        return (a*b);
    }
   
    public float dividir(float a, float b) throws RemoteException{
        return (a/b);
    }
    
}
