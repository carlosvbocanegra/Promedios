/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedios;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class OperacionesImpl  extends UnicastRemoteObject implements Operaciones{
    public OperacionesImpl() throws RemoteException{
        super();
    }
    
    public int sumaDatos(int x[]) throws RemoteException{
        int resultado=0;
        for(int i=0;i<x.length;i++){
            resultado=resultado+x[i];
        }
        return resultado;
    }
    
    public double promedio(int x[]) throws RemoteException{
        return (double)(sumaDatos(x)/x.length);
    }
    
    public double desv(int x[])throws RemoteException{
        double val=0;
        for(int i=0; i<x.length;i++){
            val+=pow(2,(x[i]-promedio(x)));
        }
        return(sqrt((1/(x.length-1))*val));
    }
    
    public String mostrarDatos(int x[]) throws RemoteException{
        String datos;
        datos="";
        datos+="["+Integer.toString(x[0]);
        for(int i=1;i<x.length-1;i++){
            datos+=","+x[i];
        }
        datos+=","+x[x.length-1]+"]";
        return datos;
    }
}
