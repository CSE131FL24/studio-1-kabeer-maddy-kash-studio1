package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 1: ");
		int n1 = in.nextInt();
		System.out.print("Enter value for arg 2: ");
		int n2 = in.nextInt();
		
		System.out.println((n1 + n2)/2.0);
		

	}

}
