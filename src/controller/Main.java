package controller;

import java.util.Scanner;

import utility.ValidateUser;

public class Main {
	public static void main(String[] args) throws Exception {

	Scanner sc=new Scanner(System.in);
	System.out.println("******************************************************************** ");
	System.out.println( "             WELCOME TO PHARMACY MANAGEMENT SYSTEM                   ");
	System.out.println("******************************************************************** ");
	
	System.out.println();
	ValidateUser validUser=new ValidateUser();
	
	System.out.println("1. LOGIN");
	System.out.println("2. EXIT ");
	int choose=Integer.parseInt(sc.nextLine());
    switch (choose) {
	case 1:
		// Admin Login
		System.out.println("Email :");
		String email=sc.nextLine();
		System.out.println("Password :");
		String password=sc.nextLine();
		if(validUser.validate(email, password)== true) {
			System.out.println("Login success");
			HomePage pl = new HomePage();
			pl.main();
		}
		else {
			System.out.println("Check your email and password");
		}
		
		break;
	case 2: 
		//EXIT
		System.out.println("EXITED SUCCESSFULLY");
		
	default:
		//INVALID INPUT
		break;
	}
	
	
}
}