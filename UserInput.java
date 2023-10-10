package com.edu;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter first no ");
	 int a=sc.nextInt();//next int predefined method
	 System.out.println("enter Second no ");
	 int b=sc.nextInt();
	 int c = a*b;
	 System.out.println("Multiplication of 2 no "+c);
	}

}
