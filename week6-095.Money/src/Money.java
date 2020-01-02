
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money newMoney) {
        return new Money(this.euros+newMoney.euros, this.cents+newMoney.cents);
    }
    
    public boolean less(Money newMoney) {
        return this.euros < newMoney.euros || 
                (this.euros == newMoney.euros && this.cents < newMoney.cents);
    }
    
    public Money minus(Money newMoney) {
        if (this.less(newMoney)) {
            return new Money(0, 0);
        }
        
        int euros = this.euros - newMoney.euros;
        int cents = this.cents - newMoney.cents;
        if (euros > 0 && cents < 0) {
            cents = 100 + cents;
            euros--;
        }
        return new Money(euros, cents);
    }

}
