/**
 * 
 */
package labprogram;

/**		WRITE A JAVA PROGRAM TO IMPLEMENT INNER CLASS AND DEMONSTRATE ITS
 * 		ACCESS PROTECTION
 */

class Outer
{
	private int outdata=10;
	void display()
	{
		Inner in=new Inner();
		System.out.println("Accessing from outer class");
		System.out.println("Outer Data is "+outdata);
	}
	class Inner
	{
		private int indata=20;
		void inMethod()
		{
			System.out.println("Accessing from inner class");
			System.out.println("The sum of indata and outdata is "+(indata+outdata));
		}
	}
}

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		out.display();
		Outer.Inner in= out.new Inner();
		in.inMethod();
	}

}
