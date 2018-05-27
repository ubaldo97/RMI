/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraSimple;
import java.rmi.*;
import java.rmi.RemoteException;
/**
 *
 * @author ruben
 */
public interface RMIOperaciones extends Remote {
    public float sumar(float a, float b) throws RemoteException;
    public float restar(float a, float b) throws RemoteException;
    public float multiplicar(float a, float b) throws RemoteException;
    public float dividir(float a, float b) throws RemoteException;
}
