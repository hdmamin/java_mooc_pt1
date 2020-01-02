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

public class Grades {
    private ArrayList<Integer> grades;
    private int numGrades;
    private int[] binCounts;
    private double percent;
    
    public Grades(ArrayList<Integer> grades) {
        this.grades = grades;
        this.numGrades = grades.size();
        this.binCounts = new int[6];
        this.percent = 0.0;
    }
    
    public void calcDistribution() {
        for (int grade:this.grades) {
            // Scores filtered before initializing grades, 0 is placeholder.
            int bin = 0;
            if (grade <= 29) {
                bin = 0;
            } else if (grade <= 34) {
                bin = 1;
            } else if (grade <= 39) {
                bin = 2;
            } else if (grade <= 44) {
                bin = 3;
            } else if (grade <= 49) {
                bin = 4;
            } else if (grade <= 60) {
                bin = 5;
            }
            this.binCounts[bin] += 1;
        }
    }
    
    public double acceptPercent() {
        return 100 * (1 - (double)this.binCounts[0] / this.numGrades);
    }
    
    public int getNumGrades() {
        return this.numGrades;
    }
    
    public void printDistribution() {
        for (int i=5; i>=0; i--) {
            System.out.print(i + ": ");
            for (int j=0; j<this.binCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
