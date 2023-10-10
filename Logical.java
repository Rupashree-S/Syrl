package Operators;

public class Logical {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		/*if(++x < 10 || ++y >15) 1 condition has to be checked here
		                     other becomes optional , if both are false it will go to else*/ 
		if(++x < 10 | ++y >15) //both condition has to checked
		
		{ 
			x++;
		}
		else {
			y++;
		}
		System.out.println(x);
		System.out.println(y);
		}

	}


