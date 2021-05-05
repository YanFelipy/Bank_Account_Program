package entities;

import entities.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	private double whitdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, double balance, double whitdrawLimit) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.whitdrawLimit = whitdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWhitdrawLimit() {
		return whitdrawLimit;
	}

	public void depositBalance(double balance) {
		balance += balance;
	}

	public void whitdrawBalance(double amount) throws DomainException {
		
		if (amount > this.whitdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (balance < 1.0) {
			throw new DomainException("Withdraw error: Not enough balance");
		}

		balance -= amount;
	}
	           
	}