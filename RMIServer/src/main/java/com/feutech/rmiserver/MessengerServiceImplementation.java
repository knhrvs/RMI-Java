package com.feutech.rmiserver;


import com.feutech.rmiserver.MessengerService;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenor
 */


//Step 2 - Create implementation interface
public class MessengerServiceImplementation implements MessengerService{

    @Override
    public String sendMessage(String clientMessage) throws RemoteException {
         unexposeMethod();
         System.out.println(clientMessage);
         return "Process complete from the server";
    }
    
    public void unexposeMethod(){
        System.out.println("Process some logic here....");
    }
}
