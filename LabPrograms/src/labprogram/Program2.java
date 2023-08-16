/**
 * 
 */
package labprogram;

/**
 *		WRITE A JAVA PROGRAM TO LIST THE FACTORIALOF THE NUMBER 1 TO 10.
 *		TO CALCULATE THE FACTORIAL VALUE USE WHILE LOOP 
 *		HINT FACT OF 4 = 4 * 3 * 2 * 1
 */
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1,i=1;
		while(i<10)
		{
			System.out.println(i+"!="+fact+" = "+(fact*i++));
		}
	}

}
