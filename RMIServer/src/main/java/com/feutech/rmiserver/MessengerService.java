/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feutech.rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kenor
 */


//Step 1 - Defining remote interface
public interface MessengerService extends Remote{
    //Signitures
    String sendMessage(String clientMessage) throws RemoteException;

}
