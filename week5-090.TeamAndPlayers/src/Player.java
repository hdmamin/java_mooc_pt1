/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
public class Player {
    private String name;
    private int numGoals;
    
    public Player(String name, int numGoals) {
        this.name = name;
        this.numGoals = numGoals;
    }
    
    public Player(String name) {
        this(name, 0);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int goals() {
        return this.numGoals;
    }
    
    public String toString() {
        return this.name + ", goals " + this.numGoals;
    }
}
