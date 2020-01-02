
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account accA = new Account("A", 100.0);
        Account accB = new Account("B", 0.0);
        Account accC = new Account("C", 0.0);
        
        transfer(accA, accB, 50.0);
        transfer(accB, accC, 25.0);
    }
    
    public static void transfer(Account fromAcc, Account toAcc, double amt) {
        fromAcc.withdrawal(amt);
        toAcc.deposit(amt);
    }


}
