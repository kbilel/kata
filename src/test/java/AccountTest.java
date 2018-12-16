import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
	
	
	@Test
	public void bank_manager_should_add_balance_when_deposit() throws Exception {
		Account account = new Account("bilel", 01, 2000);
		account.deposit(14);
assertEquals(2014, account.getBalance(),0);

	}
	
	@Test(expected=NegativeAmountException.class)
	public void bank_manager_should_throw__NegativeAmountException_when_ammout_negative_deposit() throws Exception {
		Account account = new Account("bilel", 01, 2000);
		account.deposit(-14);
assertEquals(1986, account.getBalance(),0);

	}
	
	@Test
	public void bank_manager_should_reduce_balance_when_withdraw() throws Exception {
		Account account = new Account("bilel", 01, 2000);
		account.withdraw(50);
assertEquals(1950, account.getBalance(),0);

	}
	
	@Test(expected=NegativeAmountException.class)
	public void bank_manager_should_throw__NegativeAmountException_when_balanc_is_negative() throws Exception {
		Account account = new Account("bilel", 01, -2);
		account.withdraw(14);
assertEquals(1986, account.getBalance(),0);

	}
	
	@Test
	public void transaction_description_should_be__equal_to_WITHDRAWL_when_withraw() throws Exception {
		Account account = new Account("bilel", 01, 2000);
		account.withdraw(50);
		
assertEquals("WITHDRAWL", account.getTransactions().get(0).getDetail());

	}

	
	@Test
	public void transaction_description_should_be__equal_to_DEPOSIT_when_withraw() throws Exception {
		Account account = new Account("bilel", 01, 2000);
		account.deposit(50);
		
assertEquals("DEPOSIT", account.getTransactions().get(0).getDetail());

	}
}
