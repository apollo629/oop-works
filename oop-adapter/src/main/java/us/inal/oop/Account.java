package us.inal.oop;

/**
 * Created by alpereninal on 27/11/16.
 */
public interface Account {

    public double getBalance();
    public boolean isOverdraftAvailable();
    public void credit(final double credit);

}
