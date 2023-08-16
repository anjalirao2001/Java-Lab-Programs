/**
 * 
 */
package labprogram;
import java.util.Scanner;
/**
 * 		WRITE THE JAVA PROGRAM TO ACCEPT A NUMBER 
 * 		AND FIND WHETHER THE NUMBER IS PRIME OR NOT
 */
public class Program3b 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime ::");
		int n = sc.nextInt();
		int flag = 0, m = n/2;
		if(n!=0 && n!=1)
		{
			for(int i=2; i<=m; i++)
			{
				if(n%i==0)
				{
					flag=1;
				}
			}
		}
		else
		{
			flag=0;
		}
		if(flag == 0)
		{
			System.out.println(n+" is prime no");
		}
		else
		{
			System.out.println(n+" is not prime no");
		}
	}
}
