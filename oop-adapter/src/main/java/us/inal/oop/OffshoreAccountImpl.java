package us.inal.oop;

/**
 * Created by alpereninal on 27/11/16.
 */
public class OffshoreAccountImpl  implements OffshoreAccount{

    private double balance;

    /** The tax for the country where the account is */
    private static final double TAX_RATE = 0.04;

    public OffshoreAccountImpl(final double balance) {
        this.balance = balance;
    }

    public double getTaxRate() {
        return TAX_RATE;
    }

    public double getOffshoreBalance() {
        return balance;
    }

    public void debit(final double debit) {
        if (balance >= debit) {
            balance -= debit;
        }
    }

    public void credit(final double credit) {
        balance += balance;
    }

}
