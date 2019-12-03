package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AccountNo=");
		accountNo=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.closeAccount(accountNo));
	}

}
