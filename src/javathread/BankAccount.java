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
public class BankAccount {
    private int total;
    private int tax = 100;

    public BankAccount(int total) {
        this.total = total;
    }
    
    public void add(int amount) {
        total += (amount - tax);
    }
    
    public int tot(){
        return total;
    }
}
