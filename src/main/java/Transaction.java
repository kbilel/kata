public class Transaction {
	private java.util.Date date;
	
	private double amount;
	private double balance;
	private String detail;

	
	public Transaction(char type, double amount, 
		double balance, String detail) {
		date = new java.util.Date();
		this.amount = amount;
		this.balance = balance;
		this.detail = detail;
	}

	
	public String getDate() {
		return date.toString();
	}
	

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDetail() {
		return detail;
	}
}