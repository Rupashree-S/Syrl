package Operators;

public class Logical_bitwise_ex {

	public static void main(String[] args) {
		int x = 40;
		int y = 45;
		//if(++x < 40 && ++y >45)
		//if(++x < 40 & ++y >45)
		//if(++x < 40 || ++y >45)
		if(++x < 40 | ++y >45)
		{
			x++;
		}
		else
		{
			y++;
		}
		System.out.println(x+ " " +y);
	}

}
