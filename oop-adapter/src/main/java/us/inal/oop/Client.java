package us.inal.oop;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args ) {
        Account sa = new StandardAccount(2000);
        System.out.println("Standard Account Balance= " + sa.getBalance());

        //Calling getBalance() on Adapter
        OffshoreAccount ofs = new OffshoreAccountImpl(2000);

        Account adapter = new AccountAdapter(ofs);
        
        System.out.println("Offshore Account Balance= " + adapter.getBalance());

    }
}
