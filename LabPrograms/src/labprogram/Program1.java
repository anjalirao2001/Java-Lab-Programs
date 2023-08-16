/**
 * 
 */
package labprogram;

/**
 *	WRITE A JAVA PROGRAM TO PRINT THE FOLLOWING TRIANGLEOF NUMBER
 *	1
 *	1	2
 *	1	2	3
 *	1	2	3	4
 *	1	2	3	4	5
 *
 */
public class Program1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"    ");
			}
			System.out.println();
		}
	}

}
