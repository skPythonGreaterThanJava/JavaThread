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
public class Atm implements Runnable{
    
    BankAccount ba;

    public Atm(BankAccount ba) {
        this.ba = ba;
    }    
    
    @Override
    public void run() {
        
    }
    
    public void add(int amount){
        ba.add(amount);
        System.out.println("Money: " + ba.tot());
    }
    
    
    
}
