package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account no:");
		accountNo=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		Account account=dao.searchAccount(accountNo);
		if(account!=null) {
			System.out.println("first name="+account.getFirstName());
			System.out.println("last name="+account.getLastName());
			System.out.println("city="+account.getCity());
			System.out.println("state="+account.getState());
			System.out.println("amount="+account.getAmount());
			System.out.println("cheqfacil="+account.getCheqFacil());
			System.out.println("account type="+account.getAccountType());
		} else {
				System.out.println("account not found");
			}
		}
		
	}
	


