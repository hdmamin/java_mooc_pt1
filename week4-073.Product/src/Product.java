/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
public class Product {
    private String name;
    private double price;
    private int amount;
    
    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    public void printProduct() {
        System.out.print(this.name + ", ");
        System.out.print("price " + this.price + ", ");
        System.out.print("amount " + this.amount);
    }
}
