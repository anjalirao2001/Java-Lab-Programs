/**
 * 
 */
package labprogram;
import java.util.Scanner;
/**
 * 		WRITE A JAVA PROGRAM TO FIND THE AREA AND CIRCUMFRENCE OF THE CIRCLE 
 * 		BY ACCEPTING THE RADIUS FROM THE USER.
 */
public class Program3a {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter circle radius : : ");
		double radius = sc.nextDouble();
		System.out.println("Area of Circle :: "+(Math.PI*radius*radius));
		System.out.println("Circumfrence of Circle :: "+(2* Math.PI*radius));
	}

}
