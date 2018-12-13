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
	
	@Test
	public void bank_manager_should_reduce_balance_when_withdraw() throws Exception {
		Account account = new Account("bilel", 01, 2000);
		account.withdraw(50);
assertEquals(1950, account.getBalance(),0);

	}
	
	@Test
	public void transaction_description_should_be__equal_to_Withdrawal_when_withraw() throws Exception {
		Account account = new Account("bilel", 01, 2000);
		account.withdraw(50);
		
assertEquals("Withdrawal", account.getTransactions().get(0).getDetail());

	}

}
