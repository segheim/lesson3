package lesson3;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		
		int[] mas = new int[7];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 7 elements of array: ");
		
		for (int i = 0; i<mas.length; i++) {
			mas[i] = sc.nextInt();
		}
			
		
		//int mas[] = { -1, -7, 99, -4, 6, 98, -14, 34, -5 };
		 
		for (int i = 0; i < mas.length; i++) {
		
			if (mas[i] > 0) {
				
				System.out.println("First positive number: " + mas[i]);
				System.out.println("Position first positive nuber is: " + (i+1));
				 break;
			 }
		 }		

	}

}
