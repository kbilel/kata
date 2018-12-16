

import java.util.Date;
import java.util.ArrayList;

public class Account {
	private String name;
	private int id;
	private double balance;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	

	public Account() {
		name = "";
		id = 0;
		balance = 0;
		dateCreated = new Date(); 
		transactions = new ArrayList<Transaction>();
	}

	public Account(int id, double balance) {
		name = "";
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}


	public Account(String name, int id, double balance) {
		this(id, balance);
		this.name = name;
	}

	public void withdraw(double amount) {
		
		
		if(balance-amount<0) throw new NegativeAmountException("No enough balance ");
		else if (amount <0)throw new NegativeAmountException("Witdhrawal amount can't be negatives ");
		 else  
		 {
			 balance -= amount;
				transactions.add(new Transaction( amount, balance, 
						TransactionType.WITHDRAWL.toString()));
		 }
	}

	public void deposit(double amount) throws NegativeAmountException {
		
		if(amount<0) throw new NegativeAmountException("Deposit Amount can't be  negative");
		else if  (balance>0 && amount>0) {
		balance += amount;
		transactions.add(new Transaction(amount, balance, 
				TransactionType.DEPOSIT.toString()));
		}
		else throw new NegativeAmountException("No enough balance");
		
	
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

	
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}


	public String getDateCreated() {
		return dateCreated.toString();
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public enum TransactionType {
	    WITHDRAWL,
	    DEPOSIT
	}





}