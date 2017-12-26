package lesson3;

import java.util.Scanner;

public class lask2 {

	public static void main(String[] args) {
		
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int x = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter number2: ");
		int y = sc1.nextInt();
		
		System.out.println("Number1 = " + x + "\nNumber2 = " + y);
		b=x;
		x=y;
		y=b;
		
		
		System.out.println("Number1 = " + x + "\nNumber2 = " + y);
	}

}
