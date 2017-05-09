package us.inal.oop;

/**
 * Created by alpereninal on 29/11/16.
 */
public interface OffshoreAccount {

    public double getTaxRate();

    public double getOffshoreBalance();

    public void debit(final double debit);

    public void credit(final double credit);

}
