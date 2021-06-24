package com.feutech.rmiserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenor
 */

//step3
public class Server {
    public static void main(String[] args){
        if(System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }
        try{
            MessengerServiceImplementation msi = new MessengerServiceImplementation();

            MessengerService stub = (MessengerService) UnicastRemoteObject.exportObject(msi,0);
        
            Registry reg = LocateRegistry.getRegistry(1099); 
            
            reg.rebind("Messenger", stub);
            
            System.out.println("Server Ready.....");
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
       
}
