package Assignment1;
import java.util.Scanner;

public class Palindrome {
	public static void main (String[] args)
	{
	int n,a=0,m,x;
	Scanner sr=new Scanner(System.in);
	System.out.println("Enter any number:");
	n=sr.nextInt();
	m=n;
while(n>0)
{
	x=n%10;
	a=a*10+x;
	n=n/10;
}
if(a==m)
{
	System.out.println("True");
}
else
{
	System.out.println("False");
}
	}
}
