/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(double density) {
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height) {
        this(.1, width, height);
    }
    
    public void printLine() {
        // Tried to instantiate random as a instance var but TMC tests wouldn't allow it.
        Random random = new Random();
        for (int i=0; i<this.width; i++) {
            double prob = random.nextDouble();
            if (prob < this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i=0; i<this.height; i++) {
            this.printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
    
}
