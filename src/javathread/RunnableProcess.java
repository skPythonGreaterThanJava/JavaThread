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
public class RunnableProcess implements Runnable{
    private boolean stop;
    String s;
    
    public RunnableProcess(String s){
        stop = false;
        this.s = s;
    }
    
    public void run(){
        while(!stop)
            System.out.println(s);
    }
    
    public void stup(){
        stop = true;
    }
}
