package Project;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length ");
		int l = sc.nextInt();
		System.out.println("enter the breadth ");
        int b = sc.nextInt();
        
        double area = l*b;
        System.out.println("area of rectangle "+area );
	}

}
