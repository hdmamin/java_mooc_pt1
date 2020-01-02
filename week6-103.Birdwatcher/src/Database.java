/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds;
    private ArrayList<Integer> observations;
    
    public Database() {
        this.birds = new ArrayList<Bird>();
        this.observations = new ArrayList<Integer>();
    }
    
    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        if (!this.birds.contains(newBird)) {
            this.birds.add(newBird);
            this.observations.add(0);
        }
    }
    
    public void addObservation(String name) {
        for (int i=0; i<this.birds.size(); i++) {
            if (this.birds.get(i).getName().equals(name)) {
                this.observations.set(i, this.observations.get(i)+1);
            }
        }
    }
    
    public void printStats() {
        for (int i=0; i<this.birds.size(); i++) {
            System.out.println(this.birds.get(i) + ": " +
                               this.observations.get(i) + " observations");
        }
    }
    
    public void printBird(String name) {
        // Initialize w/ dummy values.
        int count = -1;
        int idx = -1;
        for (int i=0; i<this.birds.size(); i++) {
            if (this.birds.get(i).getName().equals(name)) {
                count = this.observations.get(i);
                idx = i;
                break;
            }
        }

        if (count > -1) {
            System.out.println(this.birds.get(idx) + ": " + count + " observations");
        }
    }
    
}
