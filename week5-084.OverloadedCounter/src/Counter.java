/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
public class Counter {
    private int counter;
    private boolean check;
    
    public Counter() {
        this(0, false);
    }
    
    public Counter(int startVal) {
        this(startVal, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter(int startVal, boolean check) {
        this.counter = startVal;
        this.check = check;
    }
        
    public int value() {
        return this.counter;
    }
    
    public void increase(int amt) {
        if (amt >= 0) {
            this.counter += amt;
        }
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease(int amt) {
        if (amt >= 0) {
            this.counter -= amt;
            if (this.check && this.counter < 0) {
                this.counter = 0;
            }
        }
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
}
