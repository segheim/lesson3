package lesson3;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		
		int max = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 6 elements of array: ");
		
		int[] mas = new int[6];
		
		for (int i = 0; i < 6; i++) {
			mas[i] = sc.nextInt();
		}
		System.out.print("Array: ");
		
		for (int i = 0; i<mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		for (int i = 0; i<mas.length; i++) {
				if ( max < mas[i] ) {
				max = mas[i];
				}
					
		}
		System.out.println("\nMax number: " + max);
		System.out.print("New array: ");
		
		double[] dmas = new double[6];
		
		for (int i = 0; i < mas.length; i++) {
			
			dmas[i] = (double)mas[i]/max;
			dmas[i] = Math.rint(dmas[i]*100)/100;
			System.out.print(dmas[i] + " ");
			
		}

	}

}
