package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 1: ");
		int n1 = in.nextInt();
		boolean isLeap = (n1%4 == 0 && n1%100 != 0) || (n1%400 == 0);
		System.out.println(isLeap);
		// TODO Auto-generated method stub

	}

}
