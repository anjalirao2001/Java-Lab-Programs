/**
 * 
 */
package labprogram;

/**		WRITE A JAVA PROGRAM TO DEMONSTRATE A DIVISION BY ZERO EXCEPTION
 * 
 */
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=5,b=0;
			System.out.println("Quotient"+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("No can't be divided by zero");
		}
	}

}
