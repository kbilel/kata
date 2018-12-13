
public class BankManager {
	public static void main(String[] args) {
		Account account = new Account("bilel", 01, 2000);

		account.deposit(15);
	
		System.out.println("Account owner: " + account.getName());
		System.out.printf("Balance: €%.2f\n", account.getBalance());
	
		
	}
}