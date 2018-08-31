package Assignment1;
import java.util.Scanner;

public class Square {
	public static void main(String args[]){
	
		Scanner sr=new Scanner(System.in);
				int num;
				System.out.println("Enter a number:");
				num=sr.nextInt();
				System.out.println("Square:"+square(num));
	}
	public static int square(int num)
	{
		return num*num;
	}

}
;


