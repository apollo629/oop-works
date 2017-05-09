package us.inal.oop;

/**
 * Created by alpereninal on 27/11/16.
 */
public class StandardAccount extends AbstractAccount {

    public StandardAccount(double balance) {
        super(balance);
        setOverdraftAvailable(false);
    }

}
