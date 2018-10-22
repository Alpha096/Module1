package com.cg.mra.dao;

import com.cg.mra.beans.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountDAOImpl implements AccountDAO{
	
	Map<String,Account> accountEntry;
	public AccountDAOImpl(){
		accountEntry = new HashMap<>();
		accountEntry.put("9010210131", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Megha", 453));
		accountEntry.put("9932012345", new Account("Prepaid", "Vikas", 631));
		accountEntry.put("9010210132", new Account("Prepaid", "Anju", 521));
		accountEntry.put("9010210133", new Account("Prepaid", "Tushar", 632));
	}

	@Override
	public Account getAccountDetails(String mobileNo) {
		Account account = accountEntry.get(mobileNo);
		return account;
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		Account account = accountEntry.get(mobileNo);
		if(account != null){
			account.setAccountBalance(account.getAccountBalance() + rechargeAmount);
			account.setAccountType(account.getAccountType());
			account.setCustomerName(account.getCustomerName());
			account.setMobileNo(mobileNo);
			accountEntry.put(mobileNo, account);
			return account.getAccountBalance();
		}
		else{
			return 0;
		}
		
	}

}
