package net.javaguides;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATEST {
    private AAA account;

    @Before
    public void setup() {
        System.out.println("creating customer account: ");
        account = new AAA("Ali", 1000.50f);
    }

    @After
    public void teardown() {
        System.out.println("Test done");
    }

    @Test
    public void testDeposit() {
        float depositamount = 500.25f;
        float expectedbalance = 1500.75f;
        account.deposit(depositamount);
        assertEquals(expectedbalance, account.getBalance(), 0.01f);
    }

    @Test
    public void testWithdraw() {
        float withdrawAmount = 300.50f;
        float expectedBalance = 700.00f;
        account.withdraw(withdrawAmount);
        assertEquals(expectedBalance, account.getBalance(), 0.01f);

    }
}
