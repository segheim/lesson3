package lesson3;

import java.util.Scanner;

public class task7 {
	

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int a=sc.nextInt();
		
		if (a%4==0) {
			if (a%100==0) {
				System.out.println("Noleap year! 365 days!");
				
			}else
				System.out.println("Leap year! 366 days!");
		}else 
			System.out.println("Noleap year! 365 days!");
						
	}
}
