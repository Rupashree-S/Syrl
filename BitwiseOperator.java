package Operators;
// &, |,^
public class BitwiseOperator {
 
	public static void main(String[] args) {
	int a = 4;
	int b = 5;
	int c = a|b;//or
	int d = a & b;//and
	int e = a ^ b;//xor
	int f = ~a ;// complement or negation
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	}

}
