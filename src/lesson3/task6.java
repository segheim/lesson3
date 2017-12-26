package lesson3;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		if ( a!=0) {
			
			if (a<0) {
				System.out.println("This namber is negative!");
			}
			if (a>0) {
				System.out.println("This number is positive!");
			}
			
				if (Math.abs(a)<10) {
				System.out.println("This number is one-digit number!");
			}
				if (Math.abs(a)>9 & a<100) {
				System.out.println("This number is two-digit number!");
			}
				if(Math.abs(a)>=1000) {
				System.out.println("This number is tree-digit number or more!");
			}
		
		}
			
	}

}
