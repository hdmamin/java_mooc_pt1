/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
public class BoundedCounter {
    private int counter;
    private int upper;
    
    public BoundedCounter(int upper) {
        this.upper = upper;
    }
    
    public void next() {
        if (this.counter == this.upper) {
            this.counter = 0;
        } else {
            this.counter++;
        }
    }
    
    public int getValue() {
        return this.counter;
    }
    
    public void setValue(int num) {
        if (num >= 0 && num <= this.upper) {
            this.counter = num;
        }
    }
    
    public String toString() {
        String countString = this.counter + "";
        if (this.counter < 10) {
            countString = "0" + countString;
        }
        return countString;
    }
}
