/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author sesana.federico
 */
public class Process extends Thread{
    private String message;
    
    public void run(){
        while(true) System.out.println(message);
    }
    public Process(String message){
        this.message = message;
    }
}
