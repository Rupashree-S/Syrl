package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a = 10 , b = 20 , c= 15 , d = 90 ,e = 55;
 int max = (a>b && a>c && a>d)? a: 
	       (b>a && b>c && b>d)? b:
	       (c>a && c>b && c>d)? c:
	       (d>a && d>b && d>e)? d: e;   
	    	   
 System.out.println("Largest of 5 nos "+max);
	}

}
