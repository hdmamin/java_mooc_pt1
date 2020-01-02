
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.0;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens   
        double price = 2.5;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.economicalSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }
    
    public boolean payEconomical(LyyraCard card) {
        boolean flag = card.pay(2.5);
        if (flag) {
            this.economicalSold++;
        }
        return flag;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double price = 4.0;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.gourmetSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }
    
    public boolean payGourmet(LyyraCard card) {
        boolean flag = card.pay(4.0);
        if (flag) {
            this.gourmetSold++;
        }
        return flag;
    }

    public void loadMoneyToCard(LyyraCard card, double amt) {
        if (amt > 0) {
            card.loadMoney(amt);
            this.cashInRegister += amt;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
