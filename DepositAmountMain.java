package com.hcl.bank;

import java.util.Scanner;

public class DepositAmountMain {
	
	public static void main(String[] args) {
		int accountNo,depositAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no=");
		accountNo=sc.nextInt();
		System.out.println("Enter depositamount=");
		depositAmount=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.depositAccount(accountNo, depositAmount));
				
	}

}
