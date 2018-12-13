

import java.util.Date;
import java.util.ArrayList;

public class Account {
	private String name;
	private int id;
	private double balance;
	private Date dateCreated;
	

	Account() {
		name = "";
		id = 0;
		balance = 0;
		dateCreated = new Date(); 
	}

	Account(int id, double balance) {
		name = "";
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}


	Account(String name, int id, double balance) {
		this(id, balance);
		this.name = name;
	}

	public void withdraw(double amount) {
		balance -= amount;
		;
	}

	public void deposit(double amount) {
		balance += amount;
	
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

	





}