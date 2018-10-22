package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDAO;
import com.cg.mra.dao.AccountDAOImpl;

public class AccountServiceImpl implements AccountService{

	AccountDAO dao;
	public AccountServiceImpl(){
		dao = new AccountDAOImpl();
	}
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		return dao.getAccountDetails(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}

}
