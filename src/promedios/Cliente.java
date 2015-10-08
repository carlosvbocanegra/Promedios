/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedios;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Cliente {
    public static void main(String args[]){
        try{
            Operaciones ope=new OperacionesImpl();
            try {
                Naming.lookup("rmi://127.0.0.1/ope");
            } catch (NotBoundException | MalformedURLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            int x[]={4,11,13,2,7};
            System.out.println("Datos:");
            System.out.println(ope.mostrarDatos(x));
            System.out.println("Suma");
            System.out.println(ope.sumaDatos(x));
            System.out.println("Promedio");
            System.out.println(ope.promedio(x));
            System.out.println("Desviación Estándar");
            System.out.println(ope.desv(x));
        }catch(RemoteException e){
            e.printStackTrace();
        }
        System.out.println("Fin.");
    }
}
