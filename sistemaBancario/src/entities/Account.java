package entities;

import exception.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException{
		if(balance < amount) {
			throw new DomainException("Not enough balance");
		}
		else if(withdrawLimit < amount) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		else {
			balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		return "New balance: " + balance;
	}
	
}
