package us.inal.oop;

/**
 * Created by alpereninal on 27/11/16.
 */
public class AbstractAccount implements Account {
    private double balance;
    private boolean isOverdraftAvailable;

    public AbstractAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean isOverdraftAvailable() {
        return isOverdraftAvailable;
    }

    public void setOverdraftAvailable(boolean isOverdraftAvailable) {
        this.isOverdraftAvailable = isOverdraftAvailable;
    }

    @Override
    public void credit(double credit) {
        balance +=credit;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "balance=" + balance +
                ", isOverdraftAvailable=" + isOverdraftAvailable +
                '}';
    }
}
