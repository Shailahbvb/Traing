package com.training.demo_maven;

import java.util.Scanner;

public class CalculateMath {

	public static void main(String[] args) {
		
		//while(true) {
		Scanner sc = new  Scanner(System.in) ;
		while(true) {
		
		
		System.out.println(" Please Chose the operation to be Performed :"
				+ " Please enter 1 for Addtion \n"
				+ "Please enter 2 for SubStraction\n"
				+"Please enter 3 for Mutliplication\n"
               +"Please enter 4 for divis"
                + "ion\n"
                + "PLease Enter for 0 for exit");
		
		int cal = sc.nextInt();
		if(cal == 0) {
			System.exit(0);
		}
		
		System.out.println("Please enter the variable ");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		
		
		int result = calculationOperations(var1,var2,cal);
		
		System.out.println("Result :"+result);
		//sc.close();
		}

	}

	private static int calculationOperations(int var1, int var2, int cal) {
		
	int Result = 0;
		switch(cal) {
		case 1:
			Result =var1+var2;
			break;
		case 2:
			Result =var1-var2;
			break;
		case 3:
			Result =var1*var2;
			break;
		case 4:
			Result =var1/var2;
			break;
			
			default : 
				System.out.println("please choose correct option for Calculation");
			
		}
		return Result;
	}

}
