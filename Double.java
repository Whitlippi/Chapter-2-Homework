import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kboard = new Scanner (System.in);
		System.out.print ("Enter an integer: ");
		int n = kboard.nextInt();
		System.out.println("2 * " + n + " = " + (n+n));
		System.out.println("If you change (n+n) to n+n you get this:");
		System.out.println("2 * " + n + " = " + n + n);
	} //yes! And there are both a and b in your program, which is okay.

}
