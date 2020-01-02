/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        if (this.balance >= 2.5){
            this.balance -= 2.5;
        }
    }
    
    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }
    }
    
    public void loadMoney(double amt) {
        if (amt >= 0.0) {
            this.balance = Math.min(this.balance + amt, 150.0);
        }
    }
}
