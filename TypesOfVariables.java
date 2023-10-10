package com.edu;

public class TypesOfVariables {
	int a=20; //instance variable present outside method 
	public static void main(String[] args) {
		int a=10;//local variable

		System.out.println(a);//to access local variable
		
		//classname bojectname = new TyppesOfVariables(); - to access instance variable object needs to be created
		TypesOfVariables ob=new TypesOfVariables();
				System.out.println(ob.a);

	}
}
