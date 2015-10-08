/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedios;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Servidor {
    public static void main(String args[]){
        try{
            Operaciones ope = new OperacionesImpl();
            LocateRegistry.createRegistry(1099);
            Naming.bind("ope", ope);
            //Naming.rebind("ope", ope);
            JOptionPane.showMessageDialog(null, "Servidor Funcionando");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
