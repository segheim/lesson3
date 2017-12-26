package lesson3;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter number2: ");
		int b=sc.nextInt();
		
		
		
		if (a%2==1) {
			System.out.println("Number odd: " + a);
		}else
			
		if (b%2==1) {
			System.out.println("Number odd: " + b);
		}
				

	}

}
