
public class BankManager {
	public static void main(String[] args) {
		Account account = new Account("bilel", 01, 2000);
		System.out.println(" ######### Deposit #######");

		account.deposit(15);
		System.out.println("Account owner: " + account.getName());
		System.out.printf("Balance: €%.2f\n", account.getBalance());
	
	
		
		System.out.println(" ######### Deposit #######");

				account.withdraw(50);
				System.out.println("Account owner: " + account.getName());
				System.out.printf("Balance: €%.2f\n", account.getBalance());
		
	}
}