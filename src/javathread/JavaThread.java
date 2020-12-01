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
public class JavaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
//        Process T1 = new Process("T1");
//        Process T2 = new Process("T2");
//        T1.start();
//        T2.start();
//        Thread.sleep(5000);
//        T1.stop();

//        RunnableProcess p1 = new RunnableProcess("pp1");
//        Thread t1 = new Thread(p1);
//        t1.start();
//        
//        Thread.sleep(5000);
//        p1.stup();

        BankAccount account = new BankAccount(2000);
        Atm atm1 = new Atm(account);
        Atm atm2 = new Atm(account);
        Thread juan = new Thread(atm1);
        Thread mawiateresa = new Thread(atm2);
        
        juan.start();
        mawiateresa.start();
        atm1.add(500);
        atm2.add(800);  
    }
    
}
