/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feutech.rmiclient;

import com.feutech.rmiserver.MessengerService;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author kenor
 */
public class Client {
    public static void main(String[] args){
        
        if(System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }
        try{
            Registry registry = LocateRegistry.getRegistry("localhost");
            MessengerService stub = (MessengerService) registry.lookup("Messenger");
            String str = stub.sendMessage("This is a client message.... Awaiting to process request.....");
            System.out.println(str);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
