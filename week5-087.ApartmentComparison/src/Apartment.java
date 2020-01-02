
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int totalPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.totalPrice = this.squareMeters * this.pricePerSquareMeter;
    }
    
    public boolean larger(Apartment a2) {
        return this.squareMeters > a2.squareMeters;
    }
    
    public int priceDifference(Apartment a2) {
        return Math.abs(this.totalPrice - a2.totalPrice);
    }
    
    public boolean moreExpensiveThan(Apartment a2) {
        return this.totalPrice > a2.totalPrice;
    }
}
