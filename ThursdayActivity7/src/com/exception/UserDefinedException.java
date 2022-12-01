package com.exception;

import java.util.Scanner;

class AccountBalance extends Exception{
	
	String message;
	 
	public AccountBalance(String message) 
	{
		this.message=message;
	}
	@Override
	public String toString() 
	{
		return message;
	}
}
public class UserDefinedException {
       
	static double current_balance=10000;
	
	public static void main(String[] args)throws AccountBalance {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ammount:");
		int n=sc.nextInt();
		try
		{
			if(current_balance < n) 
			{
				throw new AccountBalance("in your currenr balance is:"+current_balance);
			}
			else
			{
				System.out.println("please take the money:"+n);
			}
		}
			catch(AccountBalance mab)
		     {
				mab.printStackTrace();
			 }
			
		}

	}


