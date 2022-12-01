package com.password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Generate the security password:");
		String password=sc.next();
		String regex="Abc@#*123],{8}";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(password);
		boolean matchFound=m.find();
		if(matchFound==false)
			System.out.println("security password generated successfully");
		else if(matchFound==true)
			System.out.println("invalid security password, try again!");

	}

}
