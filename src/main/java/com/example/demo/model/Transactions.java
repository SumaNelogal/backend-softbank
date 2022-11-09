package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transactions")

public class Transactions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long TransactionID;
	
	private String AccountNumber;
	private String AccountTypeID;
	private String TransactionType;
	private Date TransactionDate;
	private String Amount;
	
	
	public Transactions() {
		super();
	}


	public long getTransactionID() {
		return TransactionID;
	}


	public void setTransactionID(long transactionID) {
		TransactionID = transactionID;
	}


	public String getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}


	public String getAccountTypeID() {
		return AccountTypeID;
	}


	public void setAccountTypeID(String accountTypeID) {
		AccountTypeID = accountTypeID;
	}


	public String getTransactionType() {
		return TransactionType;
	}


	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}


	public Date getTransactionDate() {
		return TransactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}


	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}
	
	

}
