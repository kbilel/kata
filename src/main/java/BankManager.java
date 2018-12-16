
public class BankManager {
	public static void main(String[] args) {
		Account account = new Account("bilel", 01, 2000);
		System.out.println(" ######### Deposit #######");

		try {
			account.deposit(15);
		} catch (NegativeAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account owner: " + account.getName());
		System.out.printf("Balance: €%.2f\n", account.getBalance());
	
	
		
		System.out.println(" ######### Deposit #######");

				account.withdraw(50);
				System.out.println("Account owner: " + account.getName());
				System.out.printf("Balance: €%.2f\n", account.getBalance());
				
				System.out.println("\n     History ");
				System.out.println("------------------------------------");
				for (int i = 0; i < account.getTransactions().size(); i++) {
					System.out.println("Date: " + 
						(account.getTransactions()).get(i).getDate());
				
					System.out.println("Amount: " + 
						(account.getTransactions()).get(i).getAmount());
					System.out.println("Balance: " + 
						(account.getTransactions()).get(i).getBalance());
					System.out.println("Detail: " + 
						(account.getTransactions()).get(i).getDetail());
					System.out.println();
				}
		
	}
}