package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		methodCatch2();
		
		
		System.out.println("End of program");
	}
	
	public static void methodCatch2() {
		System.out.println("***MethodCatch2 START***");
		methodCatch1();
		System.out.println("***MethodCatch2 END***");
	}
	public static void methodCatch1() {
		System.out.println("***MethodCatch1 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			//e.printStackTrace();
			//sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
		
		
		sc.close();
		System.out.println("***MethodCatch1 END***");
	}
}
