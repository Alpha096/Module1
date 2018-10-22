package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.exception.AccountException;
import com.cg.mra.beans.Account;
import com.cg.mra.service.*;



public class MainUI {
	public static void main(String args[]) throws AccountException{
		AccountService service=new AccountServiceImpl();
		Account account = new Account();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("1. Account Balance Enquiry ");
		System.out.println("2. Recharge Account");
		System.out.println("3. Exit");
		System.out.println("Enter Your Choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Mobile No : ");
			String mobile=sc.next();
			account = service.getAccountDetails(mobile);
				if( account!=null)
					System.out.println("Your Current Balance is Rs. " + account.getAccountBalance());
				else
					System.out.println("ERROR: Given Account Id does not exist");
			break;
		
		case 2:
			System.out.println("Enter Mobile No : ");
			String mob =sc.next();
			System.out.println("Enter Recharge Amount : ");
			double amt =sc.nextDouble();
			double recharge = service.rechargeAccount(mob, amt);
			if(recharge == 0)
				System.err.println("ERROR: Cannot Recharge Account as Given Mobile No Does Not Exists");
			else{
				System.out.println("Your Account Recharged Successfully");
				System.out.println("Hello " + account.getCustomerName() + " ,Available Balance is " + account.getAccountBalance());
			}
		break;
		}
		}while(ch!=3);
}
	}
