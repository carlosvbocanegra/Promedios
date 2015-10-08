/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedios;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface Operaciones extends Remote{
    public int sumaDatos(int x[]) throws RemoteException;
    public double promedio(int x[])throws RemoteException;
    public double desv(int x[]) throws RemoteException;
    public String mostrarDatos(int x[])throws RemoteException;
}
