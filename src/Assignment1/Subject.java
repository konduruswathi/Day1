package Assignment1;
import java.util.Scanner;
public class Subject {
	public static void main(String args[]) { 
		
		Scanner Sc = new Scanner(System.in);

			System.out.println("Enter the marks of sub1:");
			int s1=Sc.nextInt();
			System.out.println("Enetr the marks of sub2:");
			int s2=Sc.nextInt();
			System.out.println("Enter the marks of sub3:");
			int s3=Sc.nextInt();
			if(s1>60&&s2>60&&s3>60)
			{
				System.out.println("Passed");
			
		}
			else if(s1>60&&s2>60||s2<60&&s3>60||s3>60&&s1>60)
			{
				System.out.println("Promoted");
		}
			else if(s1>60||s2>60||s3>60||s1<60&&s2<60&&s3<60)
			{
				System.out.println("Failed");
			}
	

}
}
